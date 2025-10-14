create database if not exists library_db;
use library_db;


create table if not exists books (
    id int primary key auto_increment,
    title varchar(255) not null,
    author varchar(255) not null,
    quantity int not null
);


create table if not exists members (
    id int primary key auto_increment,
    name varchar(255) not null,
    email varchar(255) not null unique
);


create table if not exists issue_records (
    id int primary key auto_increment,
    book_id int not null,
    member_id int not null,
    issue_date date not null,
    return_date date,
    foreign key (book_id) references books(id) on delete cascade,
    foreign key (member_id) references members(id) on delete cascade
);

select * from books;
