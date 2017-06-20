package averageTransaction2;

import java.io.IOException;
import java.util.HashMap;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text, Text, Text, DoubleWritable> {
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException
	{
		int count = 0;
		Double sum = 0.0;
		
		for(Text value : values)
		{
			String valString = value.toString();
			Double valInt = Double.parseDouble(valString);
			
			sum += valInt;
			count = count + 1;
		}
		
		Double averageAmount = sum/count ;
		
		context.write(key, new DoubleWritable(averageAmount));
	}

}
