-- Display info about Agent Table 

desc agent;

-- Display all records from Agent table 

select * from Agent;

-- Display AgentId, firstNme, lastName, city, state
-- from Agent table

select agentid, firstname, lastname, city, state
from Agent;

-- Dispaly all records whose gender = 'female'

select * from Agent where gender='Female';

-- Display all records whose are married (maritalstatus is 1) 

select * from Agent where maritalstatus = 1;

-- display all records who are born between 1980 to 1990 

select * from Agent where year(dob) between 1980 and 1990;