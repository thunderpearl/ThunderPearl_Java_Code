package excelfilehandling;

//poi-3.9.jar has to be added in the path for this program to work.
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.SequenceFileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
	
	public static void main(String[] args) throws Exception {
	
    // we need to add poi jar in {Hadoop home}/share/hadoop/common/lib directory
	Configuration conf = new Configuration();
	
	Job job = new Job(conf, "Handling MS-Excel Files in Map Reduce");    
	
	job.setJarByClass(MyDriver.class);
    job.setMapperClass(MyMapper.class);
    
    job.setInputFormatClass(SequenceFileInputFormat.class);    
    
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(Text.class);
    
    job.setNumReduceTasks(0);
    
    FileInputFormat.addInputPath(job, new Path(args[0]));
	FileOutputFormat.setOutputPath(job, new Path(args[1]));
	
	System.exit(job.waitForCompletion(true) ? 0 : 1);
    } 

}
