package aviationDataAnalysis1;

import java.io.IOException;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, Text, Text> {
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		String lineParts[] = line.split(",");
		
		String Year = lineParts[1];
		String Flight_Num = lineParts[10];
		String Origin = lineParts[17];
		String Dest = lineParts[18];
		
		// We can put more conditions as well
		// If want to have full row in which nothing is null then we can just use more conditions 
		 // using OR(||) operator.
		if(Dest!=null)
		{
			Text myKey = new Text(Dest);
			
			String myValue = "The Year is : "+Year+" || Flight No. : "+Flight_Num+" || Destination : "+Dest+" || Origin "+Origin;
			// Text myValue = new Text();
			context.write(myKey, new Text(myValue));
		}
	}
}
