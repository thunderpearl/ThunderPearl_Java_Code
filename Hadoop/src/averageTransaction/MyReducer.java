package averageTransaction;

import java.io.IOException;
import java.util.HashMap;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class MyReducer extends Reducer<IntWritable,Text,Text,DoubleWritable>{
	
	public void reduce(DoubleWritable key, Iterable<Text> values, Context context ) throws IOException, InterruptedException
	{
				double sum = 0.0;
				HashMap uid = new HashMap(); 
				for(Text SingleValue : values)
				{
					String record = SingleValue.toString();
					String recordparts[] = record.split(",");					
					uid.put(recordparts[0], "");
					sum = sum + Double.parseDouble(recordparts[1]);	
				}
				
				int usercount = uid.size();
				double avgtransaction = sum/usercount;
				
				context.write(new Text("Average transaction value is "), new DoubleWritable(avgtransaction));
	}

}
