step1 = load '/input_files/student_names.txt' using PigStorage(',');
step2 = foreach step1 generate $0,$1,$2,$3,$4,$5,$6;
step3 = filter step2 by $1=='ridhi';
dump step3;
