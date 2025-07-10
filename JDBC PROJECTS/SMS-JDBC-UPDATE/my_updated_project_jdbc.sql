create database my_updated_project_jdbc;
use my_updated_project_jdbc;
create table student (
    s_name varchar(100),
    s_rollNo varchar(20) unique,
    s_age int,
    s_dept varchar(100)
);

create table department(
	dept_name varchar(15),
    dept_code varchar (16)
);

select * from student;