/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Config.Koneksi;
import DAO.DAOPelanggan;
import Model.MPelanggan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ferifahrul
 */
public class DAOImplPelanggan implements DAOPelanggan{
    
    Connection con;
    
    @Override
    public void insert(MPelanggan p)
    {
        con = new Koneksi().connection();
        
        String kode = p.getKode();
        String nama = p.getNama();
        String alamat = p.getAlamat();
        String hp = p.getHP();
        String jeniskelamin = p.getJenisKelamin();
        
        try {
            String sql = "insert into pelanggan (kopel,nama,alamat,hp,jeniskelamin) values (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.setString(3, alamat);
            stmt.setString(4, hp);
            stmt.setString(5, jeniskelamin);
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
    @Override
    public void update(MPelanggan p)
    {
         con = new Koneksi().connection();
        
        String kode = p.getKode();
        String nama = p.getNama();
        String alamat = p.getAlamat();
        String hp = p.getHP();
        String jeniskelamin = p.getJenisKelamin();
        
        try {
            String sql = "update pelanggan set nama=?,alamat=?,hp=?,jeniskelamin=? where kopel=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setString(3, hp);
            stmt.setString(4, jeniskelamin);
            stmt.setString(5, kode);
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
        
    }
    
    @Override
    public void delete(String kode) 
    {
        con = new Koneksi().connection();
        
        try {
            String sql  = "DELETE FROM pelanggan WHERE kopel = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, kode);
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
     //list
    @Override
    public List<MPelanggan>GetAll() {
    
        con = new Koneksi().connection();
        List<MPelanggan> list = null;
        
        try {
            String sql = "select * from pelanggan order by kopel asc";
            list = new ArrayList<MPelanggan>();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                MPelanggan mp = new MPelanggan();
                mp.setKode(rs.getString("kopel"));
                mp.setNama(rs.getString("nama"));
                mp.setAlamat(rs.getString("alamat"));     
                mp.setJenisKelamin(rs.getString("jeniskelamin"));
                mp.setHP(rs.getString("hp"));           

                list.add(mp);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    
    public List<MPelanggan>Search(String Keyword) {
    
        con = new Koneksi().connection();
        List<MPelanggan> list = null;
        
        try {
            String sql = "select * from pelanggan where kopel like ?";
            list = new ArrayList<MPelanggan>();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,"%"+Keyword+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MPelanggan mp = new MPelanggan();
                mp.setKode(rs.getString("kopel"));
                mp.setNama(rs.getString("nama"));
                mp.setAlamat(rs.getString("alamat"));     
                mp.setJenisKelamin(rs.getString("jeniskelamin"));
                mp.setHP(rs.getString("hp"));           
                list.add(mp);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
}
