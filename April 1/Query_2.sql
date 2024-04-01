-- Order By : Used to display data w.r.t. Specific field(s) in ascending or descending order 

select Empno, Ename, Job, Sal, comm
from Emp 
Order by Ename;

select Empno, Ename, Job, Sal, comm
from Emp 
Order by Ename desc; 

select Empno, Ename, job, sal, comm
from Emp 
order by job, ename;

select Empno, Ename, job, sal, comm
from Emp 
order by job, ename desc;



