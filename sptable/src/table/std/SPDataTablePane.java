/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package table.std;

import table.watch.WatchTable;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import table.data.TSPData;
import table.watch.WatchPointPane;

/**
 *
 * @author jiche
 */
public class SPDataTablePane extends javax.swing.JPanel {

//    private JSplitPane chartAnddataSplit;
    /**
     * Creates new form DataPane
     */
    public SPDataTablePane() {
        initComponents();

        /*初始化控件*/
        this.InitCommonComponent();

        /* 初始化语言 */
        this.IniLanguage();
    }

    private void InitCommonComponent() {
        //设置窗口ICON
        this.Icon_InternalFrame.setFrameIcon(null);

        //初始化SPData表格
        this.InitNodeWaveTable();
        //初始化SPData表格
        this.InitWatchTable();

        //设置窗口比例
        chartAnddataSplit.setResizeWeight(0.8);

        this.chartAnddataSplit.setRightComponent(null);

    }

    // <editor-fold defaultstate="collapsed" desc="初始化语言包"> 
    private void IniLanguage() {
        //按钮提示信息
        ToggleButton_EnableWatch.setToolTipText("波长点数据监测");
        Button_wadd.setToolTipText("添加监测点");
        Button_wremove.setToolTipText("删除监测点");
        Button_save.setToolTipText("导出Excel");

        //刷新表格
//                stdmodel.fireTableStructureChanged();
//                watchmodel.fireTableStructureChanged();            
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="刷新数据"> 
    //刷新数据
    public void UpdateData(TSPData data) {
        //刷新数据
        this.watchmodel.Update(data);
        if (data == null) {
            //清除数据
            this.watchmodel.GetWatchBean().Clear();
        } else {
            this.stdmodel.Update(data);
        }
        //跟新列宽
        JTableHeader header = nodeandwaveTable.getTableHeader();
        TableColumn column = nodeandwaveTable.getColumnModel().getColumn(0);
        header.setResizingColumn(column); // 名称
        column.setWidth(45);
    }
    // </editor-fold>   

    // <editor-fold defaultstate="collapsed" desc="设置标题和第三列标题"> 
    public void SetTitle(String name, String valuename) {
        this.Icon_InternalFrame.setTitle(name);
        this.stdmodel.SetValueName(valuename);
        this.watchmodel.SetTableValueName(valuename);
        this.updateUI();
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="清除列表"> 
    public void ClearTable() {
        this.watchmodel.Update(null);
        this.watchmodel.GetWatchBean().Clear();
    }
    // </editor-fold>   

    // <editor-fold defaultstate="collapsed" desc="光谱数据表格"> 
    private SPDataTable stdmodel = new SPDataTable();

    private void InitNodeWaveTable() {
        //初始化SPData表格
        this.nodeandwaveTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, isFocus, row, column);

                if (isSelected) {
                    setBackground(new Color(135, 206, 250, 100));
                } else {
                    if ((row + 1) % 2 == 0) {
                        //偶数行时的颜色
                        setBackground(Color.WHITE);
                    } else if ((row + 1) % 2 == 1) {
                        //设置单数行的颜色
                        setBackground(new Color(192, 192, 192, 140));
                    }
                }

                return cell;
            }
        });

        stdmodel = new SPDataTable();
        this.nodeandwaveTable.setModel(stdmodel);
//

    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="观察数据表格"> 
    private WatchTable watchmodel = new WatchTable();

    private void InitWatchTable() {
        //初始化过滤窗口
        this.watch_table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean isFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, isFocus, row, column);

                if (isSelected) {
                    setBackground(new Color(135, 206, 250, 100));
                } else {
                    if ((row + 1) % 2 == 0) {
                        //偶数行时的颜色
                        setBackground(Color.WHITE);
                    } else if ((row + 1) % 2 == 1) {
                        //设置单数行的颜色
                        setBackground(new Color(192, 192, 192, 140));
                    }
                }

                return cell;
            }
        });
        this.watch_table.getTableHeader().setReorderingAllowed(false);
        this.watch_table.getTableHeader().setResizingAllowed(false);
        this.watch_table.setModel(watchmodel);
        this.watch_table.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

        this.Button_wadd.setVisible(false);
        this.Button_wremove.setVisible(false);
        this.Button_save.setVisible(false);
    }
