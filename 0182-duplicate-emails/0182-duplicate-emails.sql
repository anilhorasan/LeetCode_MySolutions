-- Write your PostgreSQL query statement below

SELECT p1.email as Email
FROM Person p1
JOIN Person p2
ON p1.email = p2.email
WHERE p1.id < p2.id
GROUP BY p1.email;

/*

SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;


SELECT p1.email as Email
from Person p1
join Person p2
on p1.email = p2.email
where p2.id > p1.id 



SELECT e.name as Employee
FROM Employee e
Join Employee m
on e.managerID = m.id
where e.salary > m.salary




SELECT EMP.name AS Employee FROM Employee EMP,Employee MGR
WHERE EMP.managerId=MGR.id AND EMP.salary>MGR.salary

SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;


--
SELECT Person.firstName, Person.lastName, Address.city, Address.state 
FROM Person 
NATURAL LEFT JOIN Address;



SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;

SELECT Person.firstName, Person.lastName, Address.city, Address.state 
FROM Person 
NATURAL LEFT JOIN Address;


*/