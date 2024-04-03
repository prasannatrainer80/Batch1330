SELECT * FROM practice.employ;

select concat(upper(left(name,1)),substring(lower(name),2)) from Employ;

select 'rajesh battula';

select substring('rajesh battula',1, instr('rajesh battula',' ')) 'FirstName',
	substring('rajesh battula', instr('rajesh battula',' ')+1) 'LastName'; 
    
select length('misissipi')- length(replace('misissipi','i','')) ;

select last_day(curdate());

select last_day(adddate(last_day(curdate()), INTERVAL 1 MONTH));

select dayname(last_day(curdate()));

select adddate(curdate(), INTERVAL 5 YEAR);

select adddate(adddate(curdate(), INTERVAL 5 YEAR), INTERVAL 10 MONTH);

select addDate(adddate(adddate(curdate(), INTERVAL 5 YEAR), INTERVAL 10 MONTH), INTERVAL 6 DAY);


select last_day(adddate(last_day(curdate()), INTERVAL 1 MONTH));

select addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY);

select dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY));

select adddate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY), 
		INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY)) DAY ) 
        'First Friday',
        adddate(adddate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY), 
		INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY)) DAY ) , INTERVAL 7 DAY) 'Second Friday',
        addDate(adddate(adddate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY), 
		INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY)) DAY ) , INTERVAL 7 DAY), interval 7 day) 
        'Third Friday',
	addDate(        addDate(adddate(adddate(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY), 
		INTERVAL 6-dayofweek(addDate(last_day(adddate(last_day(curdate()), INTERVAL -1 MONTH)), INTERVAL 1 DAY)) DAY ) , INTERVAL 7 DAY), interval 7 day) 
, INTERVAL 7 DAY) 'Fourth Friday';
