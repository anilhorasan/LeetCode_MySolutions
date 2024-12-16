-- Write your PostgreSQL query statement below

SELECT e.name as Employee
FROM Employee e
Join Employee m
on e.managerID = m.id
where e.salary > m.salary


/*
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