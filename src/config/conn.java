
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conn {
    private static final String URL = "jdbc:mysql://192.168.80.101:3306/prod_perpustakaan";
    private static final String USERNAME = "projek"; 
    private static final String PASSWORD = "@YabQz3Q7Nzr"; 
    
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
            Connection connection = conn.getConnection();
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
               
                conn.closeConnection(connection);
            } else {
                System.out.println("Gagal terhubung ke database.");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
        }
    }
    
}
