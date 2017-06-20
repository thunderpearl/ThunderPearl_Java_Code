usertotal_load = load '/input_files/usertotal.txt' using PigStorage(',')as(serialnum:chararray,profession:chararray,name:chararray,salary:chararray,city:chararray);
iterate = foreach usertotal_load generate usertotal_load.profession,usertotal_load.salary;
dump iterate; 
