package delayedFlightCleaning2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// DelayedFlightsCleansing4.jar is the jar file of this job....
public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration(); 

		Job job = new Job(conf, "Delayed FLights Cleansing");  
		
		job.setJarByClass(MyDriver.class);  
		job.setMapperClass(MyMapper.class); 
		
		job.setMapOutputKeyClass(NullWritable.class); 
		job.setMapOutputValueClass(Text.class);
		job.setNumReduceTasks(1); 
		FileInputFormat.addInputPath(job, new Path(args[0])); 
		
		
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1); 
	}

}
