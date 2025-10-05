-- CREATE DATABASE ipshopy ; 
-- USE ipshopy ; 

-- CREATE TABLE Employee (
-- emp_id INT AUTO_INCREMENT PRIMARY KEY,
-- Name VARCHAR(100),
-- salary INT
-- );

-- INSERT INTO Employee VALUES
-- (111,'Sagar Magare' , 20000),
-- (112,'Shubham kute' , 25000),
-- (113,'Krishna salve' ,15550),
-- (114,'Nikita basiye' , 15000),
-- (115,'akshay golekar' , 15570);


-- SELECT * FROM Employee ; 

SELECT distinct salary 
FROM Employee 
ORDER BY salary DESC 
LIMIT 1 OFFSET 1 ;  

