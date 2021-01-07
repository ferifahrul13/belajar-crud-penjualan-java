/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CPembelian;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferifahrul
 */
public class JFPembelian extends javax.swing.JFrame {

    /**
     * Creates new form JFPembelian
     */
    
    DefaultTableModel dtm;
    CPembelian beli;
    
    public JFPembelian() {
        initComponents();
        this.setTitle("Transaksi Pembelian Barang");
        this.setLocationRelativeTo(getRootPane());
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        //Tanggal
        DateFormat df     = new SimpleDateFormat("yyyy-MM-dd");
        Date today        = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        TF_Tanggal.setText(reportDate);
        TF_Tanggal.setEnabled(false);
        
        beli = new CPembelian(this);
        beli.BuatTabelKeranjang();
        beli.isiTabelPembelian();
                
    }
    
    public JTextField getTanggal()
    {
        return TF_Tanggal;
    }
    
    public JTextField getKosup()
    {
        return TF_Kosup;
    }
    
    public JTextField getKobar()
    {
        return TF_Kobar;
    }
    
    public JTextField getJumlah()
    {
        return TF_Jumlah;
    }
    
    public JTextField getHarga()
    {
        return TF_Harga;
    }
    
    public JTable getDataTable()
    {
        return jTable2;
                
    }
    
    public JTable getDataTableKeranjang()
    {
        return jTable1;
    }
    
    public JTable getDataTableBarang()
    {
        return jTable3;
    }
    
    public JTable getDataTableSupplier()
    {
        return jTable4;
    }
    
