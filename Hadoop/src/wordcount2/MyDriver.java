package wordcount2;
// wordcount2.jar is made out of these programs.
// input file is /input_files/student_names2.txt
// Default Reducer will run in this job....
// If we do not add out MyReducer class and, may or may define number of reducer then 
 // default reducer will run which only sort the key-value pairs of the output of MyMapper
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// The configuration object contains all Hadoop settings necessary
// to launch your app. It's in key-value format and is read from the xml files 
// from /etc/hadoop. You can also use Configuration to change configuration 
// parameters.

public class MyDriver {
	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration(); // Initiating the configuration.
		
		// It allows all the user to configure the job of hadoop, like submit it,
		 // execute it, control it.
		Job job = new Job(conf, "Map Reduce Word Count"); // passing object's reference 
		// in the over all job of map reduce. 
		
		// As we will be creating a jar file of all these, we will be getting .class files in jar
		// hence we are giving .class files down below 
		
		job.setJarByClass(MyDriver.class);  // Tell program which is mydriver class
		job.setMapperClass(MyMapper.class); //	Tell program which is mapper class
		// job.setReducerClass(myreducer.class); // Tell program which is reducer class
		
		job.setMapOutputKeyClass(Text.class); // Output's key of mapper is gonna be a Text(String)
		job.setMapOutputValueClass(IntWritable.class); // Output's value field is gonna be IntWritable(Integer)
	//	job.setNumReduceTasks(4); // Number of reducers are gonna be 4
		// Though we have not given number of Reducers but here default Reducer will run....
		
		FileInputFormat.addInputPath(job, new Path(args[0])); // When passing the command in putty
		// this is gonna be first argument for input file
		
		// and this is gonna be second argument, i.e. for output.
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1); // this method shut down the jvm.
	}

}
//FileInputFormat is the base class for all file-based InputFormats
//This provides a generic implementation of getSplits(JobConf, int), getSplits() give 
//the meta data about the parts of the file.  

//Subclasses of FileInputFormat can also override the isSplitable(FileSystem, Path) 
//method to ensure input-files are not split-up and are processed as a whole by Mappers
