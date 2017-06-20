customers = LOAD '/input_files/customers.txt' USING PigStorage(',')as(id:int, name:chararray, age:int, address:chararray, salary:int);
orders = LOAD '/input_files/orders.txt' USING PigStorage(',')as(oid:int, date:chararray, customer_id:int, amount:int); 
left_join = JOIN customers BY id LEFT OUTER, orders BY customer_id USING 'replicated';
dump left_join;
