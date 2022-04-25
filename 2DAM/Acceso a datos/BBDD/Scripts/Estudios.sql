drop database Estudios;
create database Estudios;
use Estudios;

CREATE TABLE Curso(
  codigo int primary key,
  nombre varchar(4),
  familia varchar(15)); 

CREATE TABLE Alumnos(
  mat int primary key,
  nombre varchar(20), 
  curso int,
  foreign key (curso) references Curso(codigo)
  on delete set null on update set null);
  
INSERT INTO Curso VALUES
	(10,'ASIR','INFORMATICA'),
	(20,'DAM','INFORMATICA'),
	(30,'DAW','INFORMATICA'),
    (40,'SMR','INFORMATICA'),
	(50,'GA','ADMINISTRATIVO'),
	(60,'CI','COMERCIO');  

INSERT INTO Alumnos VALUES
	(123,'Roberto',30),
	(185,'Jorge',40),
	(234,'Marcos',20),
	(313,'Claudia',50),
	(345,'Lucia',30),
	(404,'Ricardo',60),
    (456,'Alba',10),
	(532,'Ana',40),
	(567,'Pablo',20),
	(660,'Diego',60),
	(678,'Sandra',10),
	(730,'Daniel',50);