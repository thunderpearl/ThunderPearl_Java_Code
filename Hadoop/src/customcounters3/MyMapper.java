package customcounters3;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
//import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends
		Mapper<LongWritable, Text, Text, IntWritable> {
	
	enum Temperature{
		MISSING,INVALID
	};
	
	protected void map(LongWritable key, Text value, Context context)throws java.io.IOException, InterruptedException 
	{
		
		String line = value.toString();
		String lineParts[] = line.split("\t");
		
		String dept;
		int sal;
		
		if(lineParts[0].trim().charAt(0) != '1')
		{
			context.getCounter(Temperature.INVALID).increment(1);
		}
		
		else if(lineParts[2].trim().isEmpty() || lineParts[2] == null)
		{
			context.getCounter(Temperature.MISSING).increment(1);
		}
		
		else
		{
			dept = lineParts[0];
			sal = Integer.parseInt(lineParts[2]);
			context.write(new Text(dept), new IntWritable(sal));
		}
	}

}
