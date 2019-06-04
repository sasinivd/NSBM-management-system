-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 22, 2018 at 10:13 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nsbm`
--

-- --------------------------------------------------------

--
-- Table structure for table `assign`
--

CREATE TABLE `assign` (
  `staffid` varchar(8) NOT NULL,
  `subject_id` varchar(12) NOT NULL,
  `location` varchar(20) NOT NULL,
  `time` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assign`
--

INSERT INTO `assign` (`staffid`, `subject_id`, `location`, `time`) VALUES
('cnb', 'SCS1107', 'E205', 'Friday 8.30-10.30am'),
('cnb', 'SCS1109', 'S104', 'Friday 10.30-12.30pm'),
('cnb', 'SCS2104', 'E205', 'Friday 10.30-12.30am'),
('crw', 'SCS1101', 'W002', 'Monday 8.00-10.00am'),
('crw', 'SCS2103', 'W001', 'Friday 10.30-12.30pm'),
('cvw', 'SCS1109', 'W002', 'Tuesday 11.30-1.30pm'),
('cvw', 'SCS2104', 'S104', 'Friday 8.30-10.30am');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `course_id` varchar(8) NOT NULL,
  `course_name` varchar(20) NOT NULL,
  `description` varchar(30) NOT NULL,
  `faculty_id` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_id`, `course_name`, `description`, `faculty_id`) VALUES
('ADBM', 'BUIS', 'hjklii', 'BS'),
('DCSD', 'Diploma in Computer ', 'jkloiuyt', 'IT'),
('HDBM', 'BoIS', 'hjklii', 'BS');

-- --------------------------------------------------------

--
-- Table structure for table `enrol`
--

CREATE TABLE `enrol` (
  `s_id` varchar(15) NOT NULL,
  `subject_id` varchar(12) NOT NULL,
  `grade` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enrol`
--

