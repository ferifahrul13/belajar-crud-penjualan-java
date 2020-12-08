/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;
import Config.Koneksi;
import DAO.DAOSupplier;
import Model.MSupplier;
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
public class DAOImplSupplier implements DAOSupplier {
    
    Connection con;
    
    @Override
    public void insert(MSupplier s)
    {
        con = new Koneksi().connection();
        
        String kode = s.getKode();
        String nama = s.getNama();
        String alamat = s.getAlamat();
        String hp = s.getHP();
        
        try {
            String sql = "insert into supplier (kosup,nasup,alamat,hp) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.setString(3, alamat);
            stmt.setString(4, hp);
            
            stmt.executeUpdate();
            stmt.close();
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    
    @Override
    public void update(MSupplier s)
    {
         con = new Koneksi().connection();
        
        String kode = s.getKode();
        String nama = s.getNama();
        String alamat = s.getAlamat();
        String hp = s.getHP();
        
        try {
            String sql = "update supplier set nasup=?,alamat=?,hp=? where kosup=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setString(2, alamat);
            stmt.setString(3, hp);
            stmt.setString(4, kode);
            
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
            String sql  = "DELETE FROM supplier WHERE kosup = ?";
            
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
    public List<MSupplier>GetAll() {
    
        con = new Koneksi().connection();
        List<MSupplier> list = null;
        
        try {
            String sql = "select * from supplier order by kosup asc";
            list = new ArrayList<MSupplier>();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                MSupplier ms = new MSupplier();
                ms.setKode(rs.getString("kosup"));
                ms.setNama(rs.getString("nasup"));
                ms.setAlamat(rs.getString("alamat"));
                ms.setHP(rs.getString("hp"));
                list.add(ms);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    
    public List<MSupplier>Search(String Keyword) {
    
        con = new Koneksi().connection();
        List<MSupplier> list = null;
        
        try {
            String sql = "select * from supplier where kosup like ?";
            list = new ArrayList<MSupplier>();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,"%"+Keyword+"%");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MSupplier ms = new MSupplier();
                ms.setKode(rs.getString("kosup"));
                ms.setNama(rs.getString("nasup"));
                ms.setAlamat(rs.getString("alamat"));
                ms.setHP(rs.getString("hp"));
                list.add(ms);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    
}
