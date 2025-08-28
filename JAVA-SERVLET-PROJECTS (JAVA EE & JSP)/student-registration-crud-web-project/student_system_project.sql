create database student_system_project;
use student_system_project;

create table students (
    roll_number varchar(20) primary key,
    name varchar(100),
    age int,
    gender varchar(10),
    course varchar(100),
    department varchar(100)
);

select * from students;