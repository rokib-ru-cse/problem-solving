=> query to print the respective hacker_id and name of hackers who achieved full scores for more than one challenge.

=> Order your output in descending order by the total number of challenges in which the hacker earned a full score

=>  If more than one hacker received full scores in same number of challenges, then sort them by ascending hacker_id.
Hackers
Difficulty
Challenges
Submissions

SELECT Hackers.hacker_id,Hackers.name
from Submissions inner join
Hackers on Submissions.hacker_id=Hackers.hacker_id
inner join
Challenges on Submissions.challenge_id=Challenges.challenge_id
inner join
Difficulty on Challenges.difficulty_level=Difficulty.difficulty_level
where Difficulty.score=Submissions.score
group by hacker_id,name
having  count(*)>1
order by count(*) desc,Submissions.hacker_id asc
;


select h.hacker_id,h.name from hackers h
inner join submissions s on s.hacker_id=h.hacker_id
inner join challenges c on c.challenge_id=s.challenge_id
inner join difficulty d on d.difficulty_level=c.difficulty_level
where s.score=d.score
group by h.hacker_id,h.name
having count(h.hacker_id)>1
order by count(h.hacker_id) desc,h.hacker_id;

