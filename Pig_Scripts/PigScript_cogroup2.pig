student_details = LOAD '/input_files/student_details.txt' USING PigStorage(',')as(id:int, firstname:chararray, lastname:chararray, age:int, phone:chararray, city:chararray); 
employee_details = LOAD '/input_files/employee_details.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, city:chararray);
cogroup_data = COGROUP student_details by age, employee_details by id;
dump cogroup_data;
store cogroup_data into '/output_files/student_employee_cogroup2';

