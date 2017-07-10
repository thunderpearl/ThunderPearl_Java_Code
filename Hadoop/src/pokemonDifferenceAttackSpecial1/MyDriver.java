package pokemonDifferenceAttackSpecial1;

// We are running Default Reducer here, hence shuffling will happen and output will come in 
 // ascending order according to keys.

// Input file is going to be /pokemonPowereRateColumn_output2_2/part-m-00000

// jar file is pokemonDifferenceAttackSpecial1_1.jar
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

// select NAME,(SP_ATK-ATTACK) from pokemon1;
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
		job.setNumReduceTasks(1);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
