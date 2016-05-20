-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-05-2016 a las 13:19:10
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `myanimelist`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `anime`
--

CREATE TABLE `anime` (
  `Idanime` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `capitulo` int(3) DEFAULT NULL,
  `nota` int(2) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL,
  `tipo` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- Volcado de datos para la tabla `anime`
--

INSERT INTO `anime` (`Idanime`, `nombre`, `capitulo`, `nota`, `estado`, `tipo`) VALUES
(1, 'Sword Art Online', 24, 3, 'Completado', 'TV'),
(2, 'Uchuu Patrol Luluco', 7, 7, 'Viendo', 'TV'),
(3, 'AKIRA', 1, 9, 'Completado', 'Pelicula'),
(4, 'XAMP: Lost memories', 26, 7, 'Completado', 'ONA');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `anime`
--
ALTER TABLE `anime`
  ADD PRIMARY KEY (`Idanime`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
