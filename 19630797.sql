-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2023 at 08:47 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `19630797`
--

-- --------------------------------------------------------

--
-- Table structure for table `db_mobil`
--

CREATE TABLE `db_mobil` (
  `id_mobil` int(10) NOT NULL,
  `nama_mobil` varchar(30) NOT NULL,
  `merk_mobil` varchar(30) NOT NULL,
  `harga_rental` bigint(30) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `db_mobil`
--

INSERT INTO `db_mobil` (`id_mobil`, `nama_mobil`, `merk_mobil`, `harga_rental`, `status`) VALUES
(144, 'KIJANG', 'ANOVA', 1000000, 'READY'),
(155, 'BMW', 'SERIES 3', 1000000, 'READY'),
(122, 'DAIHATSU', 'XPANDER', 1000000, 'READY'),
(111, 'Bugati', 'Veyron', 1000000, 'READY'),
(133, 'BMW', '840i', 1000000, 'READY'),
(323, 'Lamborghini', 'Xs3', 34000000, 'READY');

-- --------------------------------------------------------

--
-- Table structure for table `db_penyewa`
--

CREATE TABLE `db_penyewa` (
  `id_penyewa` int(10) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `no_hp` varchar(30) NOT NULL,
  `no_ktp` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `db_penyewa`
--

INSERT INTO `db_penyewa` (`id_penyewa`, `nama_penyewa`, `no_hp`, `no_ktp`, `alamat`, `status`) VALUES
(121, 'Martina Halimah', '083841418332', '360009222', 'Banten', 'Ready'),
(123, 'Riski', '0898987655', '36000000111', 'Bogor ', 'Ready'),
(124, 'Halimah', '083841418765', '360000987', 'ciater permai', 'Ready'),
(125, 'Tina', '08765487765', '367098765', 'serpong', 'Ready'),
(126, 'Martina ', '083841418332', '360009876', 'Tangerang ', 'Ready'),
(127, 'Andre', '08123121213', '354535435', 'Barambai', 'Ready');

-- --------------------------------------------------------

--
-- Table structure for table `db_transaksi`
--

CREATE TABLE `db_transaksi` (
  `id_penyewa` int(10) NOT NULL,
  `nama_penyewa` varchar(50) NOT NULL,
  `id_mobil` varchar(50) NOT NULL,
  `tgl_pinjam` varchar(30) NOT NULL,
  `tgl_kembali` varchar(30) NOT NULL,
  `harga` bigint(30) NOT NULL,
  `lama` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `db_transaksi`
--

INSERT INTO `db_transaksi` (`id_penyewa`, `nama_penyewa`, `id_mobil`, `tgl_pinjam`, `tgl_kembali`, `harga`, `lama`, `total`) VALUES
(121, 'Martina ', '111', '11-07-2021', '13-07-2021', 1000000, '2', '2000000'),
(123, 'Riski', '144', '11-07-2021', '14-07-2021', 1000000, '2', '2000000'),
(124, 'Halimah', '155', '11-07-2021', '13-07-2021', 1000000, '2', '2000000'),
(126, 'Martina ', '122', '11-07-2021', '13-07-2021', 1000000, '2', '2000000'),
(127, 'Andre', '327', '8-01-2023', '10-01-2023', 23000000, '3', '69000000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `db_penyewa`
--
ALTER TABLE `db_penyewa`
  ADD PRIMARY KEY (`id_penyewa`);

--
-- Indexes for table `db_transaksi`
--
ALTER TABLE `db_transaksi`
  ADD PRIMARY KEY (`id_penyewa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
