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

CREATE TABLE orders(
order_id INT PRIMARY KEY AUTO_INCREMENT,
customer_id INT,
order_date DATE,
FOREIGN KEY orders(order_id) REFERENCES customers(customer_id));

DESC orders;

INSERT INTO orders VALUES (1,1,'2023-01-02');

INSERT INTO orders VALUES(2,2,'2024-02-09'),
(3,3, '2023-12-09'),
(4,4, '2024-09-03'),
(5,5, '2025-11-06'),
(6,6, '2003-02-04'),
(7,7, '2013-07-02');

SELECT * FROM orders;

SELECT customers.customer_id, customers.customer_name, orders.order_id, orders.order_date FROM customers
INNER JOIN orders ON customers.customer_id = orders.customer_id WHERE customers.customer_city = 'Patna';

SELECT customers.customer_id , customers.customer_name, orders.order_id, orders.order_date From customers
LEFT JOIN orders ON customers.customer_id = orders.customer_id;

