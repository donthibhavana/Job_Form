-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2022 at 04:10 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data`
--

-- --------------------------------------------------------

--
-- Table structure for table `details`
--

CREATE TABLE `details` (
  `email` varchar(50) NOT NULL,
  `Password` varchar(30) NOT NULL,
  `RetypePassword` varchar(30) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `Address` varchar(30) NOT NULL,
  `City` varchar(30) NOT NULL,
  `country` text NOT NULL,
  `myList` varchar(10) NOT NULL,
  `school` varchar(20) NOT NULL,
  `program` varchar(20) NOT NULL,
  `education` varchar(20) NOT NULL,
  `educationstatus` enum('graduated','current enrolled','did not graduate') NOT NULL,
  `graduationdate` varchar(10) NOT NULL,
  `employer` varchar(20) NOT NULL,
  `jobtitle` varchar(20) NOT NULL,
  `jobduty` varchar(100) NOT NULL,
  `workedyear` int(3) NOT NULL,
  `attachment` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `details`
--

INSERT INTO `details` (`email`, `Password`, `RetypePassword`, `FirstName`, `LastName`, `PhoneNumber`, `Address`, `City`, `country`, `myList`, `school`, `program`, `education`, `educationstatus`, `graduationdate`, `employer`, `jobtitle`, `jobduty`, `workedyear`, `attachment`) VALUES
('y', 'p', 'p', 'p', 'p', 0, 'p', 'p', 'p', 'Quebec', 'p', 'p', 'diploma', 'current enrolled', 'k', '', '', '', 0, ''),
('shobha@gmail.com', '1234567897', '1234567897', 'shobha', 'rani', 1234567876, 'asdcfvbnm', 'hyd', 'canada', 'Quebec', 'stanns', 'cse', 'b.tech', 'graduated', '2dec', 'sdfghjkl', 'sdfghj', 'sdfghj', 9, '1.2.2.4 Lab - Where is My Data.pdf'),
('b@gmail.com', '123edfgrhy', 'yhgtrfdews', 'a', 'k', 123, 'j', 'l', 'k', 'Toronto', 'l', 'l', 'diploma', 'graduated', '', '', '', '', 0, ''),
('a@gmail.com', '1234567890', 'asdfrgthju', 'y', 'h', 123, 'g', 'l', 'g', 'Toronto', 'k', 'h', 'diploma', 'current enrolled', '', '', '', '', 0, ''),
('b@gmail.com', '1234567899', 'uhygtfrdes', 'bha', 'thg', 345, 't', 'h', 'h', 'Toronto', 'j', 'j', 'diploma', 'graduated', '', '', '', '', 0, ''),
('b@gmail.com', '12345rfgth', 'yhtgrfedws', 'bha', 'thg', 345, 't', 'h', 'h', 'Toronto', 'j', 'j', 'diploma', 'graduated', '', '', '', '', 0, ''),
('b@gmail.com', 'ujyhtgrfed', 'dcfvgbhnjm', 'bha', 'thg', 345, 't', 'h', 'h', 'Toronto', 'j', 'j', 'diploma', 'graduated', '', '', '', '', 0, ''),
('a@gmail.com', 'yhujikmnbg', 'rftgyhujik', 'y', 'h', 123, 'g', 'l', 'g', 'Toronto', 'k', 'h', 'diploma', 'current enrolled', '', '', '', '', 0, ''),
('d@gmail.com', 'tgyhujikol', 'edrftgyhujn', 'f', 'g', 780, 't', 'y', 'uy', 'Toronto', 'j', 'j', 'diploma', 'current enrolled', '', '', '', '', 0, ''),
('bhavana@gmail.com', '1234567890', '123456ab90', 'bhavanadonthi', 'reddy', 123, '4390downtown', 'Montreal', 'Canada', 'BC', 'Cegep', 'CST', 'diploma', 'did not graduate', '', '', '', '', 0, ''),
('bhavana@gmail.com', '1234567890', '123456ab90', 'bhavanadonthi', 'reddy', 123, '4390downtown', 'Montreal', 'Canada', 'BC', 'Cegep', 'CST', 'diploma', 'did not graduate', '', '', '', '', 0, ''),
('bhavana@gmail.com', '1234567890', '123456ab90', 'bhavanadonthi', 'reddy', 123, '4390downtown', 'Montreal', 'Canada', 'BC', 'Cegep', 'CST', 'diploma', 'current enrolled', '10june2022', 'fulltime', 'web development fron', 'developing the websites with the react and vue js', 1, 'ISTQB-CTFL_Syllabus_2018_V3.1.pdf'),
('bhavana@gmail.com', '1234567890', '123456ab90', 'bhavanadonthi', 'reddy', 123, '4390downtown', 'Montreal', 'Canada', 'BC', 'Cegep', 'CST', 'diploma', 'did not graduate', '10june2022', 'fulltime', 'web development fron', 'developing the websites with the react and vue js', 1, 'ISTQB-CTFL_Syllabus_2018_V3.1.pdf'),
('bhavana@gmail.com', '1234567890', '123456ab90', 'bhavanadonthi', 'reddy', 123, '4390downtown', 'Montreal', 'Canada', 'BC', 'Cegep', 'CST', 'diploma', 'did not graduate', '10june2022', 'fulltime', 'web development fron', 'developing the websites with the react and vue js', 1, 'ISTQB-CTFL_Syllabus_2018_V3.1.pdf');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
