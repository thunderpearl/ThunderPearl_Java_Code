/* This script is used for cleansing the DelayedFlights data for further used  by hive scripts */

/* Hive script is aviation_data_analysis1.sql */

/* Register the piggibank.jar */
REGISTER '/home/cloudera/piggybank.jar';

/* Loading the csv file from hdfs... */
A = load '/input_files/DelayedFlights.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage(',');

/* Generating the needed columns which can be used for further analysis... */
B = foreach A generate (int)$1 as year,(int)$2 as month,(int)$10 as flight_num,(chararray)$17 as origin,(chararray)$18 as dest,(int)$22 as cancelled,(chararray)$23 as cancel_code,(int)$24 as diversion; 

describe B;

/* For seeing first 3 rows. In between we need to check what typeof data we are generating... */
B_limit = limit B 3;
dump B_limit;

/* We will have some null values as well in B, so we need to filter that data so that no data with null remain... */
C = filter B by (year is not null) AND (month is not null) AND (flight_num is not null) AND (origin is not null) AND (dest is not null) AND (cancelled is not null) AND (cancel_code is not null) AND (diversion is not null);

/* Checking top 3 rows of the data... */
C_limit = C limit 3;
dump C_limit;

/* Store the data of C into a folder which pig will create at fly that is run-time else an error will be thrown. Folder will be automatically created by pig itself...*/

/* But, this will create 4 files inside Cleansed_Data which we would like to have at one place... */
store C into '/input_files/Cleansed_Data' using PigStorage(',');
