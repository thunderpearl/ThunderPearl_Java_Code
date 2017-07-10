package pokemonDifferenceAttackSpecial2;
// We are just running Mapper and deliberately killing reducer here in this job. Now, We will get 
 // the output according to the way they are read by RecordReader, not in some order.

//Input file is going to be /pokemonPowereRateColumn_output2_2/part-m-00000

// Output file is /pokemonDifferenceAttackSpecial_output1_2/part-m-00000

// jar file is pokemonDifferenceAttackSpecial1_2.jar
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

//select NAME,(SP_ATK-ATTACK) from pokemon1;
public class MyDriver {
	public static void main(String[] args) throws Exception
	{
		Configuration conf = new Configuration();
		
		Job job = new Job(conf,"Difference between Special_Attack and Attack");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMapper.class);
		//job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(IntWritable.class);
		job.setNumReduceTasks(0);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
