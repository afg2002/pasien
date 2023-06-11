/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formdata;

import helper.database;
import helper.reset;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author afgha
 */
public class JadwalDokter extends javax.swing.JFrame {
    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset rst = new reset();
    String table = "jadwal_dokter";
    String[] columns = {"id_jadwal","id_dokter","tanggal_jadwal","jam_mulai","jam_selesai","ruangan","jenis_pelayanan","keterangan"};
    String[] columnsUpdate = {"id_dokter","tanggal_jadwal","jam_mulai","jam_selesai","ruangan","jenis_pelayanan","keterangan"};
    

    
    public JadwalDokter() {
        initComponents();
        datatable();
    }
    
     protected void datatable(){
        Object[] Baris = {"id_jadwal","id_dokter","nama_dokter","tanggal_jadwal","jam_mulai","jam_selesai","ruangan","jenis_pelayanan","keterangan"};
        tabmode  = new DefaultTableModel(null, Baris);
        tabJadwalDokter.setModel(tabmode);
        String sql = "SELECT a.id_jadwal, b.id_dokter,b.nama_dokter, a.tanggal_jadwal, a.jam_mulai, a.jam_selesai, "
                + "a.ruangan, a.jenis_pelayanan, a.keterangan FROM jadwal_dokter as a INNER JOIN dokter as b ON a.id_dokter = b.id_dokter";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("id_jadwal");
                String b= res.getString("id_dokter");
                String c= res.getString("nama_dokter");
                String d = res.getString("tanggal_jadwal");
                String e = res.getString("jam_mulai");
                String f = res.getString("jam_selesai");
                String g = res.getString("ruangan");
                String h = res.getString("jenis_pelayanan");
                String i = res.getString("keterangan");
                String[] data = {a,b,c,d,e,f,g,h,i};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JadwalDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bgPembayaran = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tIdJadwal = new javax.swing.JTextField();
        tIdDokter = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabJadwalDokter = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bCariDokter = new javax.swing.JButton();
        tKeterangan = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tNamaDokter = new javax.swing.JTextField();
        tTanggalJadwal = new com.toedter.calendar.JDateChooser();
        tJamMulai = new javax.swing.JTextField();
        tJamSelesai = new javax.swing.JTextField();
        tRuangan = new javax.swing.JTextField();
        tJenisPelayanan = new javax.swing.JComboBox<>();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hestiwirasakti..jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Jadwal Dokter");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jayakarta-resized-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(291, 291, 291)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setText("ID Jadwal");

        jLabel4.setText("ID Dokter");

        jLabel5.setText("Tanggal Jadwal");

        tIdJadwal.setEnabled(false);

        bTambah.setText("Tambah");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        tabJadwalDokter.setModel(new javax.swing.table.DefaultTableModel(
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
        tabJadwalDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabJadwalDokterMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabJadwalDokter);

        jLabel6.setText("Jam Mulai");

        jLabel8.setText("Jam Selesai");

        jLabel9.setText("Ruangan");

        jLabel10.setText("Jenis Pelayanan");

        jLabel11.setText("Keterangan");

        bCariDokter.setText("Cari");
        bCariDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariDokterActionPerformed(evt);
            }
        });

        tKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKeteranganActionPerformed(evt);
            }
        });

        jLabel12.setText("Nama Dokter");

        tRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tRuanganActionPerformed(evt);
            }
        });

        tJenisPelayanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Pelayanan", "Umum", "Gigi", "Kulit", "Paru", "Jantung", "Orthopedi", "Anak", "Mata", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEdit)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tIdJadwal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bCariDokter))
                                    .addComponent(tNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tJamMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tJamSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tTanggalJadwal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tJenisPelayanan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tRuangan, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tIdJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCariDokter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tTanggalJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tJamMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tJamSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tJenisPelayanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit)
                            .addComponent(bReset)
                            .addComponent(bHapus))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        int id_jadwal = Integer.parseInt(tIdJadwal.getText());
        try {
            String condition = "id_jadwal = " + id_jadwal;
            db.deleteData(conn, table, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(JadwalDokter.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        String id_jadwal = tIdJadwal.getText();
        String id_dokter = tIdDokter.getText();
        java.sql.Date tanggalJadwal = new java.sql.Date(tTanggalJadwal.getDate().getTime());
        String jam_mulai = tJamMulai.getText();
        String jam_selesai = tJamSelesai.getText();
        String ruangan = tRuangan.getText();
        String jenis_pelayanan = (String) tJenisPelayanan.getSelectedItem();
        String Keterangan = tKeterangan.getText();
        
        
        Object[] values = {id_dokter, tanggalJadwal, jam_mulai, jam_selesai, ruangan, jenis_pelayanan,Keterangan};
        String condition = "id_jadwal = " + id_jadwal; //
        System.out.println(condition);
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columnsUpdate, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(JadwalDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed

        String id_pasien = tIdDokter.getText();
         java.sql.Date tanggalJadwal = new java.sql.Date(tTanggalJadwal.getDate().getTime());
        String jam_mulai = tJamMulai.getText();
        String jam_selesai = tJamSelesai.getText();
        String ruangan = tRuangan.getText();
        String jenis_pelayanan = (String) tJenisPelayanan.getSelectedItem();
        String Keterangan = tKeterangan.getText();
        
        Object[] values = {"0", id_pasien,tanggalJadwal, jam_mulai, jam_selesai, ruangan, jenis_pelayanan, Keterangan};
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tabJadwalDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabJadwalDokterMouseClicked
        int selectedRowIndex =  tabJadwalDokter.getSelectedRow();
        String a = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String b = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String c = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String d = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String e = tabmode.getValueAt(selectedRowIndex, 4).toString();
        String f = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String g = tabmode.getValueAt(selectedRowIndex, 6).toString();
        String h = tabmode.getValueAt(selectedRowIndex, 7).toString();
        String i = tabmode.getValueAt(selectedRowIndex, 8).toString();
        tIdJadwal.setText(a);
        tIdDokter.setText(b);
        tNamaDokter.setText(c);
        tTanggalJadwal.setDate(java.sql.Date.valueOf(d));
        tJamMulai.setText(e);
        tJamSelesai.setText(f);
        tRuangan.setText(g);
        tJenisPelayanan.setSelectedItem(h);
        tKeterangan.setText(i);
        
        
    }//GEN-LAST:event_tabJadwalDokterMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bCariDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariDokterActionPerformed
        // TODO add your handling code here:
        String id_dokter = tIdDokter.getText();
        
        // Query Find pasien by Id
        String sql = "SELECT nama_dokter FROM dokter WHERE id_dokter = " + id_dokter;
        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String nama_dokter = res.getString("nama_dokter");
                tNamaDokter.setText(nama_dokter);
            }
        } catch (SQLException ex){
            Logger.getLogger(hasilPemeriksaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCariDokterActionPerformed

    private void tKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKeteranganActionPerformed

    private void tRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tRuanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tRuanganActionPerformed
    void reset(){
        rst.resetTextFields(this.getContentPane());
    }
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
            java.util.logging.Logger.getLogger(JadwalDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCariDokter;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup bgPembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tIdDokter;
    private javax.swing.JTextField tIdJadwal;
    private javax.swing.JTextField tJamMulai;
    private javax.swing.JTextField tJamSelesai;
    private javax.swing.JComboBox<String> tJenisPelayanan;
    private javax.swing.JTextField tKeterangan;
    private javax.swing.JTextField tNamaDokter;
    private javax.swing.JTextField tRuangan;
    private com.toedter.calendar.JDateChooser tTanggalJadwal;
    private javax.swing.JTable tabJadwalDokter;
    // End of variables declaration//GEN-END:variables
}
