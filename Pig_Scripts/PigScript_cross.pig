students = load '/input_files/student_details.txt' using PigStorage(',')as(id:int, firstname:chararray, lastname:chararray, age:int, phone:chararray, city:chararray);
filder_data = filter students by City == 'Pune';
