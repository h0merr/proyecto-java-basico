-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-11-2022 a las 21:43:24
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `modelo_rentacar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

CREATE TABLE `modelo` (
  `ID_MODELO` int(11) NOT NULL,
  `NOMBRE_MODELO` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ID_MARCA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `modelo`
--

INSERT INTO `modelo` (`ID_MODELO`, `NOMBRE_MODELO`, `ID_MARCA`) VALUES
(6, 'S-presso', 1),
(7, 'XL7', 1),
(8, 'Jimny', 1),
(9, 'Vitara', 1),
(10, 'S-Cross', 1),
(11, 'New Mazda CX-3', 2),
(12, 'All New Mazda CX-30', 2),
(13, 'New Mazda CX-5', 2),
(14, 'New Mazda CX-9', 2),
(15, 'All-New Mazda BT-50', 2),
(16, 'All New Duster', 3),
(17, 'Arkana', 3),
(18, 'New Koleos', 3),
(19, 'Nuevo Clio', 3),
(20, 'Nuevo Kwid', 3),
(21, 'NEW HAVAL JOLION', 4),
(22, 'NEW HAVAL DARGO', 4),
(23, 'ALL NEW HAVAL H6', 4),
(24, 'ALL NEW HAVAL H6 HIBRIDO', 4),
(25, 'Wingle 5', 5),
(26, 'Wingle 7', 5),
(27, 'Poer', 5),
(28, 'Poer Plus', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD PRIMARY KEY (`ID_MODELO`),
  ADD KEY `ID_MARCA` (`ID_MARCA`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `modelo`
--
ALTER TABLE `modelo`
  MODIFY `ID_MODELO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`ID_MARCA`) REFERENCES `marca` (`ID_MARCA`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
