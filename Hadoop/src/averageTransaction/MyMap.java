package averageTransaction;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MyMap extends Mapper<LongWritable,Text,IntWritable,Text>{
	
	public void map(LongWritable Key, Text Value, Context context) throws IOException, InterruptedException
	{
		//444    00000016,05-28-2011,4000010,035.56,Exercise & Fitness,Free Weight Bars,Columbia,South Carolina,credit
	
		
		String line = Value.toString();
		String lineParts[] = line.split(",");
		String uid = lineParts[2];
		String amt = lineParts[3];
		String outputvalue = uid+","+amt;
		Text mapoutputvalue = new Text(outputvalue);

			context.write(new IntWritable(1),mapoutputvalue);
}
}
