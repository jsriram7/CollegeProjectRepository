create table signup
(
firstname varchar2(20),
lastname varchar2(20),
username varchar2(20) constraint p1 primary key,
password varchar2(30),
c_password varchar2(30),
dob date,
gender varchar2(2),
email varchar2(20),
ph_num number(15)
);


create table login
(
username varchar2(20),
password varchar2(20)
);


create table insert_book
(
bookid varchar2(10),
authorname varchar2(20),
title varchar2(20),
publisher varchar2(20),
keywords varchar2(10)
);


create table del_book
(
bookid varchar2(10)
);


create table account_details
(
name_of_book varchar2(10),
date_issued date,
due_date date,
fine number
);


create table reserve
(
r_authorname varchar2(20),
r_title varchar2(20),
r_publisher varchar2(20),
r_keywords varchar2(10)
);


create table extend
(
e_username varchar2(20),
e_months varchar2(20)
);

create table catalogue
(
c_authorname varchar2(20),
c_title varchar2(20),
c_publisher varchar2(20),
c_keywords varchar2(10)
);

