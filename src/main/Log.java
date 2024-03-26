/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import config.conn;
import java.awt.event.ActionEvent;

/**
 *
 * @author elang.nugraha
 */
public class Log extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    public Log() {
        initComponents();
        cbShowPassword.addItemListener(this::cbShowPasswordItemStateChanged);
        // Inisialisasi kode tambahan disini
        btnLogin.addActionListener(this::btnLoginActionPerformed);
//        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(533, 491));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN ONLINE");

        labelUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsername.setText("Username");

        labelPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPassword.setText("Password");

        cbShowPassword.setText("Show Password");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbShowPassword)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelUsername)
                                .addComponent(labelPassword)
                                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(btnLogin)))
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(380, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cbShowPassword)
                    .addGap(27, 27, 27)
                    .addComponent(btnLogin)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      String username = tfUsername.getText();
        String password = new String(tfPassword.getPassword());

        if (isValidLogin(username, password)) {
            // Jika login berhasil, tampilkan pesan dan tunggu sampai pengguna mengklik OK
            JOptionPane.showMessageDialog(this, "Login berhasil!");

            // Setelah pengguna mengklik OK, buka dashboard
            Runnable openDashboard = () -> {
                System.out.println("Membuka dashboard");
                Main dashboardPage = new Main();
                dashboardPage.setVisible(true); 
                System.out.println("Dashboard terbuka.");
                this.dispose(); // tutup form login
            };

            SwingUtilities.invokeLater(openDashboard);
        } else {
            // Jika login gagal, tampilkan pesan kesalahan
            JOptionPane.showMessageDialog(this, "Username atau password salah!");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private boolean isValidLogin(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            // Mendapatkan koneksi ke database
            connection = conn.getConnection();

            // Query SQL untuk memeriksa login pengguna
            String sql = "SELECT * FROM staf WHERE BINARY username = ? AND password = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            // Menjalankan query
            resultSet = statement.executeQuery();

            // Jika ada baris yang dikembalikan, maka login berhasil
            boolean isValid = resultSet.next();
            if (isValid) {
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal: username atau password salah.");
                tfUsername.setText("");
                tfPassword.setText("");
            }
            return isValid;
        } catch (SQLException e) {
            // Tambahkan pernyataan pencetakan pesan kesalahan SQL
            System.err.println("Error executing SQL query: " + e.getMessage());
            return false;
        } finally {
            // Menutup koneksi, statement, dan resultSet
            conn.closeConnection(connection);
            try {
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                // Tambahkan pernyataan pencetakan pesan kesalahan SQL
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
    
    private void cbShowPasswordItemStateChanged(java.awt.event.ItemEvent evt) {                                                
        // Menampilkan atau menyembunyikan teks pada field password berdasarkan keadaan checkbox
        if (cbShowPassword.isSelected()) {
            tfPassword.setEchoChar((char) 0); // Menampilkan teks
        } else {
            tfPassword.setEchoChar('*'); // Menyembunyikan teks dengan karakter bintang
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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    private void btnLoginAction(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}