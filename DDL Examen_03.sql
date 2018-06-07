﻿

CREATE DATABASE EXAMEN_03;

USE EXAMEN_03;



CREATE TABLE TBL_ADMINISTRADOR (

  COD_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
  DSC_NOMBRE VARCHAR(150),
  DSC_USUARIO VARCHAR(150)UNIQUE,
  DSC_PASSWORD VARCHAR(100)

) ENGINE=InnoDB;



CREATE TABLE TBL_USUARIO (

  COD_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
  DSC_NOMBRE_COMPLETO VARCHAR(200),
  DSC_USUARIO VARCHAR(150) UNIQUE,
  DSC_PASSWORD VARCHAR(100),
  DSC_PAIS VARCHAR(150),
  DSC_CORREO VARCHAR(150),
  DSC_TELEFONOS VARCHAR(150)

) ENGINE=InnoDB;



CREATE TABLE TBL_PRODUCTO (

  COD_ID INTEGER PRIMARY KEY,
  DSC_NOMBRE VARCHAR(200),
  DSC_DESCRIPCION VARCHAR(200),
  DSC_COSTO DOUBLE(10,2),
  DSC_CANTIDAD INTEGER,
  DSC_POPULARIDAD INTEGER


) ENGINE=InnoDB;


CREATE TABLE TBL_COMPRA (

  COD_ID INTEGER PRIMARY KEY AUTO_INCREMENT,
  COD_USUARIO INTEGER,
  COD_PRODUCTO INTEGER

) ENGINE=InnoDB;



-- Crea relaci�n de llave foranea entre la tabla TBL_PRODUCTO (COD_ID) y TBL_COMPRA(COD_PRODUCTO).

ALTER TABLE TBL_COMPRA ADD CONSTRAINT FK_COD_USUARIO
FOREIGN KEY (COD_USUARIO) REFERENCES TBL_USUARIO(COD_ID);


-- Crea relaci�n de llave foranea entre la tabla TBL_PRODUCTO (COD_ID) y TBL_COMPRA(COD_PRODUCTO).

ALTER TABLE TBL_COMPRA ADD CONSTRAINT FK_COD_PRODUCTO
FOREIGN KEY (COD_PRODUCTO) REFERENCES TBL_PRODUCTO(COD_ID);



