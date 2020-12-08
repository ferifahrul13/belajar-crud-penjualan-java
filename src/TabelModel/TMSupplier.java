/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Model.MSupplier;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ferifahrul
 */
public class TMSupplier extends AbstractTableModel{
    
    List<MSupplier> list;
    
    
    public TMSupplier(List<MSupplier> lis){
        this.list = lis;
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getKode();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getAlamat();
            case 3 : return list.get(rowIndex).getHP();
            default : return null;

        }
    }
    
    @Override
    public String getColumnName(int column) {
        
        switch(column){
            case 0 : return "Kode Supplier";
            case 1 : return "Nama SUpplier";
            case 2 : return "Alamat";
            case 3 : return "HP";
            default : return null;

        }
    }
    
    
}
