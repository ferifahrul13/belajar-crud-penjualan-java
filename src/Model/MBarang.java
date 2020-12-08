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
public class MBarang {
    String Kode,Nama,Keterangan;
    double Harga;
    int Jumlah;
    
    public MBarang(String kode,String nama,double harga, int jumlah,String keterangan)
    {
        
        this.Kode = kode;
        this.Nama = nama;
        this.Harga = harga;
        this.Jumlah = jumlah;
        this.Keterangan = keterangan;
    }
    
    public void setKode(String kode)
    {
        this.Kode = kode;
    }
    
    public String getKode()
    {
        return Kode;
    }
    
    public void setNama(String nama)
    {
        this.Nama = nama;
    }
    
    public String getNama()
    {
        return Nama;
    }
    
    public void setHarga(double harga)
    {
        this.Harga = harga;
    }
    
    public double getHarga()
    {
        return Harga;
    }
    
    public void setJumlah(int jumlah)
    {
        this.Jumlah = jumlah;
    }
    
    public int getJumlah()
    {
        return Jumlah;
    }
    
    public void setKeterangan(String keterangan)
    {
        this.Keterangan = keterangan;
    }
    
    public String getKeterangan()
    {
        return Keterangan;
    }
    
}
