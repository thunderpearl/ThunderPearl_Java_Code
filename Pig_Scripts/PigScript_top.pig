employee_details2 = load '/input_files/employee_details2.txt' using PigStorage(',')as(id:int,name:chararray,age:int,city:chararray);

employee_group = group employee_details2 by age;

employee_top = foreach employee_group{top = TOP(2,1,employee_details2);generate top;}

store employee_top into '/output_files/employee_top' using PigStorage('#');
