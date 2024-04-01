-- String Functions : 

-- instr() : Used to display the first occurrence of the given char. 

select instr('Ramanjaneyulu','a');

-- Length() : displays total no.of chars of a string 

select length('Vara lakshmi devi');

select ename, length(ename) from Emp;

-- Reverse() : Displays string in reverse order 

select reverse('Tarak'); 

select ename, reverse(ename) from Emp;

-- Lower() : Displays in lower case

-- Upper() : Displays n Upper Case 

select ename, lower(ename) 'lower-case', 
	upper(ename) 'upper-case' from Emp;

-- left () : Displays no.of left-side chars

-- right() : Displays no.of right-side chars 

select ename, left(ename,4) , right(ename,4) from Emp;

-- substring() : Used to display part of the string. 

select substring('chandra sekhar',5,10);

-- replace() : used to replace old char/string with new char/string in all occurrences

select replace('Java Training','Java','Sql');

-- 