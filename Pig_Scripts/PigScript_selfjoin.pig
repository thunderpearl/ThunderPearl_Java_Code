customers1 = LOAD '/input_files/customers.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, address:chararray, salary:int);
customers2 = LOAD '/input_files/customers.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, address:chararray, salary:int); 
execute_join = JOIN customers1 BY id, customers2 BY id;
dump execute_join;
store execute_join into '/output_files/self_join_output';
