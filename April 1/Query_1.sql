-- How to change to particular databae 

use sonix1330;

-- Display list of tables available in current db

show tables;

-- Display info about Emp table 

desc Emp;

-- Display info about Dept table 

desc Dept;

-- Display all records from Emp table 

select * from Emp;

-- Display all records from Dept table 

select * from Dept;

-- Display Empno, ename,job,sal,mgr from Emp table 

select empno, ename,job, sal,mgr
from Emp;

-- Where Claue : Used to display filtered records 

-- Display all records whose sal > 2000

select * from Emp 
where sal > 2000;

-- Display info. whose empno is 7902

select * from Emp where empno=7902;

-- Display info. whose ename is 'KING' 

select * from Emp where Ename='KING';

-- Display info. whose job is 'MANAGER'

select * from Emp where job='MANAGER'; 

-- dislay info whose job is 'CLERK'

select * from Emp where job='CLERK';

-- between..and : Used to display records from start to end specified 

select * from Emp where 
sal between 1000 and 3000;

select * from Emp where 
sal not between 1000 and 3000;

-- In clause : Used to display particulr fields values of table 

-- Display info whose ename is SCOTT or KING or FORD or JAMES 

select * from Emp where ename in('SCOTT','KING','FORD','JAMES');

-- display info whose Empno is 7499 or 7788 or 7844 or 7521 or 7654

select * from Emp where empno in(7499,7788,7844,7521,7654);

select * from Emp where ename NOT in('SCOTT','KING','FORD','JAMES');

-- display info whose Empno is 7499 or 7788 or 7844 or 7521 or 7654

select * from Emp where empno NOT in(7499,7788,7844,7521,7654);

-- LIKE operator used to display data w.r.t. Wild-cards % and _ are wildcards 

-- Display info whose ename start with 'S' 

select * from Emp where ename like 'S%';

-- Display info whose ename ends with 'S'

select * from Emp where ename like '%S';

