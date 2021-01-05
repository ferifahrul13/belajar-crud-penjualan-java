/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Model.MPetugas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferifahrul
 */
public class TMPetugas extends AbstractTableModel{
    
    List<MPetugas> list;
    
    
    public TMPetugas(List<MPetugas> lis){
        this.list = lis;
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getKode();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getAlamat();
            case 3 : return list.get(rowIndex).getJenisKelamin();
            case 4 : return list.get(rowIndex).getHP();
            case 5 : return list.get(rowIndex).getPass();

            default : return null;

        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column){
            case 0 : return "Kode Petugas";
            case 1 : return "Nama Petugas";
            case 2 : return "Alamat";
            case 3 : return "Jenis Kelamin";
            case 4 : return "Handphone";
            case 5 : return "Pass";


            default : return null;

        }
    }
    
    
}
