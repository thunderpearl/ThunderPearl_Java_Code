step1 = load '/input_files/student_names.txt' using PigStorage(',') as(name1:chararray,name2:chararray,name3:chararray,name4:chararray,name5:chararray,name6:chararray,name7:chararray);
step2 = foreach step1 count(name2=='ridhi');
dump step3;
