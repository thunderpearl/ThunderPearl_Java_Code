package averageTransaction2;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, Text, Text> {
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String data = value.toString();
		
		String dataArray[] = data.split(",");
		
		String ID = dataArray[2];
		// Double amount = Double.parseDouble(dataArray[3]);
		
		Text myKey = new Text(ID);
		Text myValue = new Text(dataArray[3]);
		
		context.write(myKey, myValue);
	}
}
