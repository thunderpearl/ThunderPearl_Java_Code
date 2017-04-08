package sequence2binary;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.NullOutputFormat;

public class MyDriver {

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();	

		Job job = new Job(conf, "map reduce to convert values from sequence files to binary files");
		
		job.setJarByClass(MyDriver.class);
		
		job.setNumReduceTasks(0);
		job.setMapperClass(MyMapper.class);
		
		job.setOutputKeyClass(NullWritable.class);
		job.setOutputValueClass(NullWritable.class);
		
		job.setInputFormatClass(SequenceFileInputFormat.class);
		job.setOutputFormatClass(NullOutputFormat.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}