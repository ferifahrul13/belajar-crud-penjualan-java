/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MPetugas;
import java.util.List;

/**
 *
 * @author ferifahrul
 */
public interface DAOPetugas {
    
    public void insert(MPetugas p);
    public void update(MPetugas p);
    public List<MPetugas>GetAll();
    public List<MPetugas>Search(String Keyword);
    public void delete(String kode);
    
}
