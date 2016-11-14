/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcrud.controller.table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import testcrud.model.Pegawai;

/**
 *
 * @author cvgs
 */
public class PegawaiTable extends AbstractTableModel{
    public List<Pegawai> list = new ArrayList<Pegawai>();

    public Pegawai getList(int i) {
        return list.get(i);
    }

    public void setList(List<Pegawai> list) {
        this.list = list;
        fireTableDataChanged();
    }
 
    public void save(Pegawai pegawai){
        list.add(pegawai);
        fireTableDataChanged();
    }
    
    public void update(int i,Pegawai pegawai){
        list.set(i, pegawai);
        fireTableDataChanged();
    }
    
    public void delete(int i){
        list.remove(i);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
           case 0 : return list.get(rowIndex).getKodePegawai();
           case 1 : return list.get(rowIndex).getNamaPegawai();
           default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {
        switch(column){
           case 0 : return "Kode Pegawai";
           case 1 : return "Nama Pegawai";
           default: return null;
       }
    }
}
