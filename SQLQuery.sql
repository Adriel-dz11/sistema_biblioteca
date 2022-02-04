CREATE DATABASE Biblioteca
go
USE Biblioteca
GO

CREATE TABLE Libro
(
Id_Libro int primary key not null,
Titulo varchar(70),
Autor varchar(30),
Editorial varchar(30),
Copias int,
Fecha_Llegada varchar(10), 
Estado varchar(10),
Genero varchar(30),
Idioma varchar(30),
Año_de_Edicion varchar(10),
Ubicacion varchar(30)
)

go
CREATE TABLE Prestamo
(
Id_Prestamo int primary key not null,
Fecha_Prestamo date,
Tiempo_Prestamo int,
Estado varchar(10),
Multa varchar(10),
FK_Libro int,
FK_Cliente int,
FK_Bibliotecario int 
)
go
CREATE TABLE Cliente 
(
Id_Cliente int primary key not null,
Nombre varchar(50),
Apellido varchar(50),
Direccion varchar(100),
Telefono varchar(20),
Cedula varchar(30)
)
go
CREATE TABLE Bibliotecario
(
Id_Bibliotecario int primary key not null,
Nombre varchar(50),
Apellido varchar(50),
Direccion varchar(100),
Telefono varchar(20),
Cedula varchar(30)
)

go

CREATE TABLE Usuario 
(
Id_Usuario int primary key not null,
nombre varchar(30), 
contrasena varchar(30)
)