INSERT INTO `enrol` (`s_id`, `subject_id`, `grade`) VALUES
('16000412', 'SCS1101', 'B'),
('DCSDKA161F012', 'SCS1101', 'B'),
('DCSDKA161F012', 'SCS1102', NULL),
('DCSDKA161F012', 'SCS1103', NULL),
('DCSDKA161F012', 'SCS1202', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `faculty_id` varchar(8) NOT NULL,
  `faculty_name` varchar(30) NOT NULL,
  `description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`faculty_id`, `faculty_name`, `description`) VALUES
('BS', 'Buisness', 'uiopyr'),
('IT', 'Information Technology', 'kloiytrew');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(30) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('sasini', 'sasini'),
('sumudu', 'dws'),
('a', 'a'),
('vish', 'vish'),
('amanda', 'aa');

-- --------------------------------------------------------

--
-- Table structure for table `postgraduate`
--

CREATE TABLE `postgraduate` (
  `s_id` varchar(14) NOT NULL,
  `qualify_type` varchar(30) NOT NULL,
  `institute` varchar(40) NOT NULL,
  `yoc` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `s_id` varchar(15) NOT NULL,
  `subject_id` varchar(12) NOT NULL,
  `assesment` varchar(20) NOT NULL,
  `weight` float(2,1) NOT NULL,
  `result` int(3) NOT NULL,
  `total` float(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`s_id`, `subject_id`, `assesment`, `weight`, `result`, `total`) VALUES
('16000412', 'SCS1101', 'Assignment1', 0.1, 81, 8.10),
('16000412', 'SCS1101', 'Assignment2', 0.1, 72, 7.20),
('16000412', 'SCS1101', 'Final', 0.8, 66, 52.80),
('DCSDKA161F012', 'SCS1101', 'Assignment1', 0.1, 79, 7.90),
('DCSDKA161F012', 'SCS1101', 'Assignment2', 0.1, 85, 8.50),
('DCSDKA161F012', 'SCS1101', 'Final', 0.8, 66, 52.80);

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `staff_id` varchar(8) NOT NULL,
  `staff_name` varchar(50) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `designation` varchar(20) NOT NULL,
  `room_no` varchar(10) NOT NULL,
  `faculty_id` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `staff_name`, `gender`, `address`, `email`, `contact_no`, `designation`, `room_no`, `faculty_id`) VALUES
('cnb', 'Niyomal Botheju', 'M', 'No 7, Mill road, Katubedda', 'cnb@nsbm.ac.lk', '0768783620', 'Senior Lecturer', '20', 'IT'),
('crw', 'Rupika Wijesingha', 'F', 'No 7, Rotunda Gardens, Colombo3', 'crw@nsbm.ac.lk', '0112422291', 'Senior Lecturer', '15', 'IT'),
('cvw', 'Viraj Weerasekara', 'M', 'No 14, Rotunda Gardens, Colombo3', 'cvw@nsbm.ac.lk', '0112427891', 'Lecturer', '15', 'IT');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `s_id` varchar(15) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(1) NOT NULL,
  `address` varchar(50) NOT NULL,
  `contact_no` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `course_id` varchar(8) NOT NULL,
  `intake` varchar(4) NOT NULL,
  `type` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`s_id`, `name`, `dob`, `gender`, `address`, `contact_no`, `email`, `course_id`, `intake`, `type`) VALUES
('16000412', 'Sasini Dissanayake', '1996-08-06', 'F', 'no 13A, Kandy', 768783620, 'sasini.vidarshi14@gmail.com', 'DCSD', '18.1', 'Undergraduate'),
('ADBMKA161F005', 'Achala Dissanayake', '1996-08-05', 'M', 'No 13A, Puwakgahakandura, Kundasale', 768787820, 'achala.vidarshi14@gmail.com', 'ADBM', '16.1', 'Undergraduate'),
('DCSDKA161F012', 'Sasini Dissanayake', '1996-08-05', 'F', 'No 13A, Puwakgahakandura, Kundasale', 768783620, 'sasini.vidarshi14@gmail.com', 'DCSD', '18.1', 'Undergraduate');

-- --------------------------------------------------------

--
-- Table structure for table `student_alresult`
--

CREATE TABLE `student_alresult` (
  `s_id` varchar(15) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `result` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_alresult`
--

INSERT INTO `student_alresult` (`s_id`, `subject`, `result`) VALUES
('16000412', 'Chemistry', 'B'),
('16000412', 'English', 'C'),
('16000412', 'Mathematics', 'B'),
('16000412', 'Physics', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `sub_id` varchar(12) NOT NULL,
  `sub_name` varchar(30) NOT NULL,
  `credit` int(1) NOT NULL,
  `sub_year` int(1) NOT NULL,
  `semester` int(1) NOT NULL,
  `course_id` varchar(8) NOT NULL,
  `subject_fee` float(6,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_id`, `sub_name`, `credit`, `sub_year`, `semester`, `course_id`, `subject_fee`) VALUES
('1201', 'stat', 7, 1, 1, 'ADBM', NULL),
('SCS1101', 'Data Structure & Algorithms', 3, 1, 1, 'DCSD', 0.00),
('SCS1102', 'Programming 1', 3, 1, 1, 'DCSD', 0.00),
('SCS1103', 'Database Mangement 1', 3, 1, 1, 'DCSD', 0.00),
('SCS1107', 'Software Engineering 1', 2, 1, 2, 'DCSD', 0.00),
('SCS1109', 'Programming 2', 3, 1, 2, 'DCSD', 0.00),
('SCS1110', 'Discrete Mathematics ', 2, 1, 2, 'DCSD', 2500.00),
('SCS1201', 'Management and Finance', 3, 1, 1, 'ADBM', 0.00),
('SCS1202', 'Accounting', 3, 1, 2, 'ADBM', 2500.00),
('SCS2101', 'Data Structure & Algorithms', 2, 2, 1, 'DCSD', 0.00),
('SCS2103', 'Software Engineering 2', 2, 2, 1, 'DCSD', 0.00),
('SCS2104', 'Programming 3', 3, 2, 1, 'DCSD', 0.00),
('SCS2106', 'Networks & Management', 2, 2, 2, 'DCSD', 3500.00),
('sub1', 'maths', 3, 1, 1, 'ADBM', 2000.00),
('sub2', 'science', 2, 1, 1, 'ADBM', 0.00),
('sub3', 'maths3', 2, 1, 1, 'ADBM', 2500.00);

-- --------------------------------------------------------

--
-- Table structure for table `undergraduate`
--

CREATE TABLE `undergraduate` (
  `s_id` varchar(14) NOT NULL,
  `al_index` int(10) NOT NULL,
  `al_year` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergraduate`
--

INSERT INTO `undergraduate` (`s_id`, `al_index`, `al_year`) VALUES
('16000412', 6121250, 2015),
('ADBMKA161F005', 6121254, 2015),
('DCSDKA161F012', 6121250, 2015);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `assign`
--
ALTER TABLE `assign`
  ADD PRIMARY KEY (`staffid`,`subject_id`),
  ADD KEY `assign_ibfk_2` (`subject_id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`course_id`),
  ADD KEY `faculty_id` (`faculty_id`);

--
-- Indexes for table `enrol`
--
ALTER TABLE `enrol`
  ADD PRIMARY KEY (`s_id`,`subject_id`),
  ADD KEY `enrol_ibfk_1` (`subject_id`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`faculty_id`);

--
-- Indexes for table `postgraduate`
--
ALTER TABLE `postgraduate`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`s_id`,`subject_id`,`assesment`),
  ADD KEY `subject_id` (`subject_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `student_alresult`
--
ALTER TABLE `student_alresult`
  ADD PRIMARY KEY (`s_id`,`subject`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`sub_id`),
  ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `undergraduate`
--
ALTER TABLE `undergraduate`
  ADD PRIMARY KEY (`s_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `assign`
--
ALTER TABLE `assign`
  ADD CONSTRAINT `assign_ibfk_1` FOREIGN KEY (`staffid`) REFERENCES `staff` (`staff_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `assign_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`sub_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`faculty_id`);

--
-- Constraints for table `enrol`
--
ALTER TABLE `enrol`
  ADD CONSTRAINT `enrol_ibfk_1` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`sub_id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `enrol_ibfk_2` FOREIGN KEY (`s_id`) REFERENCES `student` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `postgraduate`
--
ALTER TABLE `postgraduate`
  ADD CONSTRAINT `postgraduate_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `student` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `student` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `subject` (`sub_id`) ON UPDATE CASCADE;

--
-- Constraints for table `student_alresult`
--
ALTER TABLE `student_alresult`
  ADD CONSTRAINT `student_alresult_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `undergraduate` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`);

--
-- Constraints for table `undergraduate`
--
ALTER TABLE `undergraduate`
  ADD CONSTRAINT `undergraduate_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `student` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
