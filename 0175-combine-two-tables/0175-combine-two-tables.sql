-- Write your PostgreSQL query statement below
/*
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;
*/

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p, Address a
WHERE p.personId = a.personId
UNION
SELECT p.firstName, p.lastName, NULL AS city, NULL AS state
FROM Person p
WHERE p.personId NOT IN (SELECT personId FROM Address);