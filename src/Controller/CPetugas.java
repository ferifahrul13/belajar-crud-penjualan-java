/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOPetugas;
import DAOImpl.DAOImplPetugas;
import Model.MPetugas;
import TabelModel.TMPetugas;
import View.JFPetugas;
import javax.swing.JOptionPane;
import java.util.List;


/**
 *
 * @author ferifahrul
 */
public class CPetugas {

    JFPetugas petugas;
    List<MPetugas> list;
    DAOPetugas impl;

    public CPetugas(JFPetugas petugas) {
        this.petugas = petugas;
        impl = new DAOImplPetugas();
    }

    public void insert(JFPetugas data) {
        if (
                   !data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getJenisKelamin().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()
                && !data.getPass().getText().trim().isEmpty()

                ) {

            MPetugas u = new MPetugas();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setJenisKelamin(data.getJenisKelamin().trim());
            u.setHP(data.getHP().getText().trim());
            u.setPass(data.getPass().getText().trim());


            impl.insert(u);

            JOptionPane.showMessageDialog(data, "Data Petugas Berhasil disimpan!",
                    "Sukses!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(data, "Jangan Kosongkan Inputan!",
                    "Pesan Kesalahan", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void update(JFPetugas data) {
        if (
                  !data.getKode().getText().trim().isEmpty()
                && !data.getNama().getText().trim().isEmpty()
                && !data.getAlamat().getText().trim().isEmpty()
                && !data.getJenisKelamin().trim().isEmpty()
                && !data.getHP().getText().trim().isEmpty()
                && !data.getPass().getText().trim().isEmpty()

                ) {

            MPetugas u = new MPetugas();
            u.setKode(data.getKode().getText());
            u.setNama(data.getNama().getText().trim());
            u.setAlamat(data.getAlamat().getText().trim());
            u.setJenisKelamin(data.getJenisKelamin().trim());
            u.setHP(data.getHP().getText().trim());
            u.setPass(data.getPass().getText().trim());

            impl.update(u);

            JOptionPane.showMessageDialog(data, "Data Petugas Berhasil perbaharui!",
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
        TMPetugas tmp = new TMPetugas(list);
        petugas.getDataTable().setModel(tmp);
    }
    
    public void search(String Keyword)
    {
        list = impl.Search(Keyword);
        TMPetugas tmp = new TMPetugas(list);
        petugas.getDataTable().setModel(tmp);
    }

}
