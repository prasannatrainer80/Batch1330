-- Write a Query as to display head name for JOB as 
	-- job CLERK HEAD is 'Rajesh'
    -- job SALESMAN HEAD is 'Padmanjali'
    -- job MANAGER HEAD is 'Chandra Sekhar'
    -- job 'ANALYST' HEAD is 'Karthik Karanam'
    -- else HEAD is 'Mythri'
    
    select empno, ename, job, sal, comm, 
    case job
       WHEN 'CLERK' THEN 'RAJESH'
       WHEN 'SALESMAN' THEN 'Padmanjali'
       WHEN 'MANAGER' THEN 'Chandra Sekhar'
       WHEN 'ANALYST' THEN 'Karthik Karanam'
       else 'Mythri'
    end 'head-name'
    from Emp;
    
select empno, ename,job,sal,comm from emp;

-- Replace comm value from null to 0

select empno, ename, job, sal, comm, 
case 
	when comm is null then 0 
    else comm end 'upd-comm'
from emp;

select empno, ename, job, sal, comm, 
case 
	when comm is null then 0 
    else comm end 'upd-comm',
case when comm is null then sal
    else sal+comm end 'Take-Home'
from emp;

