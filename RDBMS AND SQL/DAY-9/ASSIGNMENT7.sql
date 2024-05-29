CREATE DATABASE Library_Book;

USE Library_Book;
SET SQL_SAFE_UPDATES = 0;

INSERT INTO books VALUES ('Programming in C', 'Rahul', 'IT', '212', 'Technology');
SELECT * FROM books;

SELECT * FROM books WHERE Height = 212;

DESC books;

UPDATE books SET Height = 250 WHERE Publisher = 'Penguin';
DELETE FROM books WHERE Height = 179;
