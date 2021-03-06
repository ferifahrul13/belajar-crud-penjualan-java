/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import Controller.CPenjualan;
import javax.swing.JTextField;

/**
 *
 * @author ferifahrul
 */
public class JFPenjualan extends javax.swing.JFrame {

    /**
     * Creates new form JFPenjualan
     */
    CPenjualan jual;

    public JFPenjualan() {
        initComponents();
        this.setTitle("Transaksi Penjualan Barang");
        this.setLocationRelativeTo(getRootPane());
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        //Tanggal
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        TF_Tanggal.setText(reportDate);
        TF_Tanggal.setEnabled(false);
        jual = new CPenjualan(this);
        jual.BuatTabelKeranjang();
        jual.isiTabelTransaksi();
        TF_Total.setEnabled(false);
        TF_Kembalian.setEnabled(false);

    }
    
    public JTable getDataTableTransaksi()
    {
       return JT_Transaksi;
    }

    public JTable getDataTableBarang()
    {
        return JT_Barang;
    }
    
    public JTable getDataTablePelanggan() {
        return JT_Pelanggan;
    }
    
    
    public JTable getDataTableKeranjang()
    {
        return JT_Keranjang;
    }
    
    public JTextField getTanggal()
    {
        return TF_Tanggal;
    }
    
    public JTextField getKopel()
    {
        return TF_Kopel;
    }
    
    public JTextField getKobar()
    {
        return TF_Kobar;
    }
    
    public JTextField getJumlah()
    {
        return TF_Jumlah;
    }
    
    public JTextField getTotal()
    {
        return TF_Total;
    }
    
    public JTextField getUang()
    {
        return TF_Uang;
    }
    
    public JTextField getKembalian()
    {
        return TF_Kembalian;
    }
    
    public void resetInput()
    {
        TF_Kopel.setText(null);
        TF_Kobar.setText(null);
        TF_Jumlah.setText(null);
//        TF_Total.setText(null);
//        TF_Kembalian.setText(null);
//        TF_Uang.setText(null);
        TF_Kobar.requestFocus();
    }
    
    public void resetBayar()
    {
        TF_Total.setText(null);
        TF_Uang.setText(null);
        TF_Kembalian.setText(null);
    }
    
    public JTable getDatatableTransaksi()
    {
        return JT_Transaksi;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cari_Pelanggan = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        JT_Pelanggan = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_Cari_Kopel = new javax.swing.JTextField();
        Btn_Pilih_Kopel = new javax.swing.JButton();
        Btn_Batal_Kopel = new javax.swing.JButton();
        Cari_Barang = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_Cari_Kobar = new javax.swing.JTextField();
        Pilih_Kobar = new javax.swing.JButton();
        Batal_Kobar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JT_Barang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TF_Tanggal = new javax.swing.JTextField();
        TF_Kopel = new javax.swing.JTextField();
        TF_Kobar = new javax.swing.JTextField();
        TF_Jumlah = new javax.swing.JTextField();
        TF_Total = new javax.swing.JTextField();
        TF_Uang = new javax.swing.JTextField();
        TF_Kembalian = new javax.swing.JTextField();
        Btn_Cari_Kopel = new javax.swing.JButton();
        Btn_Cari_Kobar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Keranjang = new javax.swing.JTable();
        Btn_Tambah_Keranjang = new javax.swing.JButton();
        Btn_Hapus_Keranjang = new javax.swing.JButton();
        Btn_Bayar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_Transaksi = new javax.swing.JTable();

        JT_Pelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(JT_Pelanggan);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Tabel Data Pelanggan");

        jLabel9.setText("Kode Pelanggan");

        TF_Cari_Kopel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_Cari_KopelActionPerformed(evt);
            }
        });
        TF_Cari_Kopel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_Cari_KopelKeyReleased(evt);
            }
        });

        Btn_Pilih_Kopel.setText("Pilih");
        Btn_Pilih_Kopel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Pilih_KopelActionPerformed(evt);
            }
        });

        Btn_Batal_Kopel.setText("Batal");
        Btn_Batal_Kopel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Batal_KopelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cari_PelangganLayout = new javax.swing.GroupLayout(Cari_Pelanggan.getContentPane());
        Cari_Pelanggan.getContentPane().setLayout(Cari_PelangganLayout);
        Cari_PelangganLayout.setHorizontalGroup(
            Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cari_PelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Cari_PelangganLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Cari_PelangganLayout.createSequentialGroup()
                        .addGroup(Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(Cari_PelangganLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Cari_Kopel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Pilih_Kopel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Batal_Kopel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Cari_PelangganLayout.setVerticalGroup(
            Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_PelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Btn_Pilih_Kopel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cari_PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_Cari_Kopel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Batal_Kopel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel10.setText("Tabel Data Barang");

        jLabel11.setText("Kode Barang");

        TF_Cari_Kobar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_Cari_KobarKeyReleased(evt);
            }
        });

        Pilih_Kobar.setText("Pilih");
        Pilih_Kobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilih_KobarActionPerformed(evt);
            }
        });

        Batal_Kobar.setText("Batal");
        Batal_Kobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batal_KobarActionPerformed(evt);
            }
        });

        JT_Barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(JT_Barang);

        javax.swing.GroupLayout Cari_BarangLayout = new javax.swing.GroupLayout(Cari_Barang.getContentPane());
        Cari_Barang.getContentPane().setLayout(Cari_BarangLayout);
        Cari_BarangLayout.setHorizontalGroup(
            Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cari_BarangLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Cari_BarangLayout.createSequentialGroup()
                        .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addGroup(Cari_BarangLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Cari_Kobar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pilih_Kobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Batal_Kobar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        Cari_BarangLayout.setVerticalGroup(
            Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Pilih_Kobar))
                .addGap(15, 15, 15)
                .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TF_Cari_Kobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batal_Kobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tanggal");

        jLabel2.setText("Kode Pelanggan");

        jLabel3.setText("Kode Barang");

        jLabel4.setText("Jumlah Barang");

        jLabel5.setText("Total");

        jLabel6.setText("Jumlah Uang");

        jLabel7.setText("Uang Kembali");

        TF_Uang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_UangKeyReleased(evt);
            }
        });

        Btn_Cari_Kopel.setText("...");
        Btn_Cari_Kopel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_KopelActionPerformed(evt);
            }
        });

        Btn_Cari_Kobar.setText("...");
        Btn_Cari_Kobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_KobarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Keranjang"));

        JT_Keranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JT_Keranjang);

        Btn_Tambah_Keranjang.setText("Tambah ke Keranjang");
        Btn_Tambah_Keranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Tambah_KeranjangActionPerformed(evt);
            }
        });

        Btn_Hapus_Keranjang.setText("Hapus dari Keranjang");
        Btn_Hapus_Keranjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Hapus_KeranjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Tambah_Keranjang)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Hapus_Keranjang)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Tambah_Keranjang)
                    .addComponent(Btn_Hapus_Keranjang))
                .addContainerGap())
        );

        Btn_Bayar.setText("Bayar");
        Btn_Bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BayarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabel Transaksi Penjualan Barang"));

        JT_Transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(JT_Transaksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Btn_Bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TF_Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TF_Kobar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(TF_Kopel, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Btn_Cari_Kopel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                                .addComponent(Btn_Cari_Kobar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_Uang, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(TF_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF_Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_Kopel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Cari_Kopel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_Kobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Cari_Kobar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TF_Uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TF_Kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Bayar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Hapus_KeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Hapus_KeranjangActionPerformed
        // TODO add your handling code here:
        jual.HpsKeranjang();
        jual.HtgTotal();
    }//GEN-LAST:event_Btn_Hapus_KeranjangActionPerformed

    private void TF_Cari_KobarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_Cari_KobarKeyReleased
        // TODO add your handling code here:
        jual.searchKobar(TF_Cari_Kobar.getText());
    }//GEN-LAST:event_TF_Cari_KobarKeyReleased

    private void Pilih_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilih_KobarActionPerformed
        // TODO add your handling code here:
        int baris = JT_Barang.getSelectedRow();
        TF_Kobar.setText(JT_Barang.getValueAt(baris, 0).toString());
        Cari_Barang.dispose();
    }//GEN-LAST:event_Pilih_KobarActionPerformed

    private void Batal_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_KobarActionPerformed
        // TODO add your handling code here:
        Cari_Barang.dispose();
    }//GEN-LAST:event_Batal_KobarActionPerformed

    private void Btn_Cari_KopelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_KopelActionPerformed
        // TODO add your handling code here:
        Cari_Pelanggan.setVisible(true);
        Cari_Pelanggan.setTitle("Data Pelanggan");
        Cari_Pelanggan.setSize(393,330);
        Cari_Pelanggan.setLocationRelativeTo(getRootPane());
        Cari_Pelanggan.setAlwaysOnTop(true);
        Cari_Pelanggan.setResizable(false);
        TF_Cari_Kopel.setText(null);
        jual.isiTabelPelanggan();
    }//GEN-LAST:event_Btn_Cari_KopelActionPerformed

    private void TF_Cari_KopelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_Cari_KopelActionPerformed
        //salah
        
    }//GEN-LAST:event_TF_Cari_KopelActionPerformed

    private void TF_Cari_KopelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_Cari_KopelKeyReleased
        // TODO add your handling code here:
        jual.searchKopel(TF_Cari_Kopel.getText());
    }//GEN-LAST:event_TF_Cari_KopelKeyReleased

    private void Btn_Pilih_KopelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Pilih_KopelActionPerformed
        // TODO add your handling code here:
        int baris = JT_Pelanggan.getSelectedRow();
        TF_Kopel.setText(JT_Pelanggan.getValueAt(baris, 0).toString());
        Cari_Pelanggan.dispose();
    }//GEN-LAST:event_Btn_Pilih_KopelActionPerformed

    private void Btn_Batal_KopelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Batal_KopelActionPerformed
        // TODO add your handling code here:
        Cari_Pelanggan.dispose();
    }//GEN-LAST:event_Btn_Batal_KopelActionPerformed

    private void Btn_Cari_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_KobarActionPerformed
        // TODO add your handling code here:
         Cari_Barang.setVisible(true);
        Cari_Barang.setTitle("Data Barang");
        Cari_Barang.setSize(393,330);
        Cari_Barang.setLocationRelativeTo(getRootPane());
        Cari_Barang.setAlwaysOnTop(true);
        Cari_Barang.setResizable(false);
        TF_Cari_Kobar.setText(null);
        jual.isiTabelBarang();
        
    }//GEN-LAST:event_Btn_Cari_KobarActionPerformed

    private void Btn_Tambah_KeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tambah_KeranjangActionPerformed
        // TODO add your handling code here:
        jual.TmbKeranjang(this);
        jual.HtgTotal();
        resetInput();
    }//GEN-LAST:event_Btn_Tambah_KeranjangActionPerformed

    private void TF_UangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_UangKeyReleased
        // TODO add your handling code here:
        double total = Double.parseDouble(TF_Total.getText());
        double uang = Double.parseDouble(TF_Uang.getText());
        TF_Kembalian.setText(Double.toString(uang-total));
    }//GEN-LAST:event_TF_UangKeyReleased

    private void Btn_BayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BayarActionPerformed
        // TODO add your handling code here:
        jual.simpan(this);
        resetBayar();
        jual.isiTabelTransaksi();
    }//GEN-LAST:event_Btn_BayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal_Kobar;
    private javax.swing.JButton Btn_Batal_Kopel;
    private javax.swing.JButton Btn_Bayar;
    private javax.swing.JButton Btn_Cari_Kobar;
    private javax.swing.JButton Btn_Cari_Kopel;
    private javax.swing.JButton Btn_Hapus_Keranjang;
    private javax.swing.JButton Btn_Pilih_Kopel;
    private javax.swing.JButton Btn_Tambah_Keranjang;
    private javax.swing.JDialog Cari_Barang;
    private javax.swing.JDialog Cari_Pelanggan;
    private javax.swing.JTable JT_Barang;
    private javax.swing.JTable JT_Keranjang;
    private javax.swing.JTable JT_Pelanggan;
    private javax.swing.JTable JT_Transaksi;
    private javax.swing.JButton Pilih_Kobar;
    private javax.swing.JTextField TF_Cari_Kobar;
    private javax.swing.JTextField TF_Cari_Kopel;
    private javax.swing.JTextField TF_Jumlah;
    private javax.swing.JTextField TF_Kembalian;
    private javax.swing.JTextField TF_Kobar;
    private javax.swing.JTextField TF_Kopel;
    private javax.swing.JTextField TF_Tanggal;
    private javax.swing.JTextField TF_Total;
    private javax.swing.JTextField TF_Uang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
