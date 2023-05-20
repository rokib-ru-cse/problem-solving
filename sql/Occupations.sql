Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.


SELECT Name,Name,Name,Name
from OCCUPATIONS
where OCCUPATIONS.Name='Doctor' or OCCUPATIONS.Name='Professor' or OCCUPATIONS.Name='Singer' or
OCCUPATIONS.Name='Actor';