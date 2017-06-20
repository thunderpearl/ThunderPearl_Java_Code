package pokemonAvgHP1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		String lineparts[] = line.split(",");
		
		// As in mapper by default offset values are keys and whole line is value, first offset is
		 // always gonna be 0 for which we are testing below.
		if(key.get()==0)
		{
			context.write(new Text("Average Value is"), new IntWritable(0));
		}
		else
		{
			context.write(new Text("Average Value is"), new IntWritable(Integer.parseInt(lineparts[5])));
		}
	}
}
