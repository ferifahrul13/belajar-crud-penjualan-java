/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ferifahrul
 */
public class MPenjualan {

    String id, tanggal, kopel, kobar, jumlah, harga, total;
    
    public void setID(String ID)
    {
        this.id = ID;
    }
    
    public void setTanggal(String Tanggal)
    {
        this.tanggal = Tanggal;
    }
    
    public void setKopel(String Kopel)
    {
        this.kopel = Kopel;
    }
    
    public void setKobar(String Kobar)
    {
        this.kobar = Kobar;
    }
    
    public void setJumlah(String Jumlah)
    {
        this.jumlah = Jumlah;
    }
    
    public void setHarga(String Harga)
    {
        this.harga = Harga;
    }
    
    public void setTotal(String Total)
    {
        this.total = Total;
    }
    
    public String getID()
    {
        return id;
    }
    
    public String getTanggal()
    {
        return tanggal;
    }
    
    public String getKopel()
    {
        return kopel;
    }
    
    public String getKobar()
    {
        return kobar;
    }
    
    public String getJumlah()
    {
        return jumlah;
    }
    
    public String getHarga()
    {
        return harga;
    }
    
    public String getTotal()
    {
        return total;
    }
}
