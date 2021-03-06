/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CPelanggan;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
/**
 *
 * @author ferifahrul
 */
public class JFPelanggan extends javax.swing.JFrame {


    /**
     * Creates new form JFPelanggan
     */
    CPelanggan pelanggan;
    public JFPelanggan() {
        initComponents();
        this.setTitle("Data Pelanggan");
        this.setLocationRelativeTo(getRootPane());
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        pelanggan = new CPelanggan(this);
        pelanggan.isiTabel();
    }
    
    public JTextField getKode() { return TF_Kode; }
    public JTextField getNama() { return TF_Nama; }
    public JTextField getAlamat() { return TF_Alamat; }
    public JTextField getHP() { return TF_HP; }
    public JTextField getJenisKelamin() { return TF_JenisKelamin; }
    public JTable getDataTable() { return jTable1; }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TF_Kode = new javax.swing.JTextField();
        TF_Nama = new javax.swing.JTextField();
        TF_Alamat = new javax.swing.JTextField();
        TF_HP = new javax.swing.JTextField();
        BTSimpan = new javax.swing.JButton();
        BTEdit = new javax.swing.JButton();
        BTHapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TF_JenisKelamin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Pelanggan");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("HP");

        TF_Kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TF_KodeKeyReleased(evt);
            }
        });

        BTSimpan.setText("Simpan");
        BTSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSimpanActionPerformed(evt);
            }
        });

        BTEdit.setText("Edit");
        BTEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEditActionPerformed(evt);
            }
        });

        BTHapus.setText("Hapus");
        BTHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTHapusActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis Kelamin");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_Nama)
                    .addComponent(TF_JenisKelamin, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(TF_Alamat)
                    .addComponent(TF_Kode)
                    .addComponent(TF_HP))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(BTEdit)
                        .addGap(18, 18, 18)
                        .addComponent(BTHapus))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TF_Kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TF_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TF_JenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(TF_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TF_HP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSimpanActionPerformed
        // TODO add your handling code here:
        pelanggan.insert(this);
        pelanggan.isiTabel();
        TF_Kode.setEnabled(true);
    }//GEN-LAST:event_BTSimpanActionPerformed

    private void BTEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEditActionPerformed
        // TODO add your handling code here:
        pelanggan.update(this);
        pelanggan.isiTabel();
        TF_Kode.setEnabled(true);
    }//GEN-LAST:event_BTEditActionPerformed

    private void BTHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTHapusActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(this,
                "Anda Yakin Akan Menghapus Data Ini?","Peringatan",
                JOptionPane.WARNING_MESSAGE);
        
        if(dialogResult == JOptionPane.YES_OPTION) {
            pelanggan.delete(TF_Kode.getText());
            pelanggan.isiTabel();
        TF_Kode.setEnabled(true);
        }
    }//GEN-LAST:event_BTHapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        TF_Kode.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());        
        TF_Nama.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());     
        TF_Alamat.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());        
        TF_HP.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());      
        TF_JenisKelamin.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        TF_Kode.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void TF_KodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TF_KodeKeyReleased
        // TODO add your handling code here:
        
        pelanggan.search(TF_Kode.getText());
    }//GEN-LAST:event_TF_KodeKeyReleased

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
            java.util.logging.Logger.getLogger(JFPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEdit;
    private javax.swing.JButton BTHapus;
    private javax.swing.JButton BTSimpan;
    private javax.swing.JTextField TF_Alamat;
    private javax.swing.JTextField TF_HP;
    private javax.swing.JTextField TF_JenisKelamin;
    private javax.swing.JTextField TF_Kode;
    private javax.swing.JTextField TF_Nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
