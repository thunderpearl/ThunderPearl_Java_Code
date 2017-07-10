package pokemonGroupByPowerRate1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text, IntWritable, IntWritable, Text>{
	public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
	{
		int counter = 0;
		
		for(IntWritable value: values)
		{
			counter+=value.get();
		}
		context.write(new IntWritable(counter), new Text(key));
	}

}
