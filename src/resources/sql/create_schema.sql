USE employee;
CREATE TABLE Department ( 
ID INT(10) NOT NULL, 
NAME VARCHAR(30) NOT NULL, 
PRIMARY KEY (ID) ); 

INSERT INTO department (ID, NAME) VALUES ('2001', 'HR'); 
INSERT INTO department (ID, NAME) VALUES ('2002', 'Technology Support'); 
INSERT INTO department (ID, NAME) VALUES ('2003', 'Business Analyst'); 
INSERT INTO department (ID, NAME) VALUES ('2004', 'Sales');

CREATE TABLE Employee ( 
ID INT(10) NOT NULL, 
NAME VARCHAR(50) NOT NULL, 
City VARCHAR(50) NOT NULL, 
Did INT(10) NOT NULL, 
Salary INT(10) NOT NULL, 
manager_id INT(10), 
Designation VARCHAR(20), 
PRIMARY KEY (ID), 
FOREIGN KEY (Did) REFERENCES employee.department(ID) );


INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1001', 'Sam', 'Texas', '2001', '20500'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1002', 'Robin', 'Oklahoma', '2004', '30000'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1003', 'Rosy', 'New York', '2003', '15000'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1004', 'Daisey', 'Chicago', '2001', '20800'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1005', 'Jack', 'Alalanta', '2002', '34000'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1006', 'Daniel', 'New York', '2003', '26890'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1007', 'Lewis', 'Boston', '2002', '29070'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1008', 'Richard', 'Texas', '2003', '45908'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1009', 'Emilia', 'New Jersey', '2004', '35600'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1010', 'John', 'Florida', '2004', '22700'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1011', 'Brian', 'Georgia', '2002', '36729'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1012', 'Sundar', 'California', '2003', '49546'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1013', 'Bill', 'Miami', '2001', '25634'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1014', 'Jeff', 'Chicago', '2003', '65002'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1015', 'Collin', 'New York', '2001', '15005'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1016', 'Ellie', 'Sanfransisco', '2002', '27860'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1017', 'John', 'Texas', '2003', '27900'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1018', 'Jessy', 'Texas', '2001', '12005'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1019', 'Heados', 'Omaha', '2004', '45600'); 
INSERT INTO employee (ID, NAME, City, Did, Salary) VALUES ('1020', 'Jenny', 'Utah', '2004', '55600');   

UPDATE employee SET designation= 'Employee';
UPDATE employee SET designation= 'Manager' WHERE city = 'Texas';
UPDATE employee SET designation= 'CEO' WHERE NAME= 'Jeff'


UPDATE employee SET manager_id= NULL;
UPDATE employee SET manager_id= 1014 WHERE designation='Manager';
UPDATE employee SET manager_id= 1001 WHERE designation='Employee' AND Did=2001;
UPDATE employee SET manager_id= 1008 WHERE designation='Employee' AND Did=2002;
UPDATE employee SET manager_id= 1017 WHERE designation='Employee' AND Did=2003;
UPDATE employee SET manager_id= 1018 WHERE designation='Employee' AND Did=2004;


SELECT * FROM employee;
SELECT * FROM department;