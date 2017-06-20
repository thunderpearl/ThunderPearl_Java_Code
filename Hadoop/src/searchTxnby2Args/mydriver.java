package searchTxnby2Args;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class mydriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		// We are adding our input argument like this.
		conf.set("Arg1", args[0]); // 
		conf.set("Arg2", args[1]);
		
		Job job = new Job(conf, "Map Reduce Search Txn by Arg");
		job.setJarByClass(mydriver.class);
		job.setMapperClass(mymapper.class);
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class);
		job.setNumReduceTasks(0);
		FileInputFormat.addInputPath(job, new Path(args[2]));
		FileOutputFormat.setOutputPath(job, new Path(args[3]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}

