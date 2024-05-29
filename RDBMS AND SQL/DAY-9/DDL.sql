create database wipro_training;

SHOW databases;

USE wipro_training;

CREATE TABLE student (
id INT PRIMARY KEY, 
stu_name varchar(30),
gpa decimal(3,2));

DROP TABLE student;  

DESC student;

ALTER TABLE student add branch varchar(5);

ALTER TABLE student add marks int;

ALTER TABLE student DROP COLUMN marks;

ALTER TABLE student RENAME COLUMN stu_name to sname;

ALTER TABLE student RENAME COLUMN gpa to cgpa;

ALTER TABLE student modify COLUMN sname varchar(20);

TRUNCATE student;

USE wipro_training;

SELECT * FROM employee;



