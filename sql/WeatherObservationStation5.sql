Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

SELECT CITY,LENGTH(CITY) FROM STATION where LENGTH(CITY)=min(LENGTH(CITY)) order by CITY limit 1;
SELECT CITY,LENGTH(CITY) FROM STATION where LENGTH(CITY)=max(LENGTH(CITY)) order by CITY limit 1;
