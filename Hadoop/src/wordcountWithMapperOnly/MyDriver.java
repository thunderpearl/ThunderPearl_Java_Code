package wordcountWithMapperOnly;

// For wordcount_withmapperonly1.jar input file for this program is
 // /input_files/student_names.txt on hdfs...
// For wordcount_withmapperonly2.jar input file is /input_files/student_names2.txt on hdfs 
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
	//	job.setCombinerClass(MyCombiner.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		
		job.setNumReduceTasks(0);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
