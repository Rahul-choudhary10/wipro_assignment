SELECT * FROM student;

INSERT INTO student VALUES (1, "Rahul", 8.45, "BCA");

INSERT INTO student VALUES (2, "Khushi", 9.12, "BTECH"),
(3, "Sukesh", 7.45, "BCA"),
(4, "Abhishek", 8.12, "BCA"),
(5, "Sonali", 7.89, "BBA");

INSERT INTO student(id, sname, cgpa) VALUES (6, "Ritika", 7.76);

SET SQL_SAFE_UPDATES = 0;

UPDATE student SET branch = "BCOM" WHERE branch = "BCA";
UPDATE student SET sname = "Sandhya" WHERE id = 2;