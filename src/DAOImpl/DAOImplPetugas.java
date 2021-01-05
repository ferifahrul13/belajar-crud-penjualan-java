/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Config.Koneksi;
import DAO.DAOPetugas;
import Model.MPetugas;
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
public class DAOImplPetugas implements DAOPetugas {
    
    Connection con;
    
    @Override
    public void insert(MPetugas p)
    {
        con = new Koneksi().connection();
        
        String kode = p.getKode();
        String nama = p.getNama();
        String alamat = p.getAlamat();
        String jeniskelamin = p.getJenisKelamin();
        String hp = p.getHP();        
        String pass = p.getPass();

        
        try {
            String sql = "insert into petugas (kopet,nama,alamat,gender,hp,pass) values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.setString(3, alamat);            
            stmt.setString(4, jeniskelamin);
            stmt.setString(5, hp);            
            stmt.setString(6, pass);
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
    @Override
    public void update(MPetugas p)
    {
         con = new Koneksi().connection();
        
        String kode = p.getKode();
        String nama = p.getNama();
        String alamat = p.getAlamat();
        String jeniskelamin = p.getJenisKelamin();
        String hp = p.getHP();        
        String pass = p.getPass();
        
        try {
            String sql = "update petugas set nama=?,alamat=?,gender=?,hp=?,pass=? where kopet=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);            
            stmt.setString(3, jeniskelamin);
            stmt.setString(4, hp);            
            stmt.setString(5, pass);
            stmt.setString(6, kode);
            
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
            String sql  = "DELETE FROM petugas WHERE kopet = ?";
            
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
    public List<MPetugas>GetAll() {
    
        con = new Koneksi().connection();
        List<MPetugas> list = null;
        
        try {
            String sql = "select * from petugas order by kopet asc";
            list = new ArrayList<MPetugas>();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                MPetugas mp = new MPetugas();
                mp.setKode(rs.getString("kopet"));
                mp.setNama(rs.getString("nama"));
                mp.setAlamat(rs.getString("alamat"));
                mp.setJenisKelamin(rs.getString("gender"));
                mp.setHP(rs.getString("hp"));
                mp.setPass(rs.getString("pass"));
                list.add(mp);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    @Override
    public List<MPetugas>Search(String Keyword) {
    
        con = new Koneksi().connection();
        List<MPetugas> list = null;
        
        try {
            String sql = "select * from petugas where kopet like ?";
            list = new ArrayList<MPetugas>();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,"%"+Keyword+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MPetugas mp = new MPetugas();
                mp.setKode(rs.getString("kopet"));
                mp.setNama(rs.getString("nama"));
                mp.setAlamat(rs.getString("alamat"));
                mp.setJenisKelamin(rs.getString("gender"));
                mp.setHP(rs.getString("hp"));
                mp.setPass(rs.getString("pass"));
                list.add(mp);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    
}
