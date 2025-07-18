create database java_swing_project;
use java_swing_project;
create table Registration(
	id int primary key auto_increment,
    name varchar(16),
    email varchar(100),
    password varchar(100),
    gender varchar(10),
    phone varchar(20),
    city varchar(50),
    course varchar(50)
);

create table courses(
	id int primary key auto_increment,
    name varchar(16)
);

insert into courses (name) values ('English'),('Physics'),('Mathematics'),('Chemsitry');

select * from Registration;
select * from courses;