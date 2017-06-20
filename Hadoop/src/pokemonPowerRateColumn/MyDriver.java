package pokemonPowerRateColumn;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// Our job is to add an column for Power_Rate on the basis of their HP and Avg HP
public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration(); 

		Job job = new Job(conf, "Power Rate Program....");  
		
		job.setJarByClass(MyDriver.class);  
		job.setMapperClass(MyMapper.class); 
	//	job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(NullWritable.class); 
		job.setMapOutputValueClass(Text.class);
		job.setNumReduceTasks(0); 
		FileInputFormat.addInputPath(job, new Path(args[0])); 
		
		
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1); 
	}

}
