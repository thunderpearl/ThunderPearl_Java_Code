package pokemonDifferenceAttackSpecial3;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, IntWritable, Text>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		String lineParts[] = line.split(",");
		
		// By multiplying with -1 we are actually reversing the keys as they will be sorted in 
		 // increasing order in reducer before reduce() and later by multiplying with -1 we will
		  // get output in decreasing order according to keys.
		int special_and_normal_attack_difference = Math.abs((Integer.parseInt(lineParts[8]) - Integer.parseInt(lineParts[6]))) * -1;
		
		String pokemon_name = lineParts[1];
		
		context.write(new IntWritable(special_and_normal_attack_difference), new Text(pokemon_name));
	}

}
