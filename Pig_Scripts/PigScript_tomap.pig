employee_details2 = load '/input_files/employee_details2.txt' using PigStorage(',')as(id:int,name:chararray,age:int,city:chararray);
employee_tomap = FOREACH employee_details2 GENERATE TOMAP(name,age);
store employee_tomap into '/output_files/employee_tomap'; 
