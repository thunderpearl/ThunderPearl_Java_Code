package uniqueimages;

// This is the program for finding same images, may be they have different names.
 // But, are actually the same images.
// We will use the concept of sequence files to achieve this as sequence files can combine small 
 // small files to make one file and then we can do our processing.... 
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class MyDriver {

	public static void main(String[] args) throws Exception {

		Configuration conf = new Configuration();	

		Job job = new Job(conf, "map reduce to search duplicate images from sequence files");
		
		job.setJarByClass(MyDriver.class);
		
		job.setNumReduceTasks(1);
		
		job.setMapperClass(MyMapper.class);
		job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		
		// This is for setting the InputFormat which we are taking as SequenceFile in our case here
		// Default InputFormat is actually TextInputFormat....
		job.setInputFormatClass(SequenceFileInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}