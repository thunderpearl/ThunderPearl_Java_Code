package searchTxnbyArgs;


//txnsmall is the data file used.
//This is the program for searching the text by argument

//txt_search_arg4.jar is the working file 
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		// We are adding our input argument like this.
		conf.set("Uid2Search", args[0]); // We are giving arg[0] place for string to 
		// be searched in command. And this parameter passed will be available to 
		// mapper using context.getConfiguration.get("Uid2Seach") 
        // will be available to reducer also using context.
		
		Job job = new Job(conf, "Map Reduce Search Txn by Arg");
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMap.class);
		job.setMapOutputKeyClass(NullWritable.class);
		job.setMapOutputValueClass(Text.class);
		job.setNumReduceTasks(0);
		FileInputFormat.addInputPath(job, new Path(args[1]));
		FileOutputFormat.setOutputPath(job, new Path(args[2]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
