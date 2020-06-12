drop database if exists ADOO;
create database ADOO;
use ADOO;

CREATE TABLE `administrador` (
  `usr` varchar(128) CHARACTER SET utf8 NOT NULL,
  `email` varchar(256) CHARACTER SET utf8 NOT NULL,
  `psw` varchar(128) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `Admin_Contenido` (
  `idRegistro` int(64) NOT NULL,
  `idContenid` int(64) NOT NULL,
  `emailadmin` varchar(256) CHARACTER SET utf8 NOT NULL,
  `idAccion` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `Admin_Infante` (
  `idRegistro` int(64) NOT NULL,
  `usrinfante` varchar(128) CHARACTER SET utf8 NOT NULL,
  `emailadmin` varchar(256) CHARACTER SET utf8 NOT NULL,
  `idAccion` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `Admin_Tutor` (
  `idRegistro` int(64) NOT NULL,
  `emailtutor` varchar(256) CHARACTER SET utf8 NOT NULL,
  `emailadmin` varchar(256) CHARACTER SET utf8 NOT NULL,
  `idAccion` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `avance` (
  `IdAvance` int(2) NOT NULL,
  `idContenido` int(2) NOT NULL,
  `UsrInfante` varchar(128) CHARACTER SET utf8 NOT NULL,
  `Calificación` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `CategoriaAccion` (
  `idAccion` int(2) NOT NULL,
  `accion` varchar(32) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `CategoriaAccion` (`idAccion`, `accion`) VALUES
(1, 'Registro'),
(2, 'Consulta'),
(3, 'Modificacion'),
(4, 'Eliminacion');


CREATE TABLE `contenido` (
  `idContenido` int(64) NOT NULL,
  `contenido` varchar(512) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `contenido` (`idContenido`, `contenido`) VALUES
(1, 'Suma con Unidades'),
(2, 'Suma con Decenas'),
(3, 'Suma con Centenas'),
(4, 'Resta con Unidades'),
(5, 'Resta con Decenas'),
(6, 'Resta con Centenas'),
(7, 'Multiplicación con Unidades'),
(8, 'Multiplicación con Decenas'),
(9, 'Multiplicación con Centenas'),
(10, 'División con Unidades'),
(11, 'División con Decenas'),
(12, 'División con Centenas'),
(13, 'Crucigrama sumas'),
(14, 'Crucigrama restas'),
(15, 'Crucigrama sumas y restas'),
(16, 'Crucigrama sumas y restas 2'),
(17, 'Crucigrama multiplicaciones'),
(18, 'Crucigrama divisiones'),
(19, 'Crucigrama multiplicaciones y divisiones'),
(20, 'Crucigrama multiplicaciones y divisiones 2'),
(21, 'Crucigrama operadores'),
(22, 'Crucigrama operadores 2'),
(23, 'Crucigrama operadores 3'),
(24, 'Crucigrama operadores 4');


CREATE TABLE `infante` (
  `usr` varchar(128) CHARACTER SET utf8 NOT NULL,
  `emailtutor` varchar(256) CHARACTER SET utf8 NOT NULL,
  `psw` varchar(128) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `tutor` (
  `usr` varchar(128) CHARACTER SET utf8 NOT NULL,
  `email` varchar(256) CHARACTER SET utf8 NOT NULL,
  `psw` varchar(128) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


ALTER TABLE `administrador`
  ADD PRIMARY KEY (`email`);


ALTER TABLE `Admin_Contenido`
  ADD PRIMARY KEY (`idRegistro`),
  ADD KEY `idAccion` (`idAccion`),
  ADD KEY `idContenid` (`idContenid`),
  ADD KEY `emailadmin` (`emailadmin`);


ALTER TABLE `Admin_Infante`
  ADD PRIMARY KEY (`idRegistro`),
  ADD KEY `idAccion` (`idAccion`),
  ADD KEY `usrinfante` (`usrinfante`),
  ADD KEY `emailadmin` (`emailadmin`);


ALTER TABLE `Admin_Tutor`
  ADD PRIMARY KEY (`idRegistro`),
  ADD KEY `idAccion` (`idAccion`),
  ADD KEY `emailtutor` (`emailtutor`),
  ADD KEY `emailadmin` (`emailadmin`);


ALTER TABLE `avance`
  ADD PRIMARY KEY (`IdAvance`),
  ADD KEY `idContenido` (`idContenido`),
  ADD KEY `UsrInfante` (`UsrInfante`);


ALTER TABLE `CategoriaAccion`
  ADD PRIMARY KEY (`idAccion`);


ALTER TABLE `contenido`
  ADD PRIMARY KEY (`idContenido`);


ALTER TABLE `infante`
  ADD PRIMARY KEY (`usr`),
  ADD KEY `emailtutor` (`emailtutor`);


ALTER TABLE `tutor`
  ADD PRIMARY KEY (`email`);


ALTER TABLE `Admin_Contenido`
  MODIFY `idRegistro` int(64) NOT NULL AUTO_INCREMENT;


ALTER TABLE `Admin_Infante`
  MODIFY `idRegistro` int(64) NOT NULL AUTO_INCREMENT;


ALTER TABLE `Admin_Tutor`
  MODIFY `idRegistro` int(64) NOT NULL AUTO_INCREMENT;


ALTER TABLE `avance`
  MODIFY `IdAvance` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=242;


ALTER TABLE `contenido`
  MODIFY `idContenido` int(64) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;


ALTER TABLE `Admin_Contenido`
  ADD CONSTRAINT `Admin_Contenido_ibfk_1` FOREIGN KEY (`idAccion`) REFERENCES `CategoriaAccion` (`idAccion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Contenido_ibfk_2` FOREIGN KEY (`idContenid`) REFERENCES `contenido` (`idContenido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Contenido_ibfk_3` FOREIGN KEY (`emailadmin`) REFERENCES `administrador` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `Admin_Infante`
  ADD CONSTRAINT `Admin_Infante_ibfk_1` FOREIGN KEY (`idAccion`) REFERENCES `CategoriaAccion` (`idAccion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Infante_ibfk_2` FOREIGN KEY (`usrinfante`) REFERENCES `infante` (`usr`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Infante_ibfk_3` FOREIGN KEY (`emailadmin`) REFERENCES `administrador` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `Admin_Tutor`
  ADD CONSTRAINT `Admin_Tutor_ibfk_1` FOREIGN KEY (`idAccion`) REFERENCES `CategoriaAccion` (`idAccion`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Tutor_ibfk_2` FOREIGN KEY (`emailtutor`) REFERENCES `tutor` (`email`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Admin_Tutor_ibfk_3` FOREIGN KEY (`emailadmin`) REFERENCES `administrador` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `avance`
  ADD CONSTRAINT `avance_ibfk_1` FOREIGN KEY (`idContenido`) REFERENCES `contenido` (`idContenido`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `avance_ibfk_2` FOREIGN KEY (`UsrInfante`) REFERENCES `infante` (`usr`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `infante`
  ADD CONSTRAINT `infante_ibfk_1` FOREIGN KEY (`emailtutor`) REFERENCES `tutor` (`email`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

