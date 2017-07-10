package pokemonDifferenceAttackSpecial3;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable; // these are the classes of packages in the jar.
import org.apache.hadoop.io.Text;  
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<IntWritable, Text, Text, IntWritable>{
	public void reduce(IntWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException
	{ 
		// values always need to be Iterable else we will not get the right result. 
		// Reducers are designed in such a way that they will aggregate all the values associated
		 // with same key, even if we got one value for a key.
			for(Text value:values)
			{
				// This is how we convert IntWritable to int....
				int newKey = key.get() * -1;
				context.write(new Text(value), new IntWritable(newKey));
			}
	}
}
