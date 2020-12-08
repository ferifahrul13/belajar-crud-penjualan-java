/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOSupplier;
import DAOImpl.DAOImplSupplier;
import Model.MSupplier;
import TabelModel.TMSupplier;
import View.JFSupplier;
import javax.swing.JOptionPane;
import java.util.List;


/**
 *
 * @author ferifahrul
 */
public class CSupplier {

    JFSupplier supplier;
    List<MSupplier> list;
    DAOSupplier impl;

    public CSupplier(JFSupplier supplier) {
        this.supplier = supplier;
        impl = new DAOImplSupplier();
    }

    public void insert(JFSupplier data) {
        if (!data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()) {

            MSupplier u = new MSupplier();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setHP(data.getHP().getText().trim());

            impl.insert(u);

            JOptionPane.showMessageDialog(data, "Data Supplier Berhasil disimpan!",
                    "Sukses!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                    "Pesan Kesalahan", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void update(JFSupplier data) {
        if (!data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()) {

            MSupplier u = new MSupplier();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setHP(data.getHP().getText().trim());

            impl.update(u);

            JOptionPane.showMessageDialog(data, "Data Supplier Berhasil perbaharui!",
                    "Sukses!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                    "Pesan Kesalahan", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void delete(String kode)
    {
        impl.delete(kode);
    }
    
    
    public void isiTabel() {
        
        list = impl.GetAll();
        TMSupplier tms = new TMSupplier(list);
        supplier.getDataTable().setModel(tms);
    }
    
    public void search(String Keyword)
    {
        list = impl.Search(Keyword);
        TMSupplier tms = new TMSupplier(list);
        supplier.getDataTable().setModel(tms);
    }

}
