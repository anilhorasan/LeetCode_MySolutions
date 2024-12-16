# Write your MySQL query statement below
Select name as Customers from
((SELECT  * FROM Customers) 
EXCEPT
(SELECT  Customers.id, Customers.name FROM Customers 
JOIN Orders 
ON Customers.id = Orders.customerId)) as cs

/* 

QUERY 1: 
(SELECT  * FROM Customers) 
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |

EXCEPT 

QUERY 3: 
(SELECT  Customers.id, Customers.name FROM Customers 
JOIN Orders 
ON Customers.id = Orders.customerId)

| id | name |
| -- | ---- |
| 1  | Joe  |
| 3  | Sam  |




SELECT name AS Customers FROM
((SELECT  Customers.id, Customers.name FROM Customers) 
EXCEPT
(SELECT  Customers.id, Customers.name FROM Customers 
JOIN Orders 
ON Customers.id = Orders.customerId))

*/