// We are creating custom_counter4.jar with this application.......

package customcounters4;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class CustomDriver {

	public static void main(String arg[]) throws IOException, ClassNotFoundException, InterruptedException
	{
		Configuration conf = new Configuration();
		Job job = new Job(conf,"MR-Counter");
		
		job.setJarByClass(CustomDriver.class);
		
		FileInputFormat.addInputPath(job,new Path(arg[0]));
		FileOutputFormat.setOutputPath(job,new Path(arg[1]));
		
		job.setMapperClass(CustomMapper.class);
		job.setReducerClass(CustomReducer.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		System.exit(job.waitForCompletion(true)?0:1);
	}
}
