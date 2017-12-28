-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 27, 2017 at 10:04 PM
-- Server version: 10.0.31-MariaDB-0ubuntu0.16.04.2
-- PHP Version: 7.0.22-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `music_repo`
--

-- --------------------------------------------------------

--
-- Table structure for table `album`
--

CREATE TABLE `album` (
  `id` int(11) NOT NULL,
  `last_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(128) NOT NULL,
  `year_released` int(10) UNSIGNED DEFAULT NULL,
  `artist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `album`
--

INSERT INTO `album` (`id`, `last_modified`, `name`, `year_released`, `artist_id`) VALUES
(1, '2017-12-27 05:48:35', 'High Voltage', NULL, 1),
(2, '2017-12-27 05:48:40', 'T.N.T.', NULL, 1),
(3, '2017-12-27 05:48:43', 'Dirty Deeds Done Dirt Cheap', NULL, 1),
(4, '2017-12-27 05:48:46', 'Let There Be Rock', NULL, 1),
(5, '2017-12-27 05:48:55', 'Powerage', NULL, 1),
(6, '2017-12-27 05:49:00', 'Highway to Hell', NULL, 1),
(7, '2017-12-27 05:49:03', 'Back in Black', NULL, 1),
(8, '2017-12-27 05:49:07', 'For Those About to Rock We Salute You', NULL, 1),
(9, '2017-12-27 05:49:10', 'Flick of the Switch', NULL, 1),
(10, '2017-12-27 05:49:14', 'Fly on the Wall', NULL, 1),
(11, '2017-12-27 05:49:18', 'Blow Up Your Video', NULL, 1),
(12, '2017-12-27 05:49:21', 'The Razors Edge', NULL, 1),
(13, '2017-12-27 05:49:24', 'Ballbreaker', NULL, 1),
(14, '2017-12-27 05:49:26', 'Stiff Upper Lip', NULL, 1),
(15, '2017-12-27 05:49:32', 'Black Ice', NULL, 1),
(16, '2017-12-27 05:49:36', 'Bon Jovi', NULL, 2),
(17, '2017-12-27 05:49:39', '7800° Fahrenheit', NULL, 2),
(18, '2017-12-27 05:49:43', 'Slippery When Wet', NULL, 2),
(19, '2017-12-27 05:49:50', 'New Jersey', NULL, 2),
(20, '2017-12-27 05:49:54', 'Keep the Faith', NULL, 2),
(21, '2017-12-27 05:49:58', 'These Days', NULL, 2),
(22, '2017-12-27 05:50:00', 'Crush', NULL, 2),
(23, '2017-12-27 05:50:04', 'Bounce', NULL, 2),
(24, '2017-12-27 05:50:06', 'On Through the Night', NULL, 3),
(25, '2017-12-27 05:50:09', 'High n Dry', NULL, 3),
(26, '2017-12-27 05:50:18', 'Pyromania', NULL, 3),
(27, '2017-12-27 05:50:24', 'Hysteria', NULL, 3),
(28, '2017-12-27 05:50:34', 'Adrenalize', NULL, 3),
(29, '2017-12-27 05:50:37', 'Slang', NULL, 3),
(30, '2017-12-27 05:50:39', 'Euphoria', NULL, 3),
(31, '2017-12-27 05:50:41', 'Got to Be There', NULL, 4),
(32, '2017-12-27 05:50:43', 'Ben', NULL, 4),
(33, '2017-12-27 05:50:46', 'Music & Me', NULL, 4),
(34, '2017-12-27 05:50:49', 'Forever, Michael', NULL, 4),
(35, '2017-12-27 05:50:51', 'Off the Wall', NULL, 4),
(36, '2017-12-27 05:50:56', 'Thriller', NULL, 4),
(37, '2017-12-27 05:50:58', 'Bad', NULL, 4),
(38, '2017-12-27 05:51:01', 'Dangerous', NULL, 4),
(39, '2017-12-27 05:51:03', 'Invincible', NULL, 4),
(40, '2017-12-27 05:51:07', 'The Piper at the Gates of Dawn', NULL, 5),
(41, '2017-12-27 05:51:09', 'A Saucerful of Secrets', NULL, 5),
(42, '2017-12-27 05:51:12', 'More', NULL, 5),
(43, '2017-12-27 05:51:14', 'Ummagumma', NULL, 5),
(44, '2017-12-27 05:51:16', 'Atom Heart Mother', NULL, 5),
(45, '2017-12-27 05:51:19', 'Meddle', NULL, 5),
(46, '2017-12-27 05:51:21', 'Obscured by Clouds', NULL, 5),
(47, '2017-12-27 05:51:24', 'The Dark Side of the Moon', NULL, 5),
(48, '2017-12-27 05:51:26', 'Wish You Were Here', NULL, 5),
(49, '2017-12-27 05:51:29', 'Animals', NULL, 5),
(50, '2017-12-27 05:51:32', 'The Wall', NULL, 5),
(51, '2017-12-27 05:51:39', 'The Final Cut', NULL, 5),
(52, '2017-12-27 05:51:41', 'A Momentary Lapse of Reason', NULL, 5),
(53, '2017-12-27 05:51:46', 'The Division Bell', NULL, 5),
(54, '2017-12-27 05:51:52', 'Lonesome Crow', NULL, 6),
(55, '2017-12-27 05:51:55', 'Fly to the Rainbow', NULL, 6),
(56, '2017-12-27 05:51:57', 'In Trance', NULL, 6),
(57, '2017-12-27 05:52:00', 'Virgin Killer', NULL, 6),
(58, '2017-12-27 05:52:02', 'Taken by Force', NULL, 6),
(59, '2017-12-27 05:52:04', 'Lovedrive', NULL, 6),
(60, '2017-12-27 05:52:07', 'Animal Magnetism', NULL, 6),
(61, '2017-12-27 05:52:09', 'Blackout', NULL, 6),
(62, '2017-12-27 05:52:12', 'Love at First Sting', NULL, 6),
(63, '2017-12-27 05:52:15', 'Savage Amusement', NULL, 6),
(64, '2017-12-27 05:52:18', 'Crazy World', NULL, 6),
(65, '2017-12-27 05:52:20', 'Face the Heat', NULL, 6),
(66, '2017-12-27 05:52:24', 'Pure Instinct', NULL, 6),
(67, '2017-12-27 05:52:27', 'Eye II Eye', NULL, 6),
(68, '2017-12-27 05:52:29', 'Unbreakable', NULL, 6),
(75, '2017-12-28 01:22:52', 'Panorama', 1980, 18);

-- --------------------------------------------------------

--
-- Table structure for table `artist`
--

CREATE TABLE `artist` (
  `id` int(11) NOT NULL,
  `created` datetime DEFAULT NULL,
  `last_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `artist`
--

INSERT INTO `artist` (`id`, `created`, `last_modified`, `name`) VALUES
(1, NULL, '2017-12-27 06:00:40', 'AC/DC'),
(2, NULL, '2017-12-27 06:00:44', 'Bon Jovi'),
(3, NULL, '2017-12-27 06:00:46', 'Def Leppard'),
(4, NULL, '2017-12-27 06:00:49', 'Michael Jackson'),
(5, NULL, '2017-12-27 06:00:52', 'Pink Floyd'),
(6, NULL, '2017-12-27 06:00:55', 'Scorpions'),
(18, NULL, '2017-12-27 23:01:11', 'Cars');

-- --------------------------------------------------------

--
-- Table structure for table `song`
--

CREATE TABLE `song` (
  `id` int(11) NOT NULL,
  `created` date DEFAULT NULL,
  `last_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(128) NOT NULL,
  `album_id` int(11) NOT NULL,
  `artist_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `song`
--

INSERT INTO `song` (`id`, `created`, `last_modified`, `name`, `album_id`, `artist_id`) VALUES
(1, NULL, '2017-12-26 23:35:18', 'High Voltage', 1, 1),
(2, NULL, '2017-12-26 23:35:18', 'Show Business', 1, 1),
(3, NULL, '2017-12-26 23:35:18', 'T.N.T.', 2, 1),
(4, NULL, '2017-12-26 23:35:18', 'Rocker', 2, 1),
(5, NULL, '2017-12-26 23:35:18', 'Dirty Deeds Done Dirt Cheap', 3, 1),
(6, NULL, '2017-12-26 23:35:18', 'Squealer', 3, 1),
(7, NULL, '2017-12-26 23:35:18', 'Let There Be Rock', 4, 1),
(8, NULL, '2017-12-26 23:35:18', 'Overdose', 4, 1),
(9, NULL, '2017-12-26 23:35:18', 'Sin City', 5, 1),
(10, NULL, '2017-12-26 23:35:18', 'Gimme a Bullet', 5, 1),
(11, NULL, '2017-12-26 23:35:18', 'Highway to Hell', 6, 1),
(12, NULL, '2017-12-26 23:35:18', 'Get It Hot', 6, 1),
(13, NULL, '2017-12-26 23:35:18', 'Back in Black', 7, 1),
(14, NULL, '2017-12-26 23:35:18', 'What Do You Do for Money Honey', 7, 1),
(15, NULL, '2017-12-26 23:35:18', 'For Those About to Rock (We Salute You)', 8, 1),
(16, NULL, '2017-12-26 23:35:18', 'Snowballed', 8, 1),
(17, NULL, '2017-12-26 23:35:18', 'Flick of the Switch', 9, 1),
(18, NULL, '2017-12-26 23:35:18', 'Landslide', 9, 1),
(19, NULL, '2017-12-26 23:35:18', 'Fly on the Wall', 10, 1),
(20, NULL, '2017-12-26 23:35:18', 'First Blood', 10, 1),
(21, NULL, '2017-12-26 23:35:18', 'Nick of Time', 11, 1),
(22, NULL, '2017-12-26 23:35:18', 'Ruff Stuff', 11, 1),
(23, NULL, '2017-12-26 23:35:18', 'The Razors Edge', 12, 1),
(24, NULL, '2017-12-26 23:35:18', 'Shot of Love', 12, 1),
(25, NULL, '2017-12-26 23:35:18', 'Ballbreaker', 13, 1),
(26, NULL, '2017-12-26 23:35:18', 'Boogie Man', 13, 1),
(27, NULL, '2017-12-26 23:35:18', 'Stiff Upper Lip', 14, 1),
(28, NULL, '2017-12-26 23:35:18', 'Meltdown', 14, 1),
(29, NULL, '2017-12-26 23:35:18', 'Black Ice', 15, 1),
(30, NULL, '2017-12-26 23:35:18', 'Decibel', 15, 1),
(38, NULL, '2017-12-27 20:22:26', 'Panorama', 75, 18),
(39, NULL, '2017-12-27 20:30:20', 'Getting Through', 75, 18);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `album`
--
ALTER TABLE `album`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmwc4fyyxb6tfi0qba26gcf8s1` (`artist_id`);

--
-- Indexes for table `artist`
--
ALTER TABLE `artist`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_r03a96lqhsb7djq2tn4rq60vn` (`name`),
  ADD UNIQUE KEY `UKr03a96lqhsb7djq2tn4rq60vn` (`name`);

--
-- Indexes for table `song`
--
ALTER TABLE `song`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKrcjmk41yqj3pl3iyii40niab0` (`album_id`),
  ADD KEY `FKa21ft97nj7thwrp5d31xdaxr` (`artist_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `album`
--
ALTER TABLE `album`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=76;
--
-- AUTO_INCREMENT for table `artist`
--
ALTER TABLE `artist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `song`
--
ALTER TABLE `song`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `album`
--
ALTER TABLE `album`
  ADD CONSTRAINT `FKmwc4fyyxb6tfi0qba26gcf8s1` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`id`);

--
-- Constraints for table `song`
--
ALTER TABLE `song`
  ADD CONSTRAINT `FKa21ft97nj7thwrp5d31xdaxr` FOREIGN KEY (`artist_id`) REFERENCES `artist` (`id`),
  ADD CONSTRAINT `FKrcjmk41yqj3pl3iyii40niab0` FOREIGN KEY (`album_id`) REFERENCES `album` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
