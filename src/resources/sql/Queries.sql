SELECT * FROM employee ORDER BY salary DESC LIMIT 2,1;
SELECT * FROM employee WHERE Did IN (SELECT id FROM department WHERE NAME IN('Technology Support'));

SELECT a.role_type,COUNT(*) FROM
(SELECT e.id AS emp_id, e.name AS emp_name, d.name AS dept_name, 
CASE
WHEN d.name = 'Technology Support' THEN 'Technical'
WHEN d.name = 'HR' THEN 'Non-Technical'
WHEN d.name = 'Business Analyst' THEN 'Non-Technical'
WHEN d.name = 'Sales' THEN 'Non-Technical'
ELSE NULL
END AS role_type
FROM  employee e JOIN department d ON e.did = d.id) AS a GROUP BY a.role_type;

SELECT e1.id, e1.name, e1.designation, e2.id AS manager_id, e2.name AS manager_name, e2.designation AS manager_designation
FROM employee e1,employee e2 WHERE e1.manager_id= e2.id AND e2.designation= 'CEO'

