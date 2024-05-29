CREATE DATABASE customerInfo;

SHOW DATABASES;

USE customerInfo;
CREATE TABLE customers (
customer_id INT PRIMARY KEY,
customer_name VARCHAR(100),
customer_email VARCHAR(255) UNIQUE,
customer_city Varchar(100) NOT NULL
);

DESC customers;

INSERT INTO customers VALUES (1, 'Rahul', 'Rahulchy808@gmail.com', 'Patna'),
(2, 'Ayush', 'Ayushluthra808@gmail.com', 'Jalandhar'),
(3, 'Sukhdev', 'Sukhdev808@gmail.com', 'Jalandhar'),
(4, 'Khushi', 'Khushibatera808@gmail.com', 'Patna'),
(5, 'Rupa', 'Rupabatera808@gmail.com', 'Patna'),
(6, 'Priyanshsu', 'Priyanshukumar808@gmail.com', 'Patiyala'),
(7, 'Abhishek', 'Abhishekshar808@gmail.com', 'Pathankot');

SELECT * FROM customers;

SELECT customer_name , customer_email FROM customers WHERE customer_city = 'Patna';