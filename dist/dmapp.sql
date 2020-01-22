-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Jan 2020 pada 16.11
-- Versi Server: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dmapp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `indikator`
--

CREATE TABLE IF NOT EXISTS `indikator` (
`id` bigint(20) NOT NULL,
  `wilayah` varchar(50) NOT NULL,
  `pm10` smallint(2) NOT NULL,
  `so2` smallint(2) NOT NULL,
  `co` smallint(2) NOT NULL,
  `ozon` smallint(2) NOT NULL,
  `no2` smallint(2) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `rerata` varchar(10) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data untuk tabel `indikator`
--

INSERT INTO `indikator` (`id`, `wilayah`, `pm10`, `so2`, `co`, `ozon`, `no2`, `kategori`, `rerata`) VALUES
(5, 'DKI-1', 75, 14, 82, 71, 68, 'Sedang', ' 0.62'),
(6, 'DKI-4', 79, 67, 82, 64, 70, 'Buruk', ' 0.724'),
(7, 'DKI-3', 45, 19, 37, 40, 11, 'Baik', ' 0.304'),
(8, 'DKI-2', 14, 21, 45, 38, 86, 'Baik', ' 0.408');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `indikator`
--
ALTER TABLE `indikator`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `indikator`
--
ALTER TABLE `indikator`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
