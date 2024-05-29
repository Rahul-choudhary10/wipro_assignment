CREATE DATABASE LIBRARY;

SHOW DATABASES;

USE LIBRARY;

CREATE TABLE books (book_id INT PRIMARY KEY AUTO_INCREMENT,
		book_name varchar(20) NOT NULL,
        author_name varchar(30) NOT NULL,
        book_price int CHECK (book_price<1000),
        branch varchar(40));
        
ALTER TABLE books RENAME TO libraryBook;

DESC libraryBook;

INSERT INTO books (book_name, author_name, book_price, branch) VALUES 
('C', 'Rahul', 200, 'BCA'),
('C++', 'Sandhya', 600, 'BCA'),
('Pyhton', 'Maria', 980, 'BTECH'),
('JAVA', 'Abhi', 400, 'BTECH');

SELECT * FROM books;

        
