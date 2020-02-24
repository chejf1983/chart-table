/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.watch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import nahon.comm.exl2.XlsSheetWriter;
import nahon.comm.exl2.xlsTable_W;
import nahon.comm.faultsystem.LogCenter;

/**
 *
 * @author Administrator
 */
public class WatchNodeList {

    // <editor-fold defaultstate="collapsed" desc="数据刷新">
    //数据锁
    private final ReentrantLock nodeslock = new ReentrantLock();
    //数据精度
    private int precision = 2;

    //设置数据精度
    public void SetPrec(int num) {
        this.precision = num;
    }

    //刷新点值
    public void UpdateValue(double[] nm, double[] value) {
        this.nodeslock.lock();

        try {
            for (WatchNode node : GetNodes()) {
                //最小二项式预测法
                double predict = Newton.Newton_inter_method(nm, value, new double[]{node.GetNmValue()})[0];
                predict = new BigDecimal(predict).setScale(precision, BigDecimal.ROUND_HALF_UP).doubleValue();
                //刷新节点数据
                node.UpdateCurrentValue(predict);
            }
        } finally {
            this.nodeslock.unlock();
        }
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="观察点">
    //观察节点组
    private ArrayList<WatchNode> nodes = new ArrayList();

    //获取观察节点
    public WatchNode[] GetNodes() {
        return this.nodes.toArray(new WatchNode[0]);
    }

    //添加观察节点
    public void AddWatchNode(double nm) {
        //上锁
        nodeslock.lock();
        try {
            //检查节点是否已经存在
            for (WatchNode node : nodes) {
                if (node.GetNmValue() == nm) {
                    return;
                }
            }
            //添加新节点
            this.nodes.add(new WatchNode(nm));
        } finally {
            nodeslock.unlock();
        }
    }

    //删除节点
    public void RemoveIndex(int index) {
        nodeslock.lock();
        try {
            //检查序号是否合法
            if (index >= 0 && index < this.nodes.size()) {
                nodes.remove(index);
            }
        } finally {
            nodeslock.unlock();
        }
    }

    //清除所有节点
    public void Clear() {
        nodeslock.lock();
        try {
            nodes.clear();
        } finally {
            nodeslock.unlock();
        }
    }
    // </editor-fold>     

    // <editor-fold defaultstate="collapsed" desc="观察点数据名称"> 
    private String valuename = "Original";

    public void SetValueName(String name) {
        this.valuename = name;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="转EXCEL表格">
    public void ExportToExcel(String filename) {
        nodeslock.lock();
        try (XlsSheetWriter sheet = XlsSheetWriter.CreateSheet(filename, "历史记录")) {
            //获取观察点EXCEL表格
            xlsTable_W history_table = sheet.CreateNewTable("历史记录",
                    this.nodes.size(),
                    XlsSheetWriter.DirecTion.Horizontal,
                    "波长(nm)",
                    this.valuename);

            //添加行数据
            for (int i = 0; i < this.nodes.size(); i++) {
                history_table.WriterLine(this.nodes.get(i).GetNmValue(), this.nodes.get(i).GetCurrentValue());
            }
            history_table.Finish();

            //获取所有节点历史数据表格
            for (int i = 0; i < this.nodes.size(); i++) {
                Double[] history = this.nodes.get(i).GetHistory();
                //创建EXCEL空表
                xlsTable_W h_table = sheet.CreateNewTable("波长" + "[" + this.nodes.get(i).GetNmValue() + "]",
                        history.length, XlsSheetWriter.DirecTion.Horizontal,
                        this.valuename                );

                //添加行数据
                for (Double history1 : history) {
                    h_table.WriterLine(history1);
                }
                h_table.Finish();
                this.nodes.get(i).ClearHistory();
            }

        } catch (Exception ex) {
            LogCenter.Instance().SendFaultReport(Level.SEVERE, "保存数据失败", ex);
        } finally {
            nodeslock.unlock();
        }
    }
    // </editor-fold>
}
