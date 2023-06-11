-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 11, 2023 at 05:11 PM
-- Server version: 8.0.30
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pendaftaranpasien`
--

-- --------------------------------------------------------

--
-- Table structure for table `apoteker`
--

CREATE TABLE `apoteker` (
  `id_apoteker` int NOT NULL,
  `id_pasien` int NOT NULL,
  `keluhan` varchar(100) NOT NULL,
  `jumlah_obat` int NOT NULL,
  `jenis_obat` varchar(50) NOT NULL,
  `status` enum('Tebus','Tidak Tebus') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int NOT NULL,
  `nama_dokter` varchar(70) NOT NULL,
  `pangkat` varchar(50) NOT NULL,
  `shift` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `pangkat`, `shift`) VALUES
(2, 'Afghan', 'IV/c', 'Pagi'),
(3, 'Eka', 'IV/b', 'Siang'),
(5, 'Dr. Andi', 'II/a', 'Pagi'),
(6, 'Dr. Budi', 'II/b', 'Siang'),
(7, 'Dr. Cindy', 'II/c', 'Pagi'),
(8, 'Dr. Dodi', 'II/d', 'Malam'),
(9, 'Dr. Eka', 'III/a', 'Siang'),
(10, 'Dr. Fani', 'III/b', 'Malam'),
(11, 'Dr. Gina', 'IV/a', 'Pagi'),
(12, 'Dr. Hadi', 'IV/b', 'Siang'),
(13, 'Dr. Indah', 'IV/c', 'Malam');

-- --------------------------------------------------------

--
-- Table structure for table `hasil_pemeriksaan`
--

CREATE TABLE `hasil_pemeriksaan` (
  `id_hasilPemeriksaan` int NOT NULL,
  `id_pasien` int NOT NULL,
  `tensi_darah` varchar(50) NOT NULL,
  `hasil_diagnosa_sementara` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `hasil_pemeriksaan`
--

INSERT INTO `hasil_pemeriksaan` (`id_hasilPemeriksaan`, `id_pasien`, `tensi_darah`, `hasil_diagnosa_sementara`) VALUES
(5, 29, 'Tinggi', 'Test');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_dokter`
--

