/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOBarang;
import DAO.DAOPelanggan;
import DAOImpl.DAOImplPelanggan;
import DAOImpl.DAOImplBarang;
import Model.MBarang;
import Model.MPelanggan;
import TabelModel.TMBarang;
import TabelModel.TMPelanggan;
import View.JFPenjualan;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferifahrul
 */
public class CPenjualan {

    JFPenjualan jual;

    DAOPelanggan pelanggan;
    List<MPelanggan> lp;

    DAOBarang barang;
    List<MBarang> lb;

    DefaultTableModel dtm;

    public CPenjualan(JFPenjualan Jual) {
        this.jual = Jual;
        pelanggan = new DAOImplPelanggan();
        barang = new DAOImplBarang();
    }

    public void isiTabelPelanggan() {
        lp = pelanggan.GetAll();
        TMPelanggan tmp = new TMPelanggan(lp);
        jual.getDataTablePelanggan().setModel(tmp);
    }

    public void searchKopel(String Keyword) {
        lp = pelanggan.Search(Keyword);
        TMPelanggan tmp = new TMPelanggan(lp);
        jual.getDataTablePelanggan().setModel(tmp);
    }

    public void isiTabelBarang() {
        lb = barang.GetAll();
        TMBarang tmb = new TMBarang(lb);
        jual.getDataTableBarang().setModel(tmb);
    }

    public void searchKobar(String Keyword) {
        lb = barang.Search(Keyword);
        TMBarang tmb = new TMBarang(lb);
        jual.getDataTableBarang().setModel(tmb);
    }

    public void BuatTabelKeranjang() {
        dtm = new DefaultTableModel();
        //membuat nama colom tabel
        dtm.addColumn("Tanggal");
        dtm.addColumn("Kode Pelanggan");
        dtm.addColumn("Kode Barang");
        dtm.addColumn("Jumlah");
        dtm.addColumn("Harga");
        jual.getDataTableKeranjang().setModel(dtm);
        //mengatur lebar kolom

        jual.getDataTableKeranjang().getColumnModel().getColumn(0).setMinWidth(0);
        jual.getDataTableKeranjang().getColumnModel().getColumn(0).setPreferredWidth(100);
        jual.getDataTableKeranjang().getColumnModel().getColumn(1).setPreferredWidth(100);
        jual.getDataTableKeranjang().getColumnModel().getColumn(2).setPreferredWidth(100);
        jual.getDataTableKeranjang().getColumnModel().getColumn(3).setPreferredWidth(60);
        jual.getDataTableKeranjang().getColumnModel().getColumn(4).setPreferredWidth(85);

    }

    public void TmbKeranjang(JFPenjualan data) {
        lb = barang.Search(data.getKobar().getText());
        if (data.getKobar().getText().isEmpty()
                && data.getJumlah().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Anda belum memilih kode Barang");

        } else {
            for (int x = 0; x < data.getDataTableKeranjang().getRowCount(); x++) {
                if (data.getKobar().getText().equals(
                        data.getDataTableKeranjang().getValueAt(x, 2)
                )) {
                    JOptionPane.showMessageDialog(null,
                            "Kode barang tidak boleh sama, tambahkan saja jumlahnya!");
                    return;
                }
            }

            if (data.getDataTableKeranjang().getRowCount() == 0) {

                BuatTabelKeranjang();
            }

            Object[] k = new Object[5];
            k[0] = data.getTanggal().getText();
            k[1] = data.getKopel().getText();
            k[2] = data.getKobar().getText();
            k[3] = data.getJumlah().getText();
            k[4] = lb.get(0).getHarga();
            dtm.addRow(k);

        }
    }

    public void HtgTotal() {
        double totalBayar = 0;
        if (jual.getDataTableKeranjang().getRowCount() > 0) {
            for (int i = 0; i < jual.getDataTableKeranjang().getRowCount(); i++) {
                double total = Double.parseDouble(
                        jual.getDataTableKeranjang().getValueAt(i, 3).toString()
                        )
                        * 
                        Double.parseDouble(
                                jual.getDataTableKeranjang().getValueAt(i, 4).toString()
                        );
                        
                
                totalBayar += total;

            }
        }
        jual.getTotal().setText(Double.toString(totalBayar));
    }
    
    public void HpsKeranjang()
    {
        if(jual.getDataTableKeranjang().getRowCount() != 0)
        {
            dtm.removeRow(jual.getDataTableKeranjang().getSelectedRow());
        }
    }

}
