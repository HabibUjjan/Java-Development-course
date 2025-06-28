create database student_management_system_JDBC;
use student_management_system_JDBC;

create table student (
    s_id int auto_increment primary key,
    s_name varchar(100),
    s_rollNo varchar(20) unique,
    s_age int,
    s_dept varchar(100)
);


select * from student;