package pokemonAvgHP1;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;


public class MyReducer extends Reducer<Text,IntWritable,Text,DoubleWritable> {
	
	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
		int sum = 0;
		int counter = 0;
		
		for(IntWritable value: values)
		{
			sum = sum + value.get();
			counter++;
		}
		
		double average_HP = (double)sum/counter;
		
		DoubleWritable AVG = new DoubleWritable(average_HP);
		
		
		context.write(key, AVG);
	}
}

