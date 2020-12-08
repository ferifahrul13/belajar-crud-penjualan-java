/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MSupplier;
import java.util.List;

/**
 *
 * @author ferifahrul
 */
public interface DAOSupplier {
    public void insert(MSupplier s);
    public void update(MSupplier s);
    public List<MSupplier>GetAll();
    public List<MSupplier>Search(String Keyword);
    public void delete(String kode);
    
}
