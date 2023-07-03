/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formdata;

import helper.database;
import helper.reset;
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author afgha
 */
public class Apoteker extends javax.swing.JFrame {
    
    ArrayList<String> selectedValues = new ArrayList<>();

    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset rst = new reset();
    String table = "apoteker";
    String[] columns = {"id_apoteker", "id_pasien", "keluhan","jumlah_obat", "jenis_obat", "status"};
    String[] columnsUpdate = {"id_pasien", "keluhan","jumlah_obat", "jenis_obat", "status"};
    
    public Apoteker() {
        initComponents();
        datatable();
        tIdApoteker.setEditable(true);
        cbTablet.addActionListener(e -> {
        if (cbTablet.isSelected()) {
                selectedValues.add(cbTablet.getText());
            } else {
                selectedValues.remove(cbTablet.getText());
            }
        });

        cbSyrup.addActionListener(e -> {
            if (cbSyrup.isSelected()) {
                selectedValues.add(cbSyrup.getText());
            } else {
                selectedValues.remove(cbSyrup.getText());
            }
        });

        cbKaplet.addActionListener(e -> {
            if (cbKaplet.isSelected()) {
                selectedValues.add(cbKaplet.getText());
            } else {
                selectedValues.remove(cbKaplet.getText());
            }
        });
        
        cbPuyer.addActionListener(e -> {
            if (cbPuyer.isSelected()) {
                selectedValues.add(cbPuyer.getText());
            } else {
                selectedValues.remove(cbPuyer.getText());
            }
        });
    }
    
    // Append value to array    
    public static String[] appendToArray(String value, String[] array) {
        String[] newArray = new String[array.length + 1];
        
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        
        newArray[newArray.length - 1] = value;
        return newArray;
    }
    
    
     protected void datatable(){
        Object[] Baris = {"ID Apoteker ","ID Pasien","Nama Pasien","Keluhan","Jumlah Obat", "Jenis Obat", "Status"};
        tabmode  = new DefaultTableModel(null, Baris);
        tApoteker.setModel(tabmode);
        String sql = "SELECT apoteker.id_apoteker,pasien.id_pasien, pasien.nama_pasien, pasien.Keluhan, apoteker.jumlah_obat, apoteker.jenis_obat, apoteker.status FROM apoteker INNER JOIN pasien ON apoteker.id_pasien = pasien.id_pasien";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("apoteker.id_apoteker");
                String b= res.getString("nama_pasien");
                String d= res.getString("keluhan");
                String e = res.getString("jumlah_obat");
                String f = res.getString("jenis_obat");
                String g = res.getString("status");
                String h = res.getString("id_pasien");
                String[] data = {a,h,b,d,e,f,g};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Apoteker.class.getName()).log(Level.SEVERE, null, ex);
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
        tIdPasien = new javax.swing.JTextField();
        tKeluhan = new javax.swing.JTextField();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tApoteker = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        bCariPasien = new javax.swing.JButton();
        tJumlahObat = new javax.swing.JTextField();
        cbTablet = new javax.swing.JCheckBox();
        cbKaplet = new javax.swing.JCheckBox();
        cbSyrup = new javax.swing.JCheckBox();
        cbPuyer = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tIdApoteker = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tNamaPasien = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tCari = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();

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
        jLabel1.setText("Apoteker");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jayakarta-resized-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel3.setText("ID Pasien");

        jLabel4.setText("Keluhan");

        jLabel5.setText("Jumlah Obat");

