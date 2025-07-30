create database school_system;
use school_system;
create table user(
	name varchar(19),
    password varchar(20)
);

create table students(
	name varchar(11),
    age int,
    name_c varchar(16),
    rollnumber varchar(20),
    gender varchar(12),
    address varchar (27),
    contact varchar (14)
    
);
create table classes (
    class_name VARCHAR(50)
);

create table qulificatin(
	teacher_qulification varchar(11)
);

insert into qulificatin (teacher_qulification) values 
('Ph.D'),
('BS'),
('Bs.c'),
('Ms.c'),
('M.ed');

insert into classes (class_name) values 
('Class One'),
('Class Two'),
('Class Three'),
('Class Four'),
('Class Five');


insert into user (name,password) values ('user','admin');
select * from user;

select * from classes;
select * from  students;

create table  IF NOT EXISTS  subjects (
    subject_name varchar(100)
);

insert into subjects (subject_name) VALUES 
('Mathematics'),
('Physics'),
('Chemistry'),
('Biology'),
('English'),
('Computer Science');

select * from subjects;

create table teachers (
    name varchar(100),
    teacherId varchar(17),
    qualification varchar(100),
    subject varchar(100),
    contact varchar(20)
);
select * from teachers;


create table fees (
    roll_no varchar(50),
    name varchar(100),
    total_fee double,
    paid_amount double,
    due_amount double,
    payment_date varchar(20)
);

select * from fees;
select * from students;