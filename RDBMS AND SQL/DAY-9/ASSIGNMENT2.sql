USE library;

CREATE TABLE Authors (
author_id INT PRIMARY KEY,
author_name VARCHAR(100) NOT NULL
);

CREATE TABLE Book(
book_id INT PRIMARY KEY,
title VARCHAR(255) NOT NULL,
author_id INT,
publication_year INT,
genre VARCHAR(50),
ISBN VARCHAR(13) UNIQUE,
FOREIGN KEY (author_id) REFERENCES Authors(author_id)
);


 -- create members table
 CREATE TABLE Members(
 member_id INT PRIMARY KEY,
 member_name VARCHAR(100) NOT NULL,
 member_email VARCHAR(100),
 date_of_birth DATE,
 address VARCHAR(255)
 );
 
 -- create borrowing table
 CREATE TABLE Borrowings(
 borrowing_id INT PRIMARY KEY,
 book_id INT,
 member_id INT,
 borrowing_date DATE NOT NULL,
 due_date DATE NOT NULL,
 return_date DATE,
 FOREIGN KEY (book_id) REFERENCES Book(book_id),
 FOREIGN KEY (member_id) REFERENCES Members(member_id),
 CHECK (return_date IS NULL OR return_date >= borrowing_date)
 );
 
 CREATE TABLE Author_Books(
 author_id INT,
 book_id iNT UNIQUE,
 PRIMARY KEY (author_id),
 FOREIGN KEY (author_id) REFERENCES Authors(author_id),
FOREIGN KEY (book_id) REFERENCES Book(book_id)
);
