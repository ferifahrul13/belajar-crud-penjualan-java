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
public class DAOImplPenjualan implements DAOPenjualan{
    
    Connection kon;
    
    @Override
    public List<MPenjualan> GetAll()
    {
        kon = new Koneksi().connection();
        List<MPenjualan> lp = null;
        
        try {
            lp = new ArrayList<MPenjualan>();
            String sql = "select * from penjualan order by id asc";
            PreparedStatement ps = kon.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            while(rs.next())
            {
                MPenjualan mp = new MPenjualan();
                
                
                
            }
            
        } catch (Exception e) {
        }
        
    }
    
    @Override
    public void simpan(MPenjualan data){
        
    }
    
}
