select user();
select current_date();
select current_time();
select now();

show databases;
create database db2;
drop database db2;
use db2;
show tables;
create table employee(id int primary key, name varchar(20),
  salary float(10,2),dob date);
desc employee;
describe employee; 
-- desc and describe is  used for table structure 
-- text, char, varchar, date , time are taken in single quote 
-- insert into all fields 
insert into employee values(10001,'ram kumar',20000.66776,'2000-10-30');
select * from employee;

-- insert into some fields 

-- insert into employee values(10001,'ram kumar'); error 
insert into employee values(10001,'ram kumar');
-- in this case last, other columns have null values
select * from employee;

-- multi line values 

insert into employee values
(10004,'deepak kumar',25000.66776,'2000-10-30'),
(10005,'devansh kumar',28000.66776,'2001-12-31'),
(10006,'shashi kumar',29000.66776,'2002-1-30'),
(10007,'rupak kumar',56000.66776,'1997-2-27');

select * from employee;
select id from employee;
select id,name from employee;
select * from employee where id=10001;
select * from employee where id>10003;

select * from employee where id=10001 or name='shashi kumar';

select * from employee where id=10001 and name='shashi kumar';

select * from employee where salary>=20000 and salary<=40000;
-- between operator 
select * from employee where salary between 20000 and 40000;
-- is null 
select * from employee where salary is null;
-- is not null 
select * from employee where salary is not null;
desc employee;
alter table employee add entry_time time;


insert into employee values
(10008,'mr prithvi raj kapoor',25000.66776,'2000-10-30','10:11:55');

alter table employee modify  name varchar(50);
desc employee;
-- 'entrty_time', 
alter table employee change id employee_id int;
alter table employee change entrty_time entry_time time;
alter table employee drop column entry_time;
select * from employee;
delete from employee where employee_id=10008;

update employee set name='rahul kumar', dob='1995-12-25' 
where employee_id=10002;

create table test1(id int);
show tables;
drop table test1;
 select employee_id,name,salary,salary+(salary*10/100) 'incremented salary', dob from employee;
 select employee_id,name as 'employee name',salary,salary+(salary*10/100) 
 'incremented salary', dob from employee;
 select * from employee order by salary;
 select * from employee order by salary desc;
 desc employee;
 
 
 create table library(id int primary key auto_increment,
 library_name varchar(20) not null unique, 
 location varchar(20) default 'chennai', fee float, check(fee>=500));
  desc library;
 
 insert into library (library_name,location,fee) values
 ('history library','delhi',500); 
 --  id   - 1 
 
 insert into library (library_name,location,fee) values
 ('history library','delhi',500); 
 --  id   - 2
 
 select * from library;
insert into library 
 values(90001,'science library','mumbai',800); 
 -- id -- 90001
 insert into library (library_name,location,fee) values
 ('english library','delhi',500); 
-- id -- 90002

insert into library (library_name,fee) values
 ('music library',500);
 select * from library;
 insert into library (library_name,fee) values
 ('movie library',400);
 
 create table product(pid int primary key,cost float, pname varchar(20));
 
 create table product_order(order_id int primary key, qty int, 
 product_id int  unique not null, foreign key (product_id) references 
 product(pid) );
 
 -- product   -- parent table 
 -- product_order -- child table 
 -- first pid  must be added to product table then related value can be 
 -- added in child table product_order
 
 -- while delete , first remove from child table then parent table 
 
 insert into product values(20001,200, 'water bottle');
 insert into product_order values(1,10,20001); -- error 
 delete from product; -- error 
 
 delete from product where  pid=20001; -- error 
 delete from product_order  where product_id=20001;
 
 -- payment -- product, product_order
 -- delievery --payment, product, product_order
 
 -- dictinct 
  create table book(isbn int primary key, bname text, cost float);
  insert into book values(8787879,'sql for dummies',600);
  insert into book values(8787880,'sql for beginner',800);
  insert into book values(8787881,'sql for dummies',600);
  insert into book values(8787879,'sql for dummies',600);
  insert into book values(8787882,'professional sql',1800);
  insert into book values(8787883,'sql for beginner',800);

use db2; 
 select * from book; 
 select distinct bname from book;
 select distinct(bname) from book;
 select distinct cost from book;
-- aggregate function

select * from employee;
select * from employee limit 0,3;
select * from employee limit 2,3;
select count(*) from employee;
select count(name) from employee;
select count(salary) from employee;
-- count not include null values 

select count(*), sum(salary) as 'total salary', max(salary) as 'max salary', min(salary) 'minimum salary', avg(salary) 'average salary'  from employee;

-- group by

create table customer( id int primary key, name text, city text, state  text);

insert into customer values
(76767761,'amit kumar','chennai', 'tamil nadu' ),
(76767762,'sumit kumar','mumbai', 'maharastra' ),
(76767763,'pardip kumar','madurai', 'tamil nadu' ),
(76767764,'saumesh kumar','new delhi', 'delhi' ),
(76767767,'veeresh kumar','chennai', 'tamil nadu' ),
(76767768,'kundan kumar','kolkotta', 'west bengal' ),
(76767769,'rahul kumar','mumbai', 'maharastra' ),
(76767790,'dheeraj kumar','kolkotta', 'west bengal' ),
(76767792,'rahul kumar','new delhi', 'delhi' );

select count(name), city  from customer group by city;

select count(name), state  from customer group by state;

 select count(name), state  from customer group by state having state='delhi';

--  join 
 
 create table product1(pid int primary key,cost float, pname varchar(20));
 
 create table product_order1(order_id int primary key, qty int, 
 product_id int unique not null );

insert into product1 values(20001,200, 'water bottle');
insert into product1 values(20002,700, 'shirt');
insert into product1 values(20003,1200, 'pant');
insert into product1 values(20004,19000, 'mobile');
insert into product1 values(20005,16000, 'freeze');
insert into product1 values(20006,40000, 'tv');
insert into product1 values(20007,567, 'book');
insert into product1 values(20008,7000, 'cycle');
 
insert into product_order1 values(1,10,20001);
insert into product_order1 values(2,1,20003);
insert into product_order1 values(3,1,20004);
insert into product_order1 values(4,2,20006);
insert into product_order1 values(5,5,20007);
insert into product_order1 values(6,1,20009);
insert into product_order1 values(7,8,200011);
insert into product_order1 values(8,6,200015); 
 
- cross join 
 select * from product1, product_order1;
-- inner join  old sql syntax 
  list of product and order for which order has been placed
   
  select * from product1, product_order1 where product1.pid=product_order1.product_id;
-- inner join  old sql syntax using alias 
  select * from product1 p, product_order1 o where p.pid=o.product_id; 

-- inner join  new sql(ansi sql) syntax
  
   select * from product1 p inner join   product_order1 o on  p.pid=o.product_id; 
  
 
 
 