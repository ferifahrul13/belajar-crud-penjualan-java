/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImpl;

import Config.Koneksi;
import DAO.DAOBarang;
import Model.MBarang;
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
public class DAOImplBarang implements DAOBarang{
    
    Connection con;
    @Override
    public void insert(MBarang b){
        con = new Koneksi().connection();
        String kode  = b.getKode();
        String nama  = b.getNama();
        double harga = b.getHarga();
        int jumlah   = b.getJumlah();
        String keterangan = b.getKeterangan();
        
        try{
            String sql= "insert into barang(kobar,nabar,harga,jumlah,keterangan) values(?,?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.setDouble(3, harga);
            stmt.setInt(4, jumlah);
            stmt.setString(5, keterangan);
            
            stmt.executeUpdate();
            stmt.close();
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    @Override
    public void update(MBarang b){
        con = new Koneksi().connection();
        String kode  = b.getKode();
        String nama  = b.getNama();
        double harga = b.getHarga();
        int jumlah   = b.getJumlah();
        String keterangan = b.getKeterangan();
        
        try{
            String sql= "update barang set nabar=?,harga=?,jumlah=?,keterangan=? where kobar=?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, nama);
            stmt.setDouble(2, harga);
            stmt.setInt(3, jumlah);
            stmt.setString(4, keterangan);
            stmt.setString(5, kode);
            
            stmt.executeUpdate();
            stmt.close();
        }catch(Exception error){
            error.printStackTrace();
        }
    }
    
    @Override
    public void delete(String kode) 
    {
        con = new Koneksi().connection();
        
        try {
            String sql  = "DELETE FROM barang WHERE kobar = ?";
            
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
    public List<MBarang>GetAll() {
    
        
        con = new Koneksi().connection();
        List<MBarang> list = null;
        
        try {
            String sql = "select * from barang order by kobar asc";
            list = new ArrayList<MBarang>();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                MBarang mb = new MBarang(
                        rs.getString("kobar"),
                        rs.getString("nabar"),
                        rs.getDouble("harga"),
                        rs.getInt("jumlah"),
                        rs.getString("keterangan")
                );
                mb.setKode(rs.getString("kobar"));
                mb.setNama(rs.getString("nabar"));
                mb.setHarga(rs.getDouble("harga"));
                mb.setJumlah(rs.getInt("jumlah"));
                mb.setKeterangan(rs.getString("keterangan"));
                list.add(mb);
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        
        return list;
    }
    
    
    
}
