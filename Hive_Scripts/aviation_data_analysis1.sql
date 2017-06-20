-- This is the table which we have created using the cleansed data of Delayed Flights by Pig.
-- Now, we will be analyzing the data using hive...
-- table name is 'delayedflights' which is in 'mydb'


-- Which month have seen the most number of cancellation due to bad weather....
-- nofc is variable, meaning 'number of flights cancelled' .
select month,count(cancelled) as nofc from delayedflights where cancelled = 1 AND cancel_code = 'B' group by month ORDER by nofc DESC LIMIT 1;

-- Answer has come to be 12th month and flights cancelled are 250 .

-- Top 10 routes(origin and dest) that has seen maximum diversions....
-- nod means 'number of diversion' . 
select origin,dest,count(diversion) as nod from delayedflights where diversion = 1 group by origin,dest order by nod DESC limit 10;


-- Top 5 visited destination...
-- td means 'top destination'
select dest,count(dest) as td from delayedflights group by dest order by td DESC limit 5;
