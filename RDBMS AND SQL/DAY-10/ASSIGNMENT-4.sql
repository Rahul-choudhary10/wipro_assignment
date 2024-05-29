USE customerinfo;

CREATE TABLE order_product( 
order_id INT PRIMARY KEY AUTO_INCREMENT,
order_city VARCHAR(100) NOT NULL,
order_count INT ,
order_person VARCHAR(50));

INSERT INTO order_product VALUES (1,'Bhopal', 39, 'Priyanshu'),
(2,'Patna', 40, 'Rahul'),
(3,'Ranchi', 55, 'Reshma'),
(4,'Karakot', 60, 'Pawan'),
(5,'Jalandhar', 35, 'Abhishek');

SELECT * FROM order_product;

START TRANSACTION;
SAVEPOINT initial;
INSERT INTO order_product VALUES (6,'Pathankot', 86, 'Chikky');
SELECT * FROM order_product;

SAVEPOINT updation;
UPDATE order_product SET order_person = 'Aarav' WHERE order_id = 2;
SELECT * FROM order_product;

ROLLBACK TO updation;
SELECT * FROM order_product;

ROLLBACK TO initial;
SELECT * FROM order_product;