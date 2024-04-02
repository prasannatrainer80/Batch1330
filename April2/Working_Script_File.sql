drop database if exists sonixpractice;

create database sonixpractice;

use sonixpractice;

Create Table Employ
(
    Empno INT Primary Key,
    Name varchar(30),
    Gender varchar(20),
    Dept varchar(20),
    Desig varchar(20),
    Basic numeric(9,2)
);

Insert into Employ(empno, Name, Gender,Dept,Desig,Basic)
values(1,'Manohar','MALE','Java','Programmer',88424),
(2,'Anil Varma','MALE','React','Manager',88255),
(3, 'Meghana','FEMALE','Java','Expert',88255),
(4, 'Padmanjali','FEMALE','Java','Developer',88255),
(5, 'Ramanaji','MALE','React','Expert',88211);