usertotal = load '/input_files/usertotal.txt' using PigStorage(',')as(serialnum:chararray,profession:chararray,name:chararray,salary:int,city:chararray);
grouping = GROUP usertotal by profession;
average = FOREACH grouping GENERATE usertotal.name,AVG(usertotal.salary);
STORE average into '/output_files/usertotal_output';
