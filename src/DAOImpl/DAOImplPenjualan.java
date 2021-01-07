/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Config.Koneksi;
import DAO.DAOPenjualan;
import Model.MPenjualan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferifahrul
 */
public class DAOImplPenjualan implements DAOPenjualan {

    Connection kon;

    @Override
    public List<MPenjualan> GetAll() {
        kon = new Koneksi().connection();
        List<MPenjualan> lp = null;

        try {
            lp = new ArrayList<MPenjualan>();
            String sql = "select * from penjualan order by id asc";
            PreparedStatement ps = kon.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                MPenjualan mp = new MPenjualan();
                mp.setTanggal(rs.getString("tanggal"));
                mp.setKopel(rs.getString("kopel"));
                mp.setKobar(rs.getString("kobar"));
                mp.setJumlah(rs.getString("jumlah"));
                mp.setHarga(rs.getString("harga"));

                lp.add(mp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lp;

    }

    @Override
    public void simpan(MPenjualan data) {
        kon = new Koneksi().connection();
        String tanggal = data.getTanggal();
        String kopel = data.getKopel();
        String kobar = data.getKobar();
        String jumlah = data.getJumlah();
        String harga = data.getHarga();
        String total = data.getTotal();

        //simpan transaksi
        try {
            String sql = "insert into penjualan (tanggal,kopel,kobar,jumlah,harga,total) values (?,?,?,?,?,?)";

            PreparedStatement ps = kon.prepareStatement(sql);
            ps.setString(1, tanggal);
            ps.setString(2, kopel);
            ps.setString(3, kobar);
            ps.setString(4, jumlah);
            ps.setString(5, harga);
            ps.setString(6, total);

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //update barang
        try {
            String sql = "update barang set harga=?,jumlah=jumlah-? where kobar=?";
            PreparedStatement ps = kon.prepareStatement(sql);

            ps.setString(1, harga);
            ps.setString(2, jumlah);
            ps.setString(3, kobar);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
