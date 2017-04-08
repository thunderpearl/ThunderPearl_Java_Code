package monthlysales;

// "txnslarge.dat" is the input file we have used here in this program.
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Map Reduce Monthly Division of Txn Data");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMapper.class); 	
		job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(DoubleWritable.class);
		
		job.setNumReduceTasks(1);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}

