package sorting;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

//  It simply starts a new reduce task, when the next key in the sorted input data is 
// different than the previous, to put it simply.

public class MyReducer extends Reducer<DoubleWritable,Text,NullWritable,Text> {

	public void reduce(DoubleWritable key, Iterable<Text> values,Context context) throws IOException, InterruptedException {
		for (Text value : values) {
			context.write(null, value);
		}
	}
}

