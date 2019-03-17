/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.AsetController;
import Backend.PengajuanController;
import Model.Aset;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;

/**
 *
 * @author dimashv
 */
public class UserAsetEdit extends javax.swing.JFrame {

    AsetController aset;
    int selected;
    int idBarang;

    /**
     * Creates new form Admin
     */
    public UserAsetEdit(int idBarang) {
        initComponents();
        this.idBarang = idBarang;
        this.aset = new AsetController();
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        selectData();

    }

    public UserAsetEdit() {
        initComponents();
        this.aset = new AsetController();
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        selectData();

    }

    public void selectData() {
        Aset record = aset.getAsetById(idBarang);
        if (record != null) {
            String tanggal = "yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tanggal);
//            Date tanggalKontrak = Date.valueOf(fm.format(jDateChooser1.getDate())); 
//            Date tanggalAkhirKontrak = Date.valueOf(fm.format(jDateChooser2.getDate())); 
            TxtNup.setText(record.nup);
            TxtNamaBarang.setText(record.nama);
           
            TxtPenggunaan.setText(record.penggunaan);
            TxtNilaiPerolehan.setText(String.valueOf(record.nilai_perolehan));
          
            ComKondisi.setSelectedItem(record.kondisi); 
            jDateChooser1.setDate(record.tanggal_kontrak);
            jDateChooser2.setDate(record.tanggal_akhir_kontrak);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNilaiPerolehan = new javax.swing.JTextField();
        TxtNamaBarang = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        BtnSubmit = new javax.swing.JButton();
        ComKondisi = new javax.swing.JComboBox<>();
        TxtPenggunaan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Aset Tidak Bergerak");

        jLabel2.setText("NUP");

        jLabel3.setText("Nama Barang");

        jLabel6.setText("Nilai Perolehan");

        jLabel5.setText("Kondisi");

        TxtNilaiPerolehan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNilaiPerolehanActionPerformed(evt);
            }
        });

        jLabel18.setText("Tanggal Kontrak");

        jLabel19.setText("Tanggal Akhir Kontrak");

        BtnSubmit.setText("Update");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        ComKondisi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baik", "Rusak" }));

        TxtPenggunaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPenggunaanActionPerformed(evt);
            }
        });

        jLabel7.setText("Penggunaan");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtNup, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtPenggunaan)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(TxtNilaiPerolehan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(BtnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ComKondisi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPenggunaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNilaiPerolehan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(BtnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
        boolean hasil = false;
        if ("".equals(TxtNup.getText()) || "".equals(TxtNamaBarang.getText()) || "".equals(TxtNilaiPerolehan.getText())
                || "".equals(TxtPenggunaan.getText()) || jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String tanggal = "yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tanggal);
            Date tanggalKontrak = Date.valueOf(fm.format(jDateChooser1.getDate()));
            Date tanggalAkhirKontrak = Date.valueOf(fm.format(jDateChooser2.getDate()));
            hasil = this.aset.updateAset(idBarang, UserID.getUserLogin(), TxtNup.getText(), TxtNamaBarang.getText(), ComKondisi.getSelectedItem().toString(), TxtPenggunaan.getText(), Integer.parseInt(TxtNilaiPerolehan.getText()), tanggalKontrak, tanggalAkhirKontrak);
//        (TxtNup.getText(), TxtNama2.getText(), TxtNamaBarang.getText(), TxtNip2.getText(), TxtKondisi.getText(), TxtJabatan2.getText(), TxtNilaiPerolehan.getText(), TxtAlamat2.getText(), UserID.getUserLogin(), TxtNopol.getText(), TxtMerk.getText(), getString(ComJenis.getSelectedItem()), getString(ComKondisi.getSelectedItem()), tanggalPengajuan);
            if (hasil = true) {
                JOptionPane.showMessageDialog(null, "Aset Berhasil Ditambahkan");
                UserAset fa = new UserAset();
                fa.setLocationRelativeTo(null);
                this.setVisible(false);
                fa.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Penambahan Aset Gagal");
            }
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void TxtNilaiPerolehanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNilaiPerolehanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNilaiPerolehanActionPerformed

    private void TxtPenggunaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPenggunaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPenggunaanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserAset fa = new UserAset();
        fa.setLocationRelativeTo(null);
        this.setVisible(false);
        fa.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserAsetEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAsetEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAsetEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAsetEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAsetEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JComboBox<String> ComKondisi;
    private javax.swing.JTextField TxtNamaBarang;
    private javax.swing.JTextField TxtNilaiPerolehan;
    private javax.swing.JTextField TxtNup;
    private javax.swing.JTextField TxtPenggunaan;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}