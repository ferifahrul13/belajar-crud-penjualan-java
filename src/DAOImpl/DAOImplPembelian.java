/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Config.Koneksi;
import DAO.DAOPembelian;
import Model.MPembelian;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferifahrul
 */
public class DAOImplPembelian implements DAOPembelian{
    
    Connection kon;
    
    @Override
    public List<MPembelian> GetAll()
    {
        kon = new Koneksi().connection();
        List<MPembelian> lp = null;
        
        try {
            
            lp = new ArrayList<MPembelian>();
            String sql = "select * from pembelian order by id asc";
            PreparedStatement ps = kon.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            while(rs.next())
            {
                MPembelian mp = new MPembelian();
                mp.setTanggal(rs.getString("tanggal"));
                mp.setKosup(rs.getString("kosup"));
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
    public void simpan(MPembelian data)
    {
        kon = new Koneksi().connection();
        
        String tanggal  = data.getTanggal();
        String kosup    = data.getKosup();
        String kobar    = data.getKobar();
        String jumlah   = data.getJumlah();
        String harga    = data.getHarga();
        String total    = data.getTotal();
        
        
        //simpan transaksi
        try {
            String sql = "insert into pembelian (tanggal,kosup,kobar,jumlah,harga,total) values (?,?,?,?,?,?)";
            
            PreparedStatement ps = kon.prepareStatement(sql);
            ps.setString(1, tanggal);
            ps.setString(2, kosup);
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
            String sql = "update barang set harga=?, jumlah=jumlah+? where kobar=?";
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
