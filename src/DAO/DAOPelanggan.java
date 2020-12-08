/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.MPelanggan;
import java.util.List;
/**
 *
 * @author ferifahrul
 */
public interface DAOPelanggan {
    
    public void insert(MPelanggan s);
    public void update(MPelanggan s);
    public List<MPelanggan>GetAll();
    public List<MPelanggan>Search(String Keyword);
    public void delete(String kode);
}