CREATE TABLE `jadwal_dokter` (
  `id_jadwal` int NOT NULL,
  `id_dokter` int NOT NULL,
  `tanggal_jadwal` date NOT NULL,
  `jam_mulai` varchar(25) NOT NULL,
  `jam_selesai` varchar(25) NOT NULL,
  `ruangan` int NOT NULL,
  `jenis_pelayanan` varchar(60) NOT NULL,
  `keterangan` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `jadwal_dokter`
--

INSERT INTO `jadwal_dokter` (`id_jadwal`, `id_dokter`, `tanggal_jadwal`, `jam_mulai`, `jam_selesai`, `ruangan`, `jenis_pelayanan`, `keterangan`) VALUES
(1, 1, '2023-06-12', '08:00', '12:00', 101, 'Umum', 'Jadwal reguler'),
(2, 2, '2023-06-13', '09:00', '13:00', 102, 'Gigi', 'Jadwal reguler'),
(3, 3, '2023-06-14', '10:00', '14:00', 103, 'Kulit', 'Jadwal reguler'),
(4, 4, '2023-06-15', '11:00', '15:00', 104, 'Mata', 'Jadwal reguler'),
(5, 5, '2023-06-16', '12:00', '16:00', 105, 'Jantung', 'Jadwal reguler'),
(6, 6, '2023-06-17', '13:00', '17:00', 106, 'Paru', 'Jadwal reguler'),
(7, 7, '2023-06-18', '14:00', '18:00', 107, 'Kulit', 'Jadwal reguler');

-- --------------------------------------------------------

--
-- Table structure for table `kasir`
--

CREATE TABLE `kasir` (
  `id_invoice` int NOT NULL,
  `id_pasien` int NOT NULL,
  `tagihan_pasien` int NOT NULL,
  `status_pembayaran` enum('Lunas','Belum Lunas') NOT NULL,
  `total_biaya` int NOT NULL,
  `cash` int NOT NULL,
  `kembalian` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `kasir`
--

INSERT INTO `kasir` (`id_invoice`, `id_pasien`, `tagihan_pasien`, `status_pembayaran`, `total_biaya`, `cash`, `kembalian`) VALUES
(3, 29, 500000, 'Lunas', 900000, 500000, 400000),
(5, 29, 500000, 'Lunas', 900000, 500000, 400000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int NOT NULL,
  `nama_pasien` varchar(50) NOT NULL,
  `nik` varchar(60) NOT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(30) NOT NULL,
  `keluhan` varchar(50) NOT NULL,
  `pembayaran` varchar(40) NOT NULL,
  `nama_pendamping` varchar(100) NOT NULL,
  `nik_pendamping` varchar(40) NOT NULL,
  `nohp_pendamping` varchar(20) NOT NULL,
  `alamat_pendamping` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `nik`, `alamat`, `no_hp`, `keluhan`, `pembayaran`, `nama_pendamping`, `nik_pendamping`, `nohp_pendamping`, `alamat_pendamping`) VALUES
(29, 'Arya Pratama', '3201020304050601', 'Jl. Melati No. 10', '081234567890', 'Sakit Kepala', 'Asuransi', 'Nadia Dewi', '3201020314151611', '081234567891', 'Jl. Anggrek No. 5'),
(30, 'Aditya Putri', '3201020304050602', 'Jl. Mawar No. 15', '081234567892', 'Demam', 'Pribadi', 'Galih Wijaya', '3201020314151612', '081234567893', 'Jl. Kenanga No. 8'),
(31, 'Aulia Pratama', '3201020304050603', 'Jl. Teratai No. 20', '081234567894', 'Flu', 'Asuransi', 'Sinta Novita', '3201020314151613', '081234567895', 'Jl. Melati No. 15'),
(32, 'Arjuna Wijaya', '3201020304050604', 'Jl. Kenanga No. 25', '081234567896', 'Sakit Tenggorokan', 'Pribadi', 'Rara Fitri', '3201020314151614', '081234567897', 'Jl. Teratai No. 10'),
(33, 'Alya Putri', '3201020304050605', 'Jl. Anggrek No. 30', '081234567898', 'Batuk', 'Asuransi', 'Deva Prasetya', '3201020314151615', '081234567899', 'Jl. Mawar No. 20'),
(34, 'Ari Wijaya', '3201020304050606', 'Jl. Melati No. 35', '081234567900', 'Sakit Punggung', 'Pribadi', 'Vina Lestari', '3201020314151616', '081234567901', 'Jl. Teratai No. 25'),
(35, 'Amira Dewi', '3201020304050607', 'Jl. Kenanga No. 40', '081234567902', 'Sakit Mata', 'Asuransi', 'Fajar Pratama', '3201020314151617', '081234567903', 'Jl. Melati No. 30'),
(36, 'Aryan Putra', '3201020304050608', 'Jl. Mawar No. 45', '081234567904', 'Sakit Gigi', 'Pribadi', 'Nia Prasetya', '3201020314151618', '081234567905', 'Jl. Anggrek No. 35'),
(37, 'Afghan Eka Pangestu', '3201020304050609', 'Jl. Kenanga No. 45', '081234567906', 'Sakit Lambung', 'Asuransi', 'Dito Wijaya', '3201020314151619', '081234567907', 'Jl. Kenanga No. 45'),
(38, 'Alya Putri', '3201020304050610', 'Jl. Anggrek No. 55', '081234567908', 'Sakit Telinga', 'Pribadi', 'Rara Prasetya', '3201020314151620', '081234567909', 'Jl. Mawar No. 40');

-- --------------------------------------------------------

--
-- Table structure for table `resep`
--

CREATE TABLE `resep` (
  `id_resep` int NOT NULL,
  `id_pasien` int NOT NULL,
  `id_dokter` int NOT NULL,
  `tanggal_resep` date NOT NULL,
  `obat` varchar(60) NOT NULL,
  `dosis` varchar(60) NOT NULL,
  `aturan_pakai` varchar(60) NOT NULL,
  `catatan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `resep`
--

INSERT INTO `resep` (`id_resep`, `id_pasien`, `id_dokter`, `tanggal_resep`, `obat`, `dosis`, `aturan_pakai`, `catatan`) VALUES
(1, 29, 10, '2023-06-12', 'Paracetamol', '500 mg', '1 tablet 3 kali sehari', 'Sesudah makan'),
(2, 30, 2, '2023-06-13', 'Amoxicillin', '250 mg', '1 kapsul 2 kali sehari', 'Sebelum makan'),
(3, 31, 3, '2023-06-14', 'Loratadine', '10 mg', '1 tablet per hari', 'Tidak ada catatan'),
(4, 32, 4, '2023-06-15', 'Omeprazole', '20 mg', '1 tablet sebelum makan pagi', 'Minum dengan air'),
(5, 33, 5, '2023-06-16', 'Simvastatin', '20 mg', '1 tablet sebelum tidur', 'Jangan melebihi dosis'),
(6, 34, 6, '2023-06-17', 'Metformin', '500 mg', '1 tablet 3 kali sehari', 'Simpan di tempat sejuk'),
(7, 35, 7, '2023-06-18', 'Ibuprofen', '400 mg', '1 tablet 3 kali sehari', 'Hati-hati terhadap alergi');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apoteker`
--
ALTER TABLE `apoteker`
  ADD PRIMARY KEY (`id_apoteker`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `hasil_pemeriksaan`
--
ALTER TABLE `hasil_pemeriksaan`
  ADD PRIMARY KEY (`id_hasilPemeriksaan`),
  ADD KEY `id_pasien` (`id_pasien`);

--
-- Indexes for table `jadwal_dokter`
--
ALTER TABLE `jadwal_dokter`
  ADD PRIMARY KEY (`id_jadwal`);

--
-- Indexes for table `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_invoice`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`id_resep`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apoteker`
--
ALTER TABLE `apoteker`
  MODIFY `id_apoteker` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id_dokter` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `hasil_pemeriksaan`
--
ALTER TABLE `hasil_pemeriksaan`
  MODIFY `id_hasilPemeriksaan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `jadwal_dokter`
--
ALTER TABLE `jadwal_dokter`
  MODIFY `id_jadwal` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `kasir`
--
ALTER TABLE `kasir`
  MODIFY `id_invoice` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `resep`
--
ALTER TABLE `resep`
  MODIFY `id_resep` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hasil_pemeriksaan`
--
ALTER TABLE `hasil_pemeriksaan`
  ADD CONSTRAINT `id_dokter` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
