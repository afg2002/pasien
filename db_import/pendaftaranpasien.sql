-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 10, 2023 at 07:41 AM
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
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int NOT NULL,
  `nama_dokter` varchar(70) NOT NULL,
  `pangkat` varchar(50) NOT NULL,
  `shift` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `pangkat`, `shift`) VALUES
(2, 'Afghan', 'IV/c', 'Pagi');

-- --------------------------------------------------------

--
-- Table structure for table `hasil_pemeriksaan`
--

CREATE TABLE `hasil_pemeriksaan` (
  `id_hasilPemeriksaan` int NOT NULL,
  `id_pasien` int NOT NULL,
  `tensi_darah` varchar(50) NOT NULL,
  `hasil_diagnosa_sementara` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `nik`, `alamat`, `no_hp`, `keluhan`, `pembayaran`, `nama_pendamping`, `nik_pendamping`, `nohp_pendamping`, `alamat_pendamping`) VALUES
(7, 'Bunga Juwita', '202043501782', 'Bojonggede', '0822838', 'Sakit Perut', 'Asuransi', 'Afghan', '202043501823', '085182838523', 'Bojonggede');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Indexes for dumped tables
--

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
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id_dokter` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `hasil_pemeriksaan`
--
ALTER TABLE `hasil_pemeriksaan`
  MODIFY `id_hasilPemeriksaan` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

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
