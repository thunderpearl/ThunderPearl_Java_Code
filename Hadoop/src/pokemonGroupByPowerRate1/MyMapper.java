package pokemonGroupByPowerRate1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		String[] lineparts = line.split(",");
		
		
	//	String name = new String("1");
		String powerRate = lineparts[11];
		
		context.write(new Text(powerRate), new IntWritable(1));
	}
}
