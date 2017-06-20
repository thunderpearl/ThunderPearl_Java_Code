package wordcountWithoutReducer2;
// input file is /input_files/student_names2.txt 
// jar file is wordcount_withoutreducer4.jar
// For MyCombiner to work we have to keep reducer working, either identity reducer(default reducer)
 // or real reducer. We can't make reducer to be zero below because combiners are mini reducers
  // and are equal to number of mappers. Combiners extends to reducer that is why for combiner to
   // work either default reducer or custom reducer(ours) must be there and we can't make reducer 
    // number to be zero for combiner to work....
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
		
	//	job.setNumReduceTasks(0);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
// HashPartition.getPartition() takes the key as argument and returns the index of partition to 
 // which that key belongs to.
// It works as key.hashCode() % Number of Partitions.
