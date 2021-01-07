/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabelModel;

import Model.MPenjualan;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ferifahrul
 */
public class TMPenjualan extends AbstractTableModel {
    
    List<MPenjualan> list;
    
    public TMPenjualan(List<MPenjualan> lis)
    {
        this.list = lis;
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int ColumnIndex)
    {
        switch(ColumnIndex)
        {
            case  0 : return list.get(rowIndex).getTanggal();
            case  1 : return list.get(rowIndex).getKopel();
            case  2 : return list.get(rowIndex).getKobar();
            case  3 : return list.get(rowIndex).getTanggal();
            case  4 : return list.get(rowIndex).getHarga();
            default :  return null;
            
        }
    }
    
    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0 : return "Tanggal";
            case 1 : return "Kode Supplier";
            case 2 : return"Kode Barang";
            case 3 : return "Jumlah";
            case 4 : return "Harga";
            default : return null;
        }
    }
    
}