// </editor-fold>  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Icon_InternalFrame = new javax.swing.JInternalFrame();
        ToggleButton_EnableWatch = new javax.swing.JToggleButton();
        Button_wadd = new javax.swing.JButton();
        Button_wremove = new javax.swing.JButton();
        Button_save = new javax.swing.JButton();
        chartAnddataSplit = new javax.swing.JSplitPane();
        watchpane = new javax.swing.JScrollPane();
        watch_table = new javax.swing.JTable();
        nodewavepane = new javax.swing.JScrollPane();
        nodeandwaveTable = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(264, 300));
        setName(""); // NOI18N
        setOpaque(false);

        Icon_InternalFrame.setToolTipText("");
        Icon_InternalFrame.setFont(new java.awt.Font("微软雅黑", 0, 15)); // NOI18N
        Icon_InternalFrame.setName(""); // NOI18N
        Icon_InternalFrame.setVisible(true);

        ToggleButton_EnableWatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nexus/table/resource/watch_data.png"))); // NOI18N
        ToggleButton_EnableWatch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ToggleButton_EnableWatchItemStateChanged(evt);
            }
        });

        Button_wadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nexus/table/resource/watch_add.png"))); // NOI18N
        Button_wadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_waddActionPerformed(evt);
            }
        });

        Button_wremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nexus/table/resource/watch_remove.png"))); // NOI18N
        Button_wremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_wremoveMouseClicked(evt);
            }
        });

        Button_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nexus/table/resource/watch_write.png"))); // NOI18N
        Button_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_saveMouseClicked(evt);
            }
        });

        chartAnddataSplit.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        chartAnddataSplit.setResizeWeight(0.8);

        watch_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        watchpane.setViewportView(watch_table);

        chartAnddataSplit.setRightComponent(watchpane);

        nodeandwaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        nodewavepane.setViewportView(nodeandwaveTable);

        chartAnddataSplit.setLeftComponent(nodewavepane);

        javax.swing.GroupLayout Icon_InternalFrameLayout = new javax.swing.GroupLayout(Icon_InternalFrame.getContentPane());
        Icon_InternalFrame.getContentPane().setLayout(Icon_InternalFrameLayout);
        Icon_InternalFrameLayout.setHorizontalGroup(
            Icon_InternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Icon_InternalFrameLayout.createSequentialGroup()
                .addComponent(ToggleButton_EnableWatch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Button_wadd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Button_wremove, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
            .addComponent(chartAnddataSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        Icon_InternalFrameLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Button_save, Button_wadd, Button_wremove, ToggleButton_EnableWatch});

        Icon_InternalFrameLayout.setVerticalGroup(
            Icon_InternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Icon_InternalFrameLayout.createSequentialGroup()
                .addComponent(chartAnddataSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Icon_InternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ToggleButton_EnableWatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_wadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_wremove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button_save)))
        );

        Icon_InternalFrameLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Button_save, Button_wadd, Button_wremove, ToggleButton_EnableWatch});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon_InternalFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Icon_InternalFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    //使能观测点
    private void ToggleButton_EnableWatchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ToggleButton_EnableWatchItemStateChanged
        if (this.ToggleButton_EnableWatch.isSelected()) {
            this.chartAnddataSplit.setRightComponent(this.watch_table);
            this.Button_wadd.setVisible(true);
            this.Button_wremove.setVisible(true);
            this.Button_save.setVisible(true);
        } else {
            WatchTable table = (WatchTable) this.watch_table.getModel();
            table.GetWatchBean().Clear();
            //table.
            this.chartAnddataSplit.setRightComponent(null);
            this.Button_wadd.setVisible(false);
            this.Button_wremove.setVisible(false);
            this.Button_save.setVisible(false);
        }
    }//GEN-LAST:event_ToggleButton_EnableWatchItemStateChanged

    //添加观测点
    private void Button_wremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_wremoveMouseClicked
        int index = watch_table.getSelectedRow();
        ((WatchTable) watch_table.getModel()).GetWatchBean().RemoveIndex(index);
        this.watch_table.updateUI();
    }//GEN-LAST:event_Button_wremoveMouseClicked

    //删除观测点
    private void Button_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_saveMouseClicked
        if (((WatchTable) watch_table.getModel()).GetWatchBean().GetNodes().length == 0) {
            return;
        }

        File file = TableFileDialogHelp.GetFilePath(".xls");
        if (file != null) {
            ((WatchTable) watch_table.getModel()).GetWatchBean().ExportToExcel(file.getAbsolutePath());
        }
    }//GEN-LAST:event_Button_saveMouseClicked

    private void Button_waddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_waddActionPerformed
        WatchPointPane npoint = new WatchPointPane(null, true);
        npoint.setLocationRelativeTo(this.Button_wadd);
        npoint.setVisible(true);
        if (!npoint.GetWatchNode().isNaN()) {
            ((WatchTable) watch_table.getModel()).GetWatchBean().AddWatchNode(npoint.GetWatchNode().doubleValue());
            this.watch_table.updateUI();
        }
    }//GEN-LAST:event_Button_waddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_save;
    private javax.swing.JButton Button_wadd;
    private javax.swing.JButton Button_wremove;
    private javax.swing.JInternalFrame Icon_InternalFrame;
    private javax.swing.JToggleButton ToggleButton_EnableWatch;
    private javax.swing.JSplitPane chartAnddataSplit;
    private javax.swing.JTable nodeandwaveTable;
    private javax.swing.JScrollPane nodewavepane;
    private javax.swing.JTable watch_table;
    private javax.swing.JScrollPane watchpane;
    // End of variables declaration//GEN-END:variables
}