    public void reset()
    {
        TF_Kosup.setText(null);
        TF_Kobar.setText(null);
        TF_Jumlah.setText(null);
        TF_Harga.setText(null);
        TF_Kosup.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cari_Barang = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Cari_Kobar = new javax.swing.JTextField();
        Pilih_Kobar = new javax.swing.JButton();
        Batal_Kobar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Cari_Supplier = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cari_Kosup = new javax.swing.JTextField();
        Pilih_Kosup = new javax.swing.JButton();
        Batal_Kosup = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TF_Tanggal = new javax.swing.JTextField();
        TF_Kosup = new javax.swing.JTextField();
        TF_Kobar = new javax.swing.JTextField();
        TF_Jumlah = new javax.swing.JTextField();
        TF_Harga = new javax.swing.JTextField();
        Btn_Cari_Kobar = new javax.swing.JButton();
        Btn_Cari_Kosup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Btn_Tambah_Keranjang = new javax.swing.JButton();
        Btn_Hapus_Keranjang = new javax.swing.JButton();
        Btn_Simpan_Transaksi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setText("Tabel Data Barang");

        jLabel7.setText("Kode Barang");

        Cari_Kobar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari_KobarKeyReleased(evt);
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

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout Cari_BarangLayout = new javax.swing.GroupLayout(Cari_Barang.getContentPane());
        Cari_Barang.getContentPane().setLayout(Cari_BarangLayout);
        Cari_BarangLayout.setHorizontalGroup(
            Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_BarangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cari_BarangLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Cari_BarangLayout.createSequentialGroup()
                        .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(Cari_BarangLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cari_Kobar)))
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
                    .addComponent(jLabel6)
                    .addComponent(Pilih_Kobar))
                .addGap(15, 15, 15)
                .addGroup(Cari_BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Cari_Kobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batal_Kobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Tabel Data Supplier");

        jLabel9.setText("Kode Supplier");

        Cari_Kosup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cari_KosupKeyReleased(evt);
            }
        });

        Pilih_Kosup.setText("Pilih");
        Pilih_Kosup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pilih_KosupActionPerformed(evt);
            }
        });

        Batal_Kosup.setText("Batal");
        Batal_Kosup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batal_KosupActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout Cari_SupplierLayout = new javax.swing.GroupLayout(Cari_Supplier.getContentPane());
        Cari_Supplier.getContentPane().setLayout(Cari_SupplierLayout);
        Cari_SupplierLayout.setHorizontalGroup(
            Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_SupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cari_SupplierLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Cari_SupplierLayout.createSequentialGroup()
                        .addGroup(Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(Cari_SupplierLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cari_Kosup)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pilih_Kosup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Batal_Kosup, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        Cari_SupplierLayout.setVerticalGroup(
            Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cari_SupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Pilih_Kosup))
                .addGap(15, 15, 15)
                .addGroup(Cari_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Cari_Kosup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Batal_Kosup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tanggal");

        jLabel2.setText("Kode Supplier");

        jLabel3.setText("Kode Barang");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Harga");

        TF_Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_TanggalActionPerformed(evt);
            }
        });

        TF_Kosup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_KosupActionPerformed(evt);
            }
        });

        TF_Kobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_KobarActionPerformed(evt);
            }
        });

        TF_Jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_JumlahActionPerformed(evt);
            }
        });

        TF_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_HargaActionPerformed(evt);
            }
        });

        Btn_Cari_Kobar.setText("...");
        Btn_Cari_Kobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_KobarActionPerformed(evt);
            }
        });

        Btn_Cari_Kosup.setText("...");
        Btn_Cari_Kosup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Cari_KosupActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Keranjang"));
        jPanel1.setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

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

        Btn_Simpan_Transaksi.setText("Simpan");
        Btn_Simpan_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Simpan_TransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Tambah_Keranjang)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Hapus_Keranjang)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Simpan_Transaksi)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Tambah_Keranjang)
                    .addComponent(Btn_Hapus_Keranjang)
                    .addComponent(Btn_Simpan_Transaksi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabel Transaksi Pembelian Barang"));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(56, 56, 56))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TF_Jumlah)
                                    .addComponent(TF_Harga)
                                    .addComponent(TF_Kobar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Cari_Kobar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(40, 40, 40))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF_Tanggal)
                                    .addComponent(TF_Kosup))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_Cari_Kosup, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF_Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Cari_Kosup)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TF_Kosup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_Kobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Cari_Kobar))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TF_Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TF_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_TanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_TanggalActionPerformed

    private void TF_KosupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_KosupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_KosupActionPerformed

    private void TF_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_KobarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_KobarActionPerformed

    private void TF_JumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_JumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_JumlahActionPerformed

    private void TF_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_HargaActionPerformed

    private void Btn_Cari_KosupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_KosupActionPerformed
        // TODO add your handling code here:
        Cari_Supplier.setVisible(true);
        beli.isiTabelSupplier();
        Cari_Supplier.setTitle("Data Supplier");
        Cari_Supplier.setSize(393,330);
        Cari_Supplier.setLocationRelativeTo(getRootPane());
        Cari_Supplier.setAlwaysOnTop(true);
        Cari_Supplier.setResizable(false);
        Cari_Kosup.setText(null);
        Cari_Kosup.requestFocus();
    }//GEN-LAST:event_Btn_Cari_KosupActionPerformed

    private void Cari_KosupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari_KosupKeyReleased
        // TODO add your handling code here:
        beli.searchKosup(Cari_Kosup.getText());
    }//GEN-LAST:event_Cari_KosupKeyReleased

    private void Pilih_KosupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilih_KosupActionPerformed
        // TODO add your handling code here:
        int baris = jTable4.getSelectedRow();
        TF_Kosup.setText(jTable4.getValueAt(baris, 0).toString());
        Cari_Supplier.setVisible(false);
        
    }//GEN-LAST:event_Pilih_KosupActionPerformed

    private void Batal_KosupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_KosupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Batal_KosupActionPerformed

    private void Btn_Cari_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Cari_KobarActionPerformed
        // TODO add your handling code here:
         Cari_Barang.setVisible(true);
        beli.isiTableBarang();
        Cari_Barang.setTitle("Data Barang");
        Cari_Barang.setSize(393,330);
        Cari_Barang.setLocationRelativeTo(getRootPane());
        Cari_Barang.setAlwaysOnTop(true);
        Cari_Barang.setResizable(false);
        Cari_Kobar.setText(null);
        Cari_Kobar.requestFocus();
    }//GEN-LAST:event_Btn_Cari_KobarActionPerformed

    private void Cari_KobarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cari_KobarKeyReleased
        // TODO add your handling code here:
        beli.searchKobar(Cari_Kobar.getText());
    }//GEN-LAST:event_Cari_KobarKeyReleased

    private void Batal_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batal_KobarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Batal_KobarActionPerformed

    private void Btn_Tambah_KeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Tambah_KeranjangActionPerformed
        // TODO add your handling code here:
        beli.TmbKeranjang();
        reset();
    }//GEN-LAST:event_Btn_Tambah_KeranjangActionPerformed

    private void Btn_Hapus_KeranjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Hapus_KeranjangActionPerformed
        // TODO add your handling code here:
        beli.HpsKeranjang();
    }//GEN-LAST:event_Btn_Hapus_KeranjangActionPerformed

    private void Btn_Simpan_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Simpan_TransaksiActionPerformed
        // TODO add your handling code here:
        beli.simpan(this);
        beli.isiTabelPembelian();
    }//GEN-LAST:event_Btn_Simpan_TransaksiActionPerformed

    private void Pilih_KobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pilih_KobarActionPerformed
        // TODO add your handling code here:
        int baris = jTable3.getSelectedRow();
        TF_Kobar.setText(jTable3.getValueAt(baris, 0).toString());
        Cari_Barang.setVisible(false);
    }//GEN-LAST:event_Pilih_KobarActionPerformed

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
            java.util.logging.Logger.getLogger(JFPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal_Kobar;
    private javax.swing.JButton Batal_Kosup;
    private javax.swing.JButton Btn_Cari_Kobar;
    private javax.swing.JButton Btn_Cari_Kosup;
    private javax.swing.JButton Btn_Hapus_Keranjang;
    private javax.swing.JButton Btn_Simpan_Transaksi;
    private javax.swing.JButton Btn_Tambah_Keranjang;
    private javax.swing.JDialog Cari_Barang;
    private javax.swing.JTextField Cari_Kobar;
    private javax.swing.JTextField Cari_Kosup;
    private javax.swing.JDialog Cari_Supplier;
    private javax.swing.JButton Pilih_Kobar;
    private javax.swing.JButton Pilih_Kosup;
    private javax.swing.JTextField TF_Harga;
    private javax.swing.JTextField TF_Jumlah;
    private javax.swing.JTextField TF_Kobar;
    private javax.swing.JTextField TF_Kosup;
    private javax.swing.JTextField TF_Tanggal;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}