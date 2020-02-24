/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.std;

import javax.swing.table.AbstractTableModel;
import table.data.TSPData;

/**
 *
 * @author Administrator
 */
public class SPDataTable extends AbstractTableModel {

    private final String[] name = new String[]{"像素", "波长", "原始值"};
    private TSPData data = new TSPData(new double[]{}, new double[]{});

    //设置第三参数的名称
    public void SetValueName(String name) {
        this.name[2] = name;
        this.fireTableStructureChanged();
    }

    //刷新数据
    public void Update(TSPData data) {
        if (data == null) {
            //清空
            this.data = new TSPData(new double[]{}, new double[]{});
        } else {
            this.data = data;
        }
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }

    @Override
    public int getRowCount() {
        if (data == null) {
            return 0;
        }
        return data.pixelIndex.length;
    }

    @Override
    public int getColumnCount() {
        return this.name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (data == null) {
            return null;
        }
        switch (columnIndex) {
            case 0:
                return (int)data.pixelIndex[rowIndex];
            case 1:
                return data.waveIndex[rowIndex];
            case 2:
                return String.valueOf(data.datavalue[rowIndex]);
            default:
                return null;
        }
    }
};
