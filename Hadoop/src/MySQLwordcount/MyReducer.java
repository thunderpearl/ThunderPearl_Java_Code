package MySQLwordcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable; // these are the classes of packages in the jar.
import org.apache.hadoop.io.Text;  
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text,IntWritable,Text,IntWritable> 
// <> whatever is inside these is generic for type safety.

{

	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
		int sum = 0;
		
		// Swapping has already happen before that so one set have same type of 
		// keys
		
		// Each time a new key is found, reducer will run and below for loop
		// will run for for each key. 
		for (IntWritable value : values) {
			sum += value.get();
		}
		String mykey = key.toString().toUpperCase();
		
		context.write(new Text(mykey), new IntWritable(sum)); 
	}
}

