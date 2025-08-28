create database student_system;
use student_system;
create table students (
    id int auto_increment primary key,
    name varchar(100),
    age int,
    roll_number varchar(50),
    gender varchar(10),
    course varchar(100),
    department varchar(100)
);

select * from students;

