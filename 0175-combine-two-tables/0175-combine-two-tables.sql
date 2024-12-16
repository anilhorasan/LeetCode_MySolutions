-- Write your PostgreSQL query statement below
select firstName, lastName, city, state
from Person left join Address
on Person.personId  = Address.personId;

/*

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;

select p.firstName, p.lastName, a.city, a.state 
from Person  p, Address a 
where p.personId  = a.personId ;

SELECT Person.firstName, Person.lastName, Address.city, Address.state 
FROM Person 
NATURAL LEFT JOIN Address;

select firstName, lastName, city, state
from Person left join Address
on Person.personId  = Address.personId;

*/

/*
-- Subquery with UNION
SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p, Address a
WHERE p.personId = a.personId
UNION
SELECT p.firstName, p.lastName, NULL AS city, NULL AS state
FROM Person p
WHERE p.personId NOT IN (SELECT personId FROM Address);


-- Full Outer Join (If Supported)
SELECT COALESCE(p.firstName, '') AS firstName, 
       COALESCE(p.lastName, '') AS lastName, 
       COALESCE(a.city, '') AS city, 
       COALESCE(a.state, '') AS state
FROM Person p
FULL OUTER JOIN Address a
ON p.personId = a.personId;
*/