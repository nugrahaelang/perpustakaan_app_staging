package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi_staging {
    private static final String URL = "jdbc:mysql://localhost:3306/staging_perpustakaan";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = ""; 
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            Connection connection = koneksi_staging.getConnection();
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
               
                koneksi_staging.closeConnection(connection);
            } else {
                System.out.println("Gagal terhubung ke database.");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
        }
    }
}
