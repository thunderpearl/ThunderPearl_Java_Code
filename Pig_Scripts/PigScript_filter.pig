students = load '/input_files/student_details.txt' using PigStorage(',')as(id:int, firstname:chararray, lastname:chararray, age:int, phone:chararray, city:chararray);
filter_data = filter students by city == 'Pune';
dump filter_data;
store filter_data into '/output_files/filter_output';
