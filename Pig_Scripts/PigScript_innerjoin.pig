customers = LOAD '/input_files/customers.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, address:chararray, salary:int);
orders = LOAD '/input_files/orders.txt' USING PigStorage(',')as(oid:int, date:chararray, customer_id:int, amount:int); 
execute_join = JOIN customers BY id, orders BY customer_id;
dump execute_join;
store execute_join into '/output_files/inner_join_output';
