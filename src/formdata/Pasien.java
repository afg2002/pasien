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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Pasien extends javax.swing.JFrame {
    private Connection conn = new helper.database().connect();
    database db = new database();
    private DefaultTableModel tabmode;
    reset rst = new reset();
    String table = "pasien";
    String[] columns = {"id_pasien","nama_pasien","nik","alamat","no_hp","keluhan"
            ,"pembayaran","nama_pendamping","nik_pendamping","nohp_pendamping","alamat_pendamping"};
    String[] columnsUpdate = {"nama_pasien","nik","alamat","no_hp","keluhan",
        "pembayaran","nama_pendamping","nik_pendamping","nohp_pendamping","alamat_pendamping"};
    
    public Pasien() {
        initComponents();
        datatable();
    }
    
     protected void datatable(){
         Object[] Baris = {"ID ","Nama ","NIK","Alamat","NO HP","Keluhan","Pembayaran","Nama Pendamping", "Nik Pendamping","No.HP Pendamping","Alamat Pendamping"};
        tabmode  = new DefaultTableModel(null, Baris);
        tPasien.setModel(tabmode);
        String sql = "select * from pasien";
        try{
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while(res.next()){
                String a = res.getString("id_pasien");
                String b= res.getString("nama_pasien");
                String d= res.getString("nik");
                String e = res.getString("alamat");
                String f = res.getString("no_hp");
                String g = res.getString("keluhan");
                String h = res.getString("pembayaran");
                String i = res.getString("nama_pendamping");
                String j = res.getString("nik_pendamping");
                String k = res.getString("nohp_pendamping");
                String l = res.getString("alamat_pendamping");
                
                String[] data = {a,b,d,e,f,g,h,i,j,k,l};
                tabmode.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel8 = new javax.swing.JLabel();
        tIdPasien = new javax.swing.JTextField();
        tNamaPasien = new javax.swing.JTextField();
        tNik = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlamatPendamping = new javax.swing.JTextArea();
        bTambah = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tPasien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        tNoHP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tKeluhan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rPribadi = new javax.swing.JRadioButton();
        rAsuransi = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        tNamaPendamping = new javax.swing.JTextField();
        tNikPendamping = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tNoHpPendamping = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tAlamat1 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        bCetak = new javax.swing.JButton();

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
        jLabel1.setText("Data Pasien");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jayakarta-resized-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
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

        jLabel3.setText("ID Pasien");

        jLabel4.setText("Nama Pasien");

        jLabel5.setText("NIK");

        jLabel8.setText("Alamat");

        tIdPasien.setEnabled(false);

        tAlamatPendamping.setColumns(20);
        tAlamatPendamping.setRows(5);
        jScrollPane1.setViewportView(tAlamatPendamping);

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

        tPasien.setModel(new javax.swing.table.DefaultTableModel(
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
        tPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPasienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tPasien);

        jLabel6.setText("No HP");

        jLabel9.setText("Keluhan");

        jLabel10.setText("Pembayaran");

        bgPembayaran.add(rPribadi);
        rPribadi.setText("Pribadi");

        bgPembayaran.add(rAsuransi);
        rAsuransi.setText("Asuransi");

        jLabel11.setText("Nama Pendamping");

        tNamaPendamping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaPendampingActionPerformed(evt);
            }
        });

        jLabel12.setText("NIK Pendamping");

        jLabel13.setText("No HP Pendamping");

        tAlamat1.setColumns(20);
        tAlamat1.setRows(5);
        jScrollPane4.setViewportView(tAlamat1);

        jLabel14.setText("Alamat Pendamping");

        bCetak.setText("Cetak");
        bCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCetakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 1062, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rPribadi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rAsuransi))
                                    .addComponent(tKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNik, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tNoHpPendamping, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tNamaPendamping, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tNikPendamping, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bEdit)
                                .addGap(18, 18, 18)
                                .addComponent(bHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCetak)))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bTambah)
                            .addComponent(bEdit)
                            .addComponent(bReset)
                            .addComponent(bHapus)
                            .addComponent(bCetak))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tIdPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(tKeluhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rPribadi)
                                    .addComponent(rAsuransi)
                                    .addComponent(jLabel10))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tNamaPendamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tNikPendamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tNoHpPendamping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void reset(){
        rst.resetTextFields(this.getContentPane());
        bgPembayaran.clearSelection();
        tAlamatPendamping.setText("");
    }
    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
       String id_pasien = tIdPasien.getText();
       String nama_pasien = tNamaPasien.getText();
       String nik = tNik.getText();
       String alamat = tAlamatPendamping.getText();
       String no_hp  = tNoHP.getText();
       String keluhan = tKeluhan.getText();
       String pembayaran = null;
       String nama_pendamping = tNamaPendamping.getText();
       String nik_pendamping = tNikPendamping.getText();
       String nohp_pendamping = tNoHpPendamping.getText();
       String alamat_pendamping = tAlamatPendamping.getText();
       if(rPribadi.isSelected()){
           pembayaran = "Pribadi";
       }
       if(rAsuransi.isSelected()){
           pembayaran = "Asuransi";
       }
       Object[] values = {"0", nama_pasien, nik,alamat,no_hp, keluhan, pembayaran,
           nama_pendamping,nik_pendamping,nohp_pendamping,alamat_pendamping};
        try {
            db.insertData(conn, table, columns, values);
            datatable();
            reset();
            
        } catch (SQLException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
       String id_pasien = tIdPasien.getText();
       String nama_pasien = tNamaPasien.getText();
       String nik = tNik.getText();
       String alamat = tAlamatPendamping.getText();
       String no_hp  = tNoHP.getText();
       String keluhan = tKeluhan.getText();
       String pembayaran = null;
       String nama_pendamping = tNamaPendamping.getText();
       String nik_pendamping = tNikPendamping.getText();
       String nohp_pendamping = tNoHpPendamping.getText();
       String alamat_pendamping = tAlamatPendamping.getText();
        
       if(rPribadi.isSelected()){
           pembayaran = "Pribadi";
       }
       if(rAsuransi.isSelected()){
           pembayaran = "Asuransi";
       }
//       System.out.println(id_pasien+nama_pasien+nik+alamat+no_hp+keluhan+pembayaran);
        Object[] values = {nama_pasien, nik,alamat,no_hp, keluhan, pembayaran,
           nama_pendamping,nik_pendamping,nohp_pendamping,alamat_pendamping};
        String condition = "id_pasien = " + id_pasien; //
        System.out.println(condition);
        try {
            // Memanggil fungsi updateData
            db.updateData(conn, table, columnsUpdate, values, condition);
            datatable();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        String id_pasien = tIdPasien.getText();
        try {
            String condition = "id_pasien = " + id_pasien;
            db.deleteData(conn, "pasien", condition);
            datatable();
            reset();
            
        } catch (SQLException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        reset();
        tAlamat1.setText("");
        tAlamatPendamping.setText("");
    }//GEN-LAST:event_bResetActionPerformed

    private void tPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPasienMouseClicked
        int selectedRowIndex =  tPasien.getSelectedRow();
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
        String k = tabmode.getValueAt(selectedRowIndex, 10).toString();
        
        
        tIdPasien.setText(a);
        tNamaPasien.setText(b);
        tNik.setText(c);
        tAlamat1.setText(d);
        tNoHP.setText(e);
        tKeluhan.setText(f);
        tNamaPendamping.setText(h);
        tNikPendamping.setText(i);
        tNoHpPendamping.setText(j);
        tAlamatPendamping.setText(k);
        if ( g.equals("Pribadi")){
            rPribadi.setSelected(true);
//            rAsuransi.setSelected(false);
        }else if( g.equals("Asuransi")){
            rAsuransi.setSelected(true);
        }
    }//GEN-LAST:event_tPasienMouseClicked

    private void tNamaPendampingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaPendampingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaPendampingActionPerformed

    private void bCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCetakActionPerformed
        String path =".\\src\\laporan\\datapasien.jasper";
        JasperReport reports; 
        try {
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(path, null,conn);
            JasperViewer jviewer = new JasperViewer(jprint,false);
            jviewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jviewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bCetakActionPerformed

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
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCetak;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bTambah;
    private javax.swing.ButtonGroup bgPembayaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rAsuransi;
    private javax.swing.JRadioButton rPribadi;
    private javax.swing.JTextArea tAlamat1;
    private javax.swing.JTextArea tAlamatPendamping;
    private javax.swing.JTextField tIdPasien;
    private javax.swing.JTextField tKeluhan;
    private javax.swing.JTextField tNamaPasien;
    private javax.swing.JTextField tNamaPendamping;
    private javax.swing.JTextField tNik;
    private javax.swing.JTextField tNikPendamping;
    private javax.swing.JTextField tNoHP;
    private javax.swing.JTextField tNoHpPendamping;
    private javax.swing.JTable tPasien;
    // End of variables declaration//GEN-END:variables
}
