create database student_management_system_jdbc_dao;

use student_management_system_jdbc_dao;

create table department (
    d_name varchar(100),
    d_code varchar(50) primary key
);

create table student (
    s_name varchar(100),
    s_rollno varchar(50) primary key,
    s_age int,
    s_dept varchar(50),
    foreign key (s_dept) references department(d_code)
);

select * from student;