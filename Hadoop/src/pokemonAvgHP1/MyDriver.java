package pokemonAvgHP1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// pokemonAvgHP1.jar is the jar file of this job....
public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration(); 

		Job job = new Job(conf, "Average HP of the Pokemons");  
		
		job.setJarByClass(MyDriver.class);  
		job.setMapperClass(MyMapper.class); 
		job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(Text.class); 
		job.setMapOutputValueClass(IntWritable.class);
		job.setNumReduceTasks(1); 
		FileInputFormat.addInputPath(job, new Path(args[0])); 
		
		
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1); 
	}

}
