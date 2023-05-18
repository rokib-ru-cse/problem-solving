Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.


SELECT DISTINCT CITY FROM STATION WHERE (CITY NOT LIKE 'a%' and CITY NOT LIKE 'e%' and CITY NOT LIKE 'i%' and CITY NOT LIKE 'o%' and CITY NOT LIKE 'u%') or (CITY NOT LIKE '%A' and CITY NOT LIKE '%E' and CITY NOT LIKE '%I' and CITY NOT LIKE '%O' and CITY NOT LIKE '%U');