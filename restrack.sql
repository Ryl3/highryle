-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 05:49 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restrack`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_account`
--

CREATE TABLE `tbl_account` (
  `acc_id` int(50) NOT NULL,
  `acc_type` varchar(50) NOT NULL,
  `acc_username` varchar(50) NOT NULL,
  `acc_email` varchar(50) NOT NULL,
  `acc_password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_account`
--

INSERT INTO `tbl_account` (`acc_id`, `acc_type`, `acc_username`, `acc_email`, `acc_password`) VALUES
(1, 'test', 'test', 'test', 'test');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_crew`
--

CREATE TABLE `tbl_crew` (
  `crew_id` int(50) NOT NULL,
  `acc_id` int(50) NOT NULL,
  `crew_fname` varchar(50) NOT NULL,
  `crew_lname` varchar(50) NOT NULL,
  `crew_jobtitle` varchar(50) NOT NULL,
  `crew_assignment` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `cus_id` int(50) NOT NULL,
  `acc_id` int(50) NOT NULL,
  `cus_fname` varchar(50) NOT NULL,
  `cus_lname` varchar(50) NOT NULL,
  `cus_gender` varchar(50) NOT NULL,
  `cus_contact` int(15) NOT NULL,
  `cus_birthdate` date NOT NULL,
  `cus_address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_payment`
--

CREATE TABLE `tbl_payment` (
  `pay_id` int(50) NOT NULL,
  `cus_id` int(50) NOT NULL,
  `pay_method` varchar(50) NOT NULL,
  `pay_amount` int(50) NOT NULL,
  `pay_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_reservation`
--

CREATE TABLE `tbl_reservation` (
  `res_id` int(50) NOT NULL,
  `cus_id` int(50) NOT NULL,
  `res_description` varchar(50) NOT NULL,
  `res_type` varchar(50) NOT NULL,
  `res_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaction`
--

CREATE TABLE `tbl_transaction` (
  `trans_id` int(50) NOT NULL,
  `cus_id` int(50) NOT NULL,
  `res_id` int(50) NOT NULL,
  `pay_id` int(50) NOT NULL,
  `trans_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_account`
--
ALTER TABLE `tbl_account`
  ADD PRIMARY KEY (`acc_id`);

--
-- Indexes for table `tbl_crew`
--
ALTER TABLE `tbl_crew`
  ADD PRIMARY KEY (`crew_id`),
  ADD KEY `acc_id` (`acc_id`);

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`cus_id`),
  ADD KEY `acc_id` (`acc_id`);

--
-- Indexes for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD PRIMARY KEY (`pay_id`),
  ADD KEY `cus_id` (`cus_id`);

--
-- Indexes for table `tbl_reservation`
--
ALTER TABLE `tbl_reservation`
  ADD PRIMARY KEY (`res_id`),
  ADD KEY `cus_id` (`cus_id`);

--
-- Indexes for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD PRIMARY KEY (`trans_id`),
  ADD KEY `cus_id` (`cus_id`),
  ADD KEY `pay_id` (`pay_id`),
  ADD KEY `res_id` (`res_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_account`
--
ALTER TABLE `tbl_account`
  MODIFY `acc_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_crew`
--
ALTER TABLE `tbl_crew`
  MODIFY `crew_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `cus_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  MODIFY `pay_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_reservation`
--
ALTER TABLE `tbl_reservation`
  MODIFY `res_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  MODIFY `trans_id` int(50) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_crew`
--
ALTER TABLE `tbl_crew`
  ADD CONSTRAINT `tbl_crew_ibfk_1` FOREIGN KEY (`acc_id`) REFERENCES `tbl_account` (`acc_id`);

--
-- Constraints for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD CONSTRAINT `tbl_customer_ibfk_1` FOREIGN KEY (`acc_id`) REFERENCES `tbl_account` (`acc_id`);

--
-- Constraints for table `tbl_payment`
--
ALTER TABLE `tbl_payment`
  ADD CONSTRAINT `tbl_payment_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `tbl_customer` (`cus_id`);

--
-- Constraints for table `tbl_reservation`
--
ALTER TABLE `tbl_reservation`
  ADD CONSTRAINT `tbl_reservation_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `tbl_customer` (`cus_id`);

--
-- Constraints for table `tbl_transaction`
--
ALTER TABLE `tbl_transaction`
  ADD CONSTRAINT `tbl_transaction_ibfk_1` FOREIGN KEY (`cus_id`) REFERENCES `tbl_customer` (`cus_id`),
  ADD CONSTRAINT `tbl_transaction_ibfk_2` FOREIGN KEY (`pay_id`) REFERENCES `tbl_payment` (`pay_id`),
  ADD CONSTRAINT `tbl_transaction_ibfk_3` FOREIGN KEY (`res_id`) REFERENCES `tbl_reservation` (`res_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
