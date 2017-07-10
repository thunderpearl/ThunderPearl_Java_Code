package pokemonDifferenceAttackSpecial2;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text,Text,IntWritable>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		String lineParts[] = line.split(",");
		
		int special_and_normal_attack_difference = Integer.parseInt(lineParts[8]) - Integer.parseInt(lineParts[6]);
		
		String pokemon_name = lineParts[1];
		
		context.write(new Text(pokemon_name), new IntWritable(special_and_normal_attack_difference));
	}

}
