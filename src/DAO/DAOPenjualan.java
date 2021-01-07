/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MPenjualan;
import java.util.List;

/**
 *
 * @author ferifahrul
 */
public interface DAOPenjualan {
    
    public List<MPenjualan> GetAll();
    
    public void simpan(MPenjualan data);
    
}
