
package Controller;

import DAO.DAOBarang;
import DAOImpl.DAOImplBarang;
import Model.MBarang;
import View.JFBarang;
import javax.swing.JOptionPane;
import TabelModel.TMBarang;
import java.util.List;


/**
 *
 * @author ferifahrul
 */
public class CBarang
{
    
    JFBarang barang;
    DAOBarang impl;
    List<MBarang> list;
    MBarang u;
    
    public CBarang(JFBarang barang)
    {
     this.barang = barang;
     impl = new DAOImplBarang();
    }
    
    public void insert(JFBarang data)
    {
     if(!data.getKode().getText().isEmpty() &&
             !data.getNama().getText().isEmpty() &&
             !data.getKeterangan().getText().isEmpty()
             )
     {
        u = new MBarang(data.getKode().getText(), data.getNama().getText(), 0.0, 0, data.getKeterangan().getText());
        
        impl.insert(u);
        
        JOptionPane.showMessageDialog(data, "data Barang berhasil disimpan!",
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        
     }else{
         JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                 "Pesan Kesalahan",JOptionPane.WARNING_MESSAGE);
     }   
    }
    
    public void update(JFBarang data)
    {
     if(!data.getKode().getText().isEmpty() &&
             !data.getNama().getText().isEmpty() &&
             !data.getKeterangan().getText().isEmpty()
             )
     {
        u = new MBarang(data.getKode().getText(), data.getNama().getText(), 0.0, 0, data.getKeterangan().getText());
        
        impl.update(u);
        
        JOptionPane.showMessageDialog(data, "data Barang berhasil diperbaharui!",
                "Sukses",JOptionPane.INFORMATION_MESSAGE);
        
     }else{
         JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                 "Pesan Kesalahan",JOptionPane.WARNING_MESSAGE);
     }   
    }
    
    public void delete(String kode)
    {
        impl.delete(kode);
    }
    
    public void isiTabel() {
        
        list = impl.GetAll();
        TMBarang tmb = new TMBarang(list);
        barang.getDataTable().setModel(tmb);
    }
    
}
