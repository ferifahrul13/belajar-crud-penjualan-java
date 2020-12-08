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
public class MPelanggan {
    String Kode,Nama,Alamat,HP,JenisKelamin;
    
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
    
    public void setAlamat(String alamat)
    {
        this.Alamat = alamat;
    }
    
    public String getAlamat()
    {
        return Alamat;
    }
    
    public void setHP(String hp)
    {
        this.HP = hp;
    }
    
    public String getHP()
    {
        return HP;
    }
    
    public void setJenisKelamin(String jeniskelamin)
    {
        this.JenisKelamin = jeniskelamin;
    }
    
    public String getJenisKelamin()
    {
        return JenisKelamin;
    }
    
}
