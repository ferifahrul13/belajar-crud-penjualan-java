/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPelanggan;
import DAOImpl.DAOImplPelanggan;
import Model.MPelanggan;
import TabelModel.TMPelanggan;
import View.JFPelanggan;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 * @author ferifahrul
 */
public class CPelanggan {
    
    JFPelanggan pelanggan;
    List<MPelanggan> list;
    DAOPelanggan impl;

    public CPelanggan(JFPelanggan pelanggan) {
        this.pelanggan = pelanggan;
        impl = new DAOImplPelanggan();
    }

    public void insert(JFPelanggan data) {
        if (!data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()
                && !data.getJenisKelamin().getText().trim().isEmpty()
                ) {

            MPelanggan u = new MPelanggan();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setHP(data.getHP().getText().trim());
            u.setJenisKelamin(data.getJenisKelamin().getText().trim());

            impl.insert(u);

            JOptionPane.showMessageDialog(data, "Data Pelanggan Berhasil disimpan!",
                    "Sukses!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                    "Pesan Kesalahan", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void update(JFPelanggan data) {
        if (!data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()
                && !data.getJenisKelamin().getText().trim().isEmpty()
                ) {

            MPelanggan u = new MPelanggan();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setHP(data.getHP().getText().trim());
            u.setJenisKelamin(data.getJenisKelamin().getText().trim());

            impl.update(u);

            JOptionPane.showMessageDialog(data, "Data Pelanggan Berhasil perbaharui!",
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
        TMPelanggan tms = new TMPelanggan(list);
        pelanggan.getDataTable().setModel(tms);
    }
    
    public void search(String Keyword)
    {
        list = impl.Search(Keyword);
        TMPelanggan tms = new TMPelanggan(list);
        pelanggan.getDataTable().setModel(tms);
    }

}
