create database if not exists studentdb;
use studentdb;

create table if not exists students (
    id int primary key,
    name varchar(100) not null,
    email varchar(100) not null
);

select * from students;
