Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

Equilateral: It's a triangle with  sides of equal length.
Isosceles: It's a triangle with  sides of equal length.
Scalene: It's a triangle with  sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.


SELECT CASE
when A=B and B=C AND A=C then "Equilateral"
when A=B or B=C OR A=C then "Isosceles"
when A<>B and B<>C and A<>C then "Scalene"
WHEN (A+B)<=C OR (B+C)<=A OR (A+C)<=B THEN "Not A Triangle"
END AS TYPE
from TRIANGLES ;
