create database library_db;

use library_db;

create table books (
    id int primary key,
    name varchar(100),
    isbn varchar(50),
    author varchar(100),
    quantity int
);
select * from books;

create table issued_books(
    student_id int,
    student_name varchar(100),
    roll_number varchar(50),
    book_isbn varchar(50)
);
select * from issued_books;

create table returned_books (
    student_id int,
    book_isbn varchar(50)
);
select * from returned_books;


drop database library_db;