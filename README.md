# Perpustakaan App Staging

Perpustakaan App Prod adalah sebuah aplikasi manajemen perpustakaan yang dikembangkan menggunakan Java. Aplikasi ini menggunakan database MYSQL

## Deskripsi

Aplikasi ini memungkinkan pengguna untuk melakukan manajemen data perpustakaan, termasuk pengelolaan buku, anggota, peminjaman, dan lainnya. Aplikasi ini dikembangkan dengan menggunakan Java Swing untuk antarmuka pengguna.

## Fitur Utama

- Manajemen Buku: Tambah, edit, dan hapus informasi buku.
- Manajemen Anggota: Kelola data anggota perpustakaan.
- Manajemen Admin Staff: Kelola data staff perpustakaan.
- Peminjaman Buku: Catat peminjaman dan pengembalian buku oleh anggota.
- DLL.

## Persyaratan Sistem

- Java Development Kit (JDK) versi 8 atau lebih baru.
- NetBeans IDE (opsional, untuk pengembangan).
- XAMPP Control Panel

## Instalasi

1. Pastikan JDK sudah terinstal dan terkonfigurasi dengan benar.
2. Clone repositori ini ke dalam direktori lokal Anda.
3. Jalankan XAMPP dan buka phpmyadmin (mySQL)
4. Buatlah database dengan nama : staging_perpustakaan
5. Jalankan query dibawah ini
-- Create table staff
CREATE TABLE staf (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255),
    password VARCHAR(255),
    nama VARCHAR(255),
    jenis_kelamin VARCHAR(10),
    no_telp VARCHAR(15)
);

-- Insert data staff
INSERT INTO staf (username, password, nama, jenis_kelamin, no_telp) 
VALUES 
('admin', '123', 'admin', 'Laki-laki', '123456789');

6. Buka proyek menggunakan NetBeans IDE atau IDE Java lainnya.
7. Atur konfigurasi koneksi database sesuai dengan kebutuhan Anda.
8. Jalankan proyek dan aplikasi akan terbuka.
