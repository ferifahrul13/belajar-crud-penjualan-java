/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBarang;
import DAO.DAOPembelian;
import DAO.DAOSupplier;
import DAOImpl.DAOImplBarang;
import DAOImpl.DAOImplPembelian;
import DAOImpl.DAOImplSupplier;
import Model.MBarang;
import Model.MPembelian;
import Model.MSupplier;
import TabelModel.TMBarang;
import TabelModel.TMPembelian;
import TabelModel.TMSupplier;
import View.JFPembelian;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ferifahrul
 */
public class CPembelian {
    
    JFPembelian  beli;
    DAOPembelian  impl;
    List<MPembelian> list;
    
    List<MSupplier> ls;
    DAOSupplier supplier;
    
    DAOBarang barang;
    List<MBarang> lb;
    
    DefaultTableModel dtm;
    
    public CPembelian(JFPembelian Beli)
    {
        this.beli = Beli;
        impl      = new DAOImplPembelian();
        supplier  = new DAOImplSupplier();
        barang    = new DAOImplBarang();
    }
    
    public void isiTabelPembelian()
    {
        list = impl.GetAll();
        TMPembelian tmp = new TMPembelian(list);
        beli.getDataTable().setModel(tmp);
    }
    
    public void isiTabelSupplier()
    {
        ls = supplier.GetAll();
        TMSupplier tms = new TMSupplier(ls);
        beli.getDataTableSupplier().setModel(tms);
    }
    
    public void isiTableBarang()
    {
        lb = barang.GetAll();
        TMBarang tmb = new TMBarang(lb);
        beli.getDataTableBarang().setModel(tmb);
    }
    
    public void searchKobar(String Keyword)
    {
        lb = barang.Search(Keyword); 
        TMBarang tmb = new TMBarang(lb);
        beli.getDataTableBarang().setModel(tmb);
        
    }
    
    public void searchKosup(String Keyword)
    {
        ls = supplier.Search(Keyword);
        TMSupplier tms = new TMSupplier(ls);
        beli.getDataTableSupplier().setModel(tms);
        
    }
    
    public void BuatTabelKeranjang()
    {
        dtm = new DefaultTableModel();
        //membuat nama colom tabel
        dtm.addColumn("Tanggal");
        dtm.addColumn("Kode Supplier");
        dtm.addColumn("Kode Barang");
        dtm.addColumn("Jumlah");
        dtm.addColumn("Harga");
        beli.getDataTableKeranjang().setModel(dtm);
        
        //mengatur lebar kolom
        beli.getDataTableKeranjang().setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        beli.getDataTableKeranjang().getColumnModel().getColumn(0).setMinWidth(0);
        beli.getDataTableKeranjang().getColumnModel().getColumn(0).setPreferredWidth(100);
        beli.getDataTableKeranjang().getColumnModel().getColumn(1).setPreferredWidth(100);
        beli.getDataTableKeranjang().getColumnModel().getColumn(2).setPreferredWidth(100);
        beli.getDataTableKeranjang().getColumnModel().getColumn(3).setPreferredWidth(60);
        beli.getDataTableKeranjang().getColumnModel().getColumn(4).setPreferredWidth(85);
    }
    
    public void TmbKeranjang()
    {
        if(beli.getKobar().getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Anda belum memilih kode barang");
            
        }else{
            
            //validasi untuk barang yang sama
            for(int x=0; x<beli.getDataTableKeranjang().getRowCount();x++)
            {
                if(beli.getKobar().getText().equals(beli.getDataTableKeranjang().getValueAt(x,2)))
                {
                    JOptionPane.showMessageDialog(null, "Kode barang tidak boleh sama, Tambahkan saja jumlahnya!");
                    
                    return;
                }
                
            }
            
            if(beli.getDataTableKeranjang().getRowCount() == 0)
            {
                BuatTabelKeranjang();
            }
            
            Object[] k = new Object[5];
            
            k[0] = beli.getTanggal().getText();
            k[1] = beli.getKosup().getText();
            k[2] = beli.getKobar().getText();
            k[3] = beli.getJumlah().getText();
            k[4] = beli.getHarga().getText();
            
            dtm.addRow(k);
        }
    }
    
    public void HpsKeranjang()
    {
        if(beli.getDataTableKeranjang().getRowCount() != 0)
        {
            dtm.removeRow(beli.getDataTableKeranjang().getSelectedRow());
        }
    }
    
    public void simpan(JFPembelian data)
    {
        if(data.getDataTableKeranjang().getModel().getRowCount() > 0)
        {
            for(int i=0; i<data.getDataTableKeranjang().getModel().getRowCount(); i++)
            {
                MPembelian mp = new MPembelian();
                
                mp.setTanggal(data.getDataTableKeranjang().getValueAt(i,0).toString());
                mp.setKosup(data.getDataTableKeranjang().getValueAt(i,1).toString());
                mp.setKobar(data.getDataTableKeranjang().getValueAt(i,2).toString());
                mp.setJumlah(data.getDataTableKeranjang().getValueAt(i,3).toString());
                mp.setHarga(data.getDataTableKeranjang().getValueAt(i,4).toString());
                
                mp.setTotal(
                  Integer.toString(
                          Integer.parseInt(data.getDataTableKeranjang().getValueAt(i,3).toString())
                          *
                          Integer.parseInt(data.getDataTableKeranjang().getValueAt(i,4).toString())
                  )
                );
                
                impl.simpan(mp);
            }
        
        }
        
        BuatTabelKeranjang();
    }
    
    
}
