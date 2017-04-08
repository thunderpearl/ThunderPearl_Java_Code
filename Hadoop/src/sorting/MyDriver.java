package sorting;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
	public static void main(String[] args) throws Exception {
		
		// initialize the configuration of all hadoop system. 
		Configuration conf = new Configuration();
		
		// initialize Job object and give user all the ability to use object to set 
		 // mapper, reducer, driver etc.
		Job job = new Job(conf, "Map Reduce Sort Txn");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMap.class);
		job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(DoubleWritable.class);
		job.setMapOutputValueClass(Text.class);
	
		// setting the number of reducer....
		job.setNumReduceTasks(1);
		
		// first input path at command line.
		FileInputFormat.addInputPath(job, new Path(args[0]));
		// second input path at command line.
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
