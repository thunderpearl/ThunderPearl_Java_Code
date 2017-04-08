
package wordcountwithpartitioner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// we have created 2 jar files, one as "wordcount_wp.jar" and other is 
 // "wordcount_wp1.jar"
public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Map Reduce Word Count With Partitioner");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMap.class); 	
		job.setReducerClass(MyReducer.class);
		job.setPartitionerClass(MyPartitioner.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);

		// Number of partitioners are gonna be equal to number of reducers.
		 // Previously we put 5 reducers and now we are checking for 6.
		job.setNumReduceTasks(6);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
