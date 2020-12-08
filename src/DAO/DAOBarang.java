/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MBarang;
import java.util.List;
/**
 *
 * @author ferifahrul
 */

public interface DAOBarang {
    
    public void insert(MBarang b);
    public void update(MBarang b);
    public List<MBarang>GetAll();
    public void delete(String kode);
    
}
