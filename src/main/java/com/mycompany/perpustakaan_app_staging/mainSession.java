/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.perpustakaan_app_staging;

import java.sql.Connection;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elang.nugraha
 */
public class mainSession extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public mainSession() {        
        initComponents();
        read_tbbuku();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        labelHeaderTitle = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        panelContentUtama = new javax.swing.JTabbedPane();
        tabDaftarBuku = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        btnReadBuku = new javax.swing.JButton();
        btnUpdateBuku = new javax.swing.JButton();
        btnDeleteBuku = new javax.swing.JButton();
        btnCreateBuku = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelHeaderTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHeaderTitle.setText("Sistem Informasi Perpustakaan");

        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHeaderTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(labelHeaderTitle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContentUtama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelContentUtamaMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Aksi:");

        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_buku.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tb_buku);

        btnReadBuku.setText("Read");
        btnReadBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadBukuActionPerformed(evt);
            }
        });

        btnUpdateBuku.setText("Update");
        btnUpdateBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBukuActionPerformed(evt);
            }
        });

        btnDeleteBuku.setText("Delete");
        btnDeleteBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBukuActionPerformed(evt);
            }
        });

        btnCreateBuku.setText("Create");
        btnCreateBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReadBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateBuku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteBuku)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnReadBuku)
                    .addComponent(btnUpdateBuku)
                    .addComponent(btnDeleteBuku)
                    .addComponent(btnCreateBuku))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tabDaftarBukuLayout = new javax.swing.GroupLayout(tabDaftarBuku);
        tabDaftarBuku.setLayout(tabDaftarBukuLayout);
        tabDaftarBukuLayout.setHorizontalGroup(
            tabDaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDaftarBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabDaftarBukuLayout.setVerticalGroup(
            tabDaftarBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDaftarBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContentUtama.addTab("Data Master Buku", tabDaftarBuku);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        panelContentUtama.addTab("tab2", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1053, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        panelContentUtama.addTab("tab3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContentUtama)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContentUtama)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();

        // Menampilkan form login
        formLogin loginForm = new formLogin();
        loginForm.setVisible(true);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnReadBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadBukuActionPerformed
        // TODO add your handling code here:
        read_tbbuku();
    }//GEN-LAST:event_btnReadBukuActionPerformed

    private void panelContentUtamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContentUtamaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelContentUtamaMouseClicked

    private void btnUpdateBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBukuActionPerformed
        // TODO add your handling code here:
        formTambahBuku bF = new formTambahBuku();
        bF.setVisible(true);
        int tabelData = tb_buku.getSelectedRow();
        bF.ambilIdBuku = (tb_buku.getValueAt(tabelData, 0).toString());
        bF.ambilJudulBuku = (tb_buku.getValueAt(tabelData, 1).toString());
        bF.ambilKategoriBuku = (tb_buku.getValueAt(tabelData, 2).toString());
        bF.ambilPengarangBuku = (tb_buku.getValueAt(tabelData, 3).toString());
        bF.ambilPenerbitBuku = (tb_buku.getValueAt(tabelData, 4).toString());
        bF.ambilTahunTerbitBuku = (tb_buku.getValueAt(tabelData, 5).toString());
        bF.ambilJumlahBuku = (tb_buku.getValueAt(tabelData, 6).toString());
        bF.viewData();
        read_tbbuku();
    }//GEN-LAST:event_btnUpdateBukuActionPerformed

    private void btnDeleteBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBukuActionPerformed
        // TODO add your handling code here:
        String sql = "delete from tb_buku Where id_buku=?";
        int tabelData = tb_buku.getSelectedRow();
        try {
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tb_buku.getValueAt(tabelData, 0).toString());
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        read_tbbuku();
    }//GEN-LAST:event_btnDeleteBukuActionPerformed

    private void btnCreateBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBukuActionPerformed
        // TODO add your handling code here:
        new formTambahBuku().setVisible(true);
        read_tbbuku();
    }//GEN-LAST:event_btnCreateBukuActionPerformed

    public void read_tbbuku() {
        tb_buku.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Judul");
        model.addColumn("Kategori");
        model.addColumn("Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Tahun Terbit");
        model.addColumn("Jumlah");

        try {
            String sql = "SELECT * FROM tb_buku ORDER BY id_buku ASC";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                String date = res.getString(6);
                java.sql.Date dat = java.sql.Date.valueOf(date);
                Calendar cal = Calendar.getInstance();
                cal.setTime(dat);
                int year = cal.get(Calendar.YEAR);
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), year, res.getString(7)});
            }
            tb_buku.setModel(model);
        } catch (Exception e) {
        }
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
            java.util.logging.Logger.getLogger(mainSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainSession().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton btnCreateBuku;
    javax.swing.JButton btnDeleteBuku;
    javax.swing.JButton btnLogout;
    javax.swing.JButton btnReadBuku;
    javax.swing.JButton btnUpdateBuku;
    javax.swing.JLabel jLabel7;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JScrollPane jScrollPane6;
    javax.swing.JLabel labelHeaderTitle;
    javax.swing.JTabbedPane panelContentUtama;
    javax.swing.JPanel panelHeader;
    javax.swing.JPanel tabDaftarBuku;
    javax.swing.JTable tb_buku;
    // End of variables declaration//GEN-END:variables
}