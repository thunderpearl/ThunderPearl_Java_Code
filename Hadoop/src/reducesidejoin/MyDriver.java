package reducesidejoin;

//TESTING
//when we ran this with a jar file "reduce-sidejoin-without-red1.jar" part-r-00000
// and part-r-00001 are empty.
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Reduce Side Join");
		
		job.setJarByClass(MyDriver.class);
		job.setReducerClass(MyJoinReducer.class); // This is same as any other reducer
		                                           // just name is different....
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		
		job.setNumReduceTasks(1);		
		
// This class supports MapReduce jobs that have multiple input paths with a different
	// InputFormat and Mapper for each path, but in our case both the files are 
	  // text base files.
		
		// TextInputFormat reads the lines of text files and provides offset as keys
		 // and actual line as values.
		MultipleInputs.addInputPath(job, new Path(args[0]),TextInputFormat.class, CustMapper.class);
		MultipleInputs.addInputPath(job, new Path(args[1]),TextInputFormat.class, TxnMapper.class);		
		
		FileOutputFormat.setOutputPath(job, new Path(args[2]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
	}


