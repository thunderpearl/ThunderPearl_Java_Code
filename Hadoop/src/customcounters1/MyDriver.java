package customcounters1;

// This is the driver class for this application of "custom counters"
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
// As we all know that in case of input/output methods we need to catch the checked exception, 
  // so we throws those in below line.
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Debugging With Counters");
		
		job.setJarByClass(MyDriver.class);
		
		// We have to declare the number of reducer to be 0 if we do not wanna use reducer else
		 // default reducer will run by Hadoop framework.
		job.setNumReduceTasks(0);
		
		job.setMapperClass(MyMapper.class);
		
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(NullWritable.class);

		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		System.exit(job.waitForCompletion(true) ? 0 : 1);

	}

}
