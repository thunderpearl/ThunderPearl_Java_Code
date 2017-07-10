package pokemonDifferenceAttackSpecial3;

//Input file is going to be /pokemonPowereRateColumn_output2_2/part-m-00000

// Output file is /pokemonDifferenceAttackSpecial_output1_3/part-r-00000
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

//select NAME,(SP_ATK-ATTACK) as ATK_DIFF from pokemon1 order by ATK_DIFF DESC LIMIT 10;
public class MyDriver {
	public static void main(String[] args) throws Exception
	{
		Configuration conf = new Configuration();
		
		Job job = new Job(conf,"Difference between Special_Attack and Attack");
		
		job.setJarByClass(MyDriver.class);
		job.setMapperClass(MyMapper.class);
		job.setReducerClass(MyReducer.class);
		
		job.setMapOutputKeyClass(IntWritable.class);
		job.setMapOutputValueClass(Text.class);
		job.setNumReduceTasks(1);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}
}
