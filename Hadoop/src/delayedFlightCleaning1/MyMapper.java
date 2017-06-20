package delayedFlightCleaning1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MyMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		Text Result = new Text();
		
		String line = value.toString();
		String lineparts[] = line.split(",");
		
		if(lineparts[0]!=null || !(lineparts[0].isEmpty()))
		{
			if((lineparts[1]!=null || !(lineparts[1].isEmpty())) && (lineparts[2]!=null || !(lineparts[2].isEmpty())) && (lineparts[10]!=null || !(lineparts[10].isEmpty())) && (lineparts[17]!=null || !(lineparts[17].isEmpty())) && (lineparts[18]!=null || !(lineparts[18].isEmpty())) && (lineparts[22]!=null || !(lineparts[22].isEmpty())) && (lineparts[23]!=null || !(lineparts[23].isEmpty())) && (lineparts[24]!=null || !(lineparts[24].isEmpty())))
			{
				Result.set(lineparts[1]+" "+lineparts[2]+" "+lineparts[10]+" "+ lineparts[17]+" "+lineparts[18]+" "+lineparts[22]+" "+lineparts[23]+" "+lineparts[24]);
				context.write(null, Result);
			}
		}
	}
}
