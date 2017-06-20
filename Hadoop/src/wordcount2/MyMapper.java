package wordcount2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// This is the format of input(key as LongWritable and value as Text) and 
// output(key as Text and value as IntWritable)
public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
			//  key is gonna be an offset value only.
			String line = value.toString(); // create the string representation of the objects.
			String lineParts[] = line.split("[+\\-*/,.\\^ ]+"); // splits the text file with the space
	    //  String lineParts[] = line.split(" ");
			for(String SingleWord : lineParts) // enhanced for loop
			{
				// Here we store the word in text(string) format 
				Text OutKey = new Text(SingleWord); // Text is string format in
				
				// Here we give value as 1 for every retrieved text.
				IntWritable One = new IntWritable(1); // IntWritable is integer format in hadoop
				context.write(OutKey, One);	// Here we have output the text	and assign the value 1.		
				// context is an object used to communicate with the mapreduce systems.
		  	  	// It unifies the role of JobConf, 
		  	  	// OutputCollector, and Reporter from old API.
			}
		}
	}
