package wordcountWithoutReducer;
/*
 * For understanding the code see the simple word count program.........
 * */


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {

	public static void main(String[] args) throws Exception {
		
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Map Reduce Word Count With Combiner");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMapper.class); 	
	//	job.setReducerClass(MyReducer.class);
		job.setCombinerClass(MyCombiner.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);

		// As we have made Number of Reducer to be run to be zero, no Combiner will run
		 // because combiner itself extends to Reducer which we just made to be zero.
		// We will get Mapper output only....
		job.setNumReduceTasks(0);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
