/*We are registering a jar called as piggybank.jar which is present on local file system i.e. /home/cloudera/piggybank.jar */
REGISTER /home/cloudera/piggybank.jar;

/* Loading the DelayedFlights.csv from the hdfs... */
A = LOAD '/input_files/DelayedFlights.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage(',');

/* Extracting the needed columns and also defining their alias and data type on fly aka run time... */
B = foreach A generate (int)$1 as year,(int)$10 as flight_num,(chararray)$17 as origin,(chararray)$18 as dest;

/* Filter the data in B by condition where destination is not null... */
C = filter B by dest is not null;

/* Grouping the data together on the basis of same destination */
D = group C by dest;

/* We can see the first row of data in D as below by limiting the result to be displayed... */

D_limit = LIMIT D 1;
dump D_limit;

/* In this below query we are iterating through each D and generating group which is "dest" in D and also we are counting number of times that particular destination occur based on the data of C */

/* So, below query will produce "dest int" . We can check that by describe method as well */
E = foreach D generate group, COUNT(C.dest);

/* Getting the result of E in descending order... */
F = order E by $1 DESC;

/* Getting top 5 results */
Result = LIMIT F 5;
dump Result;

/* Till now we have already found the top 5 most visited destination*/


/*  */

/* Now, loading the airports.csv file from hdfs */
A1 = load '/input_files/Airports.csv' USING org.apache.pig.piggybank.storage.CSVExcelStorage(',');

A2 = foreach A1 generate (chararray)$0 as dest,(chararray)$2 as city,(chararray)$4 as country;

/* Checking 1st row of the A2 */
A2_limit = LIMIT A2 1;
dump A2_limit;

/* Joining the data of both the two files... */
/* By joining like below we will get the name of city and country as well for most visited destination... */

/* This is a inner join, so we will get intersectoin value. Still we will get 6 rows only because dest code is unique, so we will get 5 rows... */
joined_table = join Result by $0, A2 by dest;

dump joined_table;


