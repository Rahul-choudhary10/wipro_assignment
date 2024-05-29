USE wipro_training;

DESC student;

SELECT * FROM student;

START TRANSACTION;

SAVEPOINT initial;

INSERT INTO student VALUES (7,'swathi', 8.45, 'BTECH');

SAVEPOINT updation;

UPDATE student SET sname = 'Aarav' WHERE id = 2;

SAVEPOINT insertAfterUpdation;

INSERT INTO student VALUES (8,'Deepa', 8.25, 'BCOM');

ROLLBACK TO initial;

SELECT * FROM student;

ROLLBACK TO insertAfterUpdation;

SELECT * FROM student;

COMMIT;