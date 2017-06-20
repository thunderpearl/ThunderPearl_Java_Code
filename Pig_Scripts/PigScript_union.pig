customers = LOAD '/input_files/customers.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, address:chararray, salary:int);
orders = LOAD '/input_files/orders.txt' USING PigStorage(',')as(oid:int, date:chararray, customer_id:int, amount:int); 
execute_union = UNION customers, orders;
dump execute_union;
store execute_union into '/output_files/union_output';
