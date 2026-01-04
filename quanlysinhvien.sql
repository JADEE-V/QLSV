-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 04, 2026 lúc 07:39 PM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlysinhvien`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `student`
--

CREATE TABLE `student` (
  `maSV` varchar(30) NOT NULL,
  `hoTen` varchar(50) DEFAULT NULL,
  `lop` varchar(30) DEFAULT NULL,
  `queQuan` varchar(50) DEFAULT NULL,
  `sdt` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `maTK` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `student`
--

INSERT INTO `student` (`maSV`, `hoTen`, `lop`, `queQuan`, `sdt`, `email`, `maTK`) VALUES
('65677676', 'HGG', 'GBH', 'YG', 'GGHBHB', 'HJH', 'HJH'),
('6666666666', 'BUC', '34VF', 'NHHHHH', '90900', 'HBJHHB', '12'),
('hhhhhhhh', '', '', '', '', '', ''),
('SKSAKAS', 'DSDS', '11111111111111', 'FS', 'ƯE', 'Ứ', 'S');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`maSV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
