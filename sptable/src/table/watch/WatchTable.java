/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table.watch;

import javax.swing.table.AbstractTableModel;
import table.data.TSPData;

/**
 *
 * @author jiche
 */
public class WatchTable extends AbstractTableModel {

    private final String[] name = new String[]{"波长", "原始值"};
    private final WatchNodeList watchbean = new WatchNodeList();

    public void SetTableValueName(String name) {
        this.name[1] = name;
        this.watchbean.SetValueName(name);
        this.fireTableStructureChanged();
    }

    public void Update(TSPData data) {
        if (data != null) {
            this.watchbean.UpdateValue(data.waveIndex, data.datavalue);
        }
        this.fireTableDataChanged();
    }

    public WatchNodeList GetWatchBean() {
        return this.watchbean;
    }

    // <editor-fold defaultstate="collapsed" desc="Table接口">
    @Override
    public String getColumnName(int column) {
        return name[column];
    }

    @Override
    public int getRowCount() {
        return this.watchbean.GetNodes().length;
    }

    @Override
    public int getColumnCount() {
        return this.name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        WatchNode node = this.watchbean.GetNodes()[rowIndex];
        switch (columnIndex) {
            case 0:
                return node.GetNmValue();
            case 1:
                return node.GetCurrentValue();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    // </editor-fold>    

}
