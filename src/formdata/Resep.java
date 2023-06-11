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
public class Resep extends javax.swing.JFrame {
    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset rst = new reset();
    String table = "resep";
    String[] columns = {"id_resep","id_dokter","id_pasien","tanggal_resep","obat","dosis","aturan_pakai","catatan"};
    String[] columnsUpdate = {"id_dokter","id_pasien","tanggal_resep","obat","dosis","aturan_pakai","catatan"};
    

    
    public Resep() {
        initComponents();
        datatable();
    }
    
     protected void datatable(){
        Object[] Baris = {"id_resep","id_dokter","nama_dokter","id_pasien","nama_pasien","tanggal_resep","obat","dosis","aturan_pakai","catatan"};
        tabmode  = new DefaultTableModel(null, Baris);
        tabResep.setModel(tabmode);
        String sql = "SELECT r.id_resep, r.id_dokter, d.nama_dokter, r.id_pasien, p.nama_pasien, "
                + "r.tanggal_resep, r.obat, r.dosis, r.aturan_pakai, r.catatan "
                + "FROM resep AS r INNER JOIN pasien AS p ON r.id_pasien = p.id_pasien "
                + "INNER JOIN dokter AS d ON r.id_dokter = d.id_dokter;";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("id_resep");
                String b= res.getString("id_dokter");
                String c= res.getString("nama_dokter");
                String d = res.getString("id_pasien");
                String e = res.getString("nama_pasien");
                String f = res.getString("tanggal_resep");
                String g = res.getString("obat");
                String h = res.getString("dosis");
                String i = res.getString("aturan_pakai");
                String j = res.getString("catatan");
                String[] data = {a,b,c,d,e,f,g,h,i,j};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Resep.class.getName()).log(Level.SEVERE, null, ex);
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
        tIdResep = new javax.swing.JTextField();
        tIdDokter = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabResep = new javax.swing.JTable();
        bCariDokter = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tNamaDokter = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tIdPasien = new javax.swing.JTextField();
        tNamaPasien = new javax.swing.JTextField();
        bCariPasien = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tObat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tDosis = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tAturanPakai = new javax.swing.JTextField();
        tCatatan = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tTanggalResep = new com.toedter.calendar.JDateChooser();

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
        jLabel1.setText("Resep yang dikeluarkan");

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
                .addGap(253, 253, 253)
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

        jLabel3.setText("ID Resep");

        jLabel4.setText("ID Dokter");

        tIdResep.setEnabled(false);

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

        tabResep.setModel(new javax.swing.table.DefaultTableModel(
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
        tabResep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResepMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabResep);

        bCariDokter.setText("Cari");
        bCariDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariDokterActionPerformed(evt);
            }
        });

        jLabel12.setText("Nama Dokter");

        jLabel13.setText("Nama Pasien");

        jLabel5.setText("ID Pasien");

        bCariPasien.setText("Cari");
        bCariPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariPasienActionPerformed(evt);
            }
        });

        jLabel14.setText("Tanggal Resep");

        jLabel15.setText("Obat");

        jLabel16.setText("Dosis");

        jLabel17.setText("Aturan Pakai");

        jLabel18.setText("Catatan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tIdResep)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tIdDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCariDokter))
                            .addComponent(tNamaDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCariPasien))
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tAturanPakai, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tTanggalResep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEdit)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bReset)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit)
                            .addComponent(bReset)
                            .addComponent(bHapus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tIdResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCariPasien))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(tTanggalResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(tObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tAturanPakai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tCatatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        int id_resep = Integer.parseInt(tIdResep.getText());
        try {
            String condition = "id_resep = " + id_resep;
            db.deleteData(conn, table, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Resep.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        String id_resep = tIdResep.getText();
        String id_dokter = tIdDokter.getText();
        String id_pasien = tIdPasien.getText();
        java.sql.Date tanggalResep = new java.sql.Date(tTanggalResep.getDate().getTime());
        String obat = tObat.getText();
        String dosis = tDosis.getText();
        String catatan = tCatatan.getText();
        String aturan_pakai = tAturanPakai.getText();
        
        
        Object[] values = {id_dokter, id_pasien, tanggalResep, obat,dosis,aturan_pakai,catatan};
        String condition = "id_resep = " + id_resep; //
        System.out.println(condition);
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columnsUpdate, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Resep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed

        String id_dokter = tIdDokter.getText();
        String id_pasien = tIdPasien.getText();
        java.sql.Date tanggalResep = new java.sql.Date(tTanggalResep.getDate().getTime());
        String obat = tObat.getText();
        String dosis = tDosis.getText();
        String catatan = tCatatan.getText();
        String aturan_pakai = tAturanPakai.getText();
       
        
        Object[] values = {"0", id_dokter, id_pasien, tanggalResep, obat,dosis,aturan_pakai,catatan};
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tabResepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResepMouseClicked
        int selectedRowIndex =  tabResep.getSelectedRow();
        String a = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String b = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String c = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String d = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String e = tabmode.getValueAt(selectedRowIndex, 4).toString();
        String f = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String g = tabmode.getValueAt(selectedRowIndex, 6).toString();
        String h = tabmode.getValueAt(selectedRowIndex, 7).toString();
        String i = tabmode.getValueAt(selectedRowIndex, 8).toString();
        String j = tabmode.getValueAt(selectedRowIndex, 9).toString();
        tIdResep.setText(a);
        tIdDokter.setText(b);
        tNamaDokter.setText(c);
        tIdPasien.setText(d);
        tNamaPasien.setText(e);
        tObat.setText(g);
        tDosis.setText(h);
        tAturanPakai.setText(i);
        tCatatan.setText(j);
        tTanggalResep.setDate(java.sql.Date.valueOf(f));
        
        
    }//GEN-LAST:event_tabResepMouseClicked

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

    private void bCariPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariPasienActionPerformed
        // TODO add your handling code here:
        String id_pasien = tIdPasien.getText();
        
        // Query Find pasien by Id
        String sql = "SELECT nama_pasien FROM pasien WHERE id_pasien = " + id_pasien;
        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String nama_pasien = res.getString("nama_pasien");
                tNamaPasien.setText(nama_pasien);
            }
        } catch (SQLException ex){
            Logger.getLogger(hasilPemeriksaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCariPasienActionPerformed
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
            java.util.logging.Logger.getLogger(Resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Resep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCariDokter;
    private javax.swing.JButton bCariPasien;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup bgPembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tAturanPakai;
    private javax.swing.JTextField tCatatan;
    private javax.swing.JTextField tDosis;
    private javax.swing.JTextField tIdDokter;
    private javax.swing.JTextField tIdPasien;
    private javax.swing.JTextField tIdResep;
    private javax.swing.JTextField tNamaDokter;
    private javax.swing.JTextField tNamaPasien;
    private javax.swing.JTextField tObat;
    private com.toedter.calendar.JDateChooser tTanggalResep;
    private javax.swing.JTable tabResep;
    // End of variables declaration//GEN-END:variables
}
