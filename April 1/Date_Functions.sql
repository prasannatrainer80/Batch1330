
-- Date Functions 

-- curdate() : Used to display the current date 

select curdate();

-- curTime() : Used to display current time 

select curtime();

-- dayofmonth() 

select dayofmonth(curdate());

select quarter(curdate());

select adddate(curdate(),INTERVAL 5 day); 

select adddate(curdate(),INTERVAL 5 MONTH); 

select adddate(curdate(),INTERVAL -5 YEAR); 