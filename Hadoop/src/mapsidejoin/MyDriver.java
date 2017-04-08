package mapsidejoin;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class MyDriver {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		
		Job job = new Job(conf, "Map Side Join");
		
		job.setJarByClass(MyDriver.class);	
		
		// If we would not set NumReduceTasks to 0 then default reducer will 
		 // get initiated.
		job.setNumReduceTasks(0);
		job.setMapperClass(MyMapper.class);
		
		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(NullWritable.class);
		
		// FileInputFormat is the base class of file base input
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		try 
		{
			// DistributedCache is a facility provided by the Map-Reduce
			// framework to cache files needed by applications. Once you 
			// cache a file for your job, hadoop framework will make it
			// available on each and every data nodes (in file system, not
			// in memory) where your map/reduce tasks are running.
			
			// That file which stored at Distributed Cache, it is called as Look Up File.
			DistributedCache.addCacheFile(new URI("/custs.dat"),job.getConfiguration());
		} 
		catch (URISyntaxException e) 
		{
			e.printStackTrace();
		}
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}