        tKeluhan.setEnabled(false);
        tKeluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKeluhanActionPerformed(evt);
            }
        });

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

        tApoteker.setModel(new javax.swing.table.DefaultTableModel(
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
        tApoteker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tApotekerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tApoteker);

        jLabel6.setText("Jenis Obat");

        bCariPasien.setText("Cari");
        bCariPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariPasienActionPerformed(evt);
            }
        });

        tJumlahObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJumlahObatActionPerformed(evt);
            }
        });

        cbTablet.setText("Tablet");
        cbTablet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTabletItemStateChanged(evt);
            }
        });
        cbTablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTabletActionPerformed(evt);
            }
        });

        cbKaplet.setText("Kaplet");
        cbKaplet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKapletItemStateChanged(evt);
            }
        });
        cbKaplet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKapletActionPerformed(evt);
            }
        });

        cbSyrup.setText("Syrup");
        cbSyrup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSyrupItemStateChanged(evt);
            }
        });
        cbSyrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSyrupActionPerformed(evt);
            }
        });

        cbPuyer.setText("Puyer");
        cbPuyer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPuyerItemStateChanged(evt);
            }
        });
        cbPuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPuyerActionPerformed(evt);
            }
        });

        jLabel8.setText("Status");

        cStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=== Pilih Status ===", "Tebus", "Tidak Tebus" }));

        jLabel9.setText("ID Apoteker");

        jLabel10.setText("Nama Pasien");

        jLabel11.setText("Cari");

        bCari.setText("Cari Data");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEdit)
                        .addGap(18, 18, 18)
                        .addComponent(bHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCariPasien))
                            .addComponent(tIdApoteker, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tKeluhan)
                                .addComponent(tJumlahObat)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbKaplet)
                                        .addComponent(cbTablet))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbSyrup)
                                        .addComponent(cbPuyer)))
                                .addComponent(cStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bCari)))
                .addGap(33, 33, 33))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tIdApoteker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCariPasien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tJumlahObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbTablet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbKaplet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPuyer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSyrup)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit)
                            .addComponent(bReset)
                            .addComponent(bHapus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCari))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String id_apoteker = tIdApoteker.getText();
        try {
            String condition = "id_apoteker = " + id_apoteker;
            db.deleteData(conn, "apoteker", condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
       String delimiter = ",";
        
        StringBuilder sb = new StringBuilder(); 
        
        for (int i = 0; i < selectedValues.size(); i++) {
            sb.append(selectedValues.get(i));
            
            if (i < selectedValues.size() - 1) {
                sb.append(delimiter);
            }
        }
        
       String jenisObat = sb.toString();
        
       String id_apoteker = tIdApoteker.getText();
       String id_pasien = tIdPasien.getText();
       String keluhan = tKeluhan.getText();
       String jumlah_obat = tJumlahObat.getText();
       String status = (String)cStatus.getSelectedItem();
       Object[] values = {id_pasien, keluhan, jumlah_obat,jenisObat, status};
       String condition = "id_apoteker= " + id_apoteker; //
       
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columnsUpdate, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        String delimiter = ",";
        
        StringBuilder sb = new StringBuilder(); 
        
        for (int i = 0; i < selectedValues.size(); i++) {
            sb.append(selectedValues.get(i));
            
            if (i < selectedValues.size() - 1) {
                sb.append(delimiter);
            }
        }
        
        String id_pasien = tIdPasien.getText();
        String jumlah_obat = tJumlahObat.getText();
        String status = (String) cStatus.getSelectedItem();
        String keluhan = tKeluhan.getText();
        
        String jenisObat = sb.toString();
        
        Object[] values = {"0", id_pasien, keluhan,jumlah_obat,jenisObat, status};
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Dokter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void tApotekerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tApotekerMouseClicked
        int selectedRowIndex =  tApoteker.getSelectedRow();
        String a = tabmode.getValueAt(selectedRowIndex, 0).toString();
        String b = tabmode.getValueAt(selectedRowIndex, 1).toString();
        String c = tabmode.getValueAt(selectedRowIndex, 2).toString();
        String d = tabmode.getValueAt(selectedRowIndex, 3).toString();
        String e = tabmode.getValueAt(selectedRowIndex, 4).toString();
//        String f = tabmode.getValueAt(selectedRowIndex, 5).toString();
        String f = tabmode.getValueAt(selectedRowIndex, 6).toString();
        
        tIdApoteker.setText(a);
        tIdPasien.setText(b);
        tNamaPasien.setText(c);
        tKeluhan.setText(d);
        tJumlahObat.setText(e);
        cStatus.setSelectedItem(f);
        tIdApoteker.setEditable(false);
    }//GEN-LAST:event_tApotekerMouseClicked

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
    }//GEN-LAST:event_bResetActionPerformed

    private void bCariPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariPasienActionPerformed
        // TODO add your handling code here:
        String id_pasien = tIdPasien.getText();
        
        // Query Find pasien by Id
        String sql = "SELECT nama_pasien, keluhan FROM pasien WHERE id_pasien = " + id_pasien;
        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String keluhan = res.getString("keluhan");
                String nama_pasien = res.getString("nama_pasien");
                tKeluhan.setText(keluhan);
                tNamaPasien.setText(nama_pasien);
            }
        } catch (SQLException ex){
            Logger.getLogger(hasilPemeriksaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCariPasienActionPerformed

    private void tKeluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKeluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKeluhanActionPerformed

    private void tJumlahObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlahObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJumlahObatActionPerformed

    private void cbTabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabletActionPerformed

    private void cbKapletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKapletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKapletActionPerformed

    private void cbSyrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSyrupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSyrupActionPerformed

    private void cbPuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPuyerActionPerformed

    private void cbTabletItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTabletItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTabletItemStateChanged

    private void cbKapletItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKapletItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKapletItemStateChanged

    private void cbPuyerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPuyerItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPuyerItemStateChanged

    private void cbSyrupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSyrupItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSyrupItemStateChanged

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
        String cari = tCari.getText().trim(); // Menghapus spasi di awal dan akhir input
        String sql;

        if (cari.isEmpty() || cari.equals("*")) {
            sql = "SELECT apoteker.id_apoteker, pasien.id_pasien, pasien.nama_pasien, pasien.Keluhan, "
                    + "apoteker.jumlah_obat, apoteker.jenis_obat, apoteker.status FROM apoteker INNER JOIN pasien ON apoteker.id_pasien = pasien.id_pasien";
        } else {
            sql = "SELECT apoteker.id_apoteker, pasien.id_pasien, pasien.nama_pasien, pasien.Keluhan, "
                    + "apoteker.jumlah_obat, apoteker.jenis_obat, apoteker.status FROM apoteker INNER JOIN pasien ON apoteker.id_pasien = pasien.id_pasien WHERE id_apoteker = " + cari;
        }

        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            DefaultTableModel tabmode = (DefaultTableModel) tApoteker.getModel();
            tabmode.setRowCount(0); // Menghapus semua baris pada tabel

            while (res.next()) {
                String a = res.getString("apoteker.id_apoteker");
                String b = res.getString("nama_pasien");
                String d = res.getString("keluhan");
                String e = res.getString("jumlah_obat");
                String f = res.getString("jenis_obat");
                String g = res.getString("status");
                String h = res.getString("id_pasien");
                String[] data = {a, h, b, d, e, f, g};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Apoteker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bCariActionPerformed
        void reset(){
        rst.resetTextFields(this.getContentPane());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apoteker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JButton bCariPasien;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup bgPembayaran;
    private javax.swing.JComboBox<String> cStatus;
    private javax.swing.JCheckBox cbKaplet;
    private javax.swing.JCheckBox cbPuyer;
    private javax.swing.JCheckBox cbSyrup;
    private javax.swing.JCheckBox cbTablet;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tApoteker;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tIdApoteker;
    private javax.swing.JTextField tIdPasien;
    private javax.swing.JTextField tJumlahObat;
    private javax.swing.JTextField tKeluhan;
    private javax.swing.JTextField tNamaPasien;
    // End of variables declaration//GEN-END:variables
}
