/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan_app_staging;

import javax.swing.JFrame;
/**
 *
 * @author elang.nugraha
 */
public class perpustakaan_app_staging {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas formLogin
        formLogin loginForm = new formLogin();
        
        // Mengatur operasi standar ketika form login ditutup
        loginForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Menampilkan form login
        loginForm.setVisible(true);
    }
    
}
