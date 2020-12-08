/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Model.MBarang;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferifahrul
 */
public class TMBarang extends AbstractTableModel{
    
    List<MBarang> list;
    
    
    public TMBarang(List<MBarang> lis){
        this.list = lis;
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getKode();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getHarga();
            case 3 : return list.get(rowIndex).getJumlah();
            case 4 : return list.get(rowIndex).getKeterangan();
            default : return null;

        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column){
            case 0 : return "Kode Barang";
            case 1 : return "Nama Barang";
            case 2 : return "Harga";
            case 3 : return "Jumlah";
            case 4 : return "Keterangan";
            default : return null;

        }
    }
    
    
}
