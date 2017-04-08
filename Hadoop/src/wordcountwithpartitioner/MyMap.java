package wordcountwithpartitioner;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, Text, IntWritable>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			
			// If we give the wrong delimiter for the split then,
			// words will not fall into the right partition.
			
			// The first line it will encounter regarding the specified alphabet 
			  // will be taken as whole
			// and count of all will be calculated and put into that partitioner.
			
			/**
		* key will be a hashcode created by program and value will be a complete line.
			 * */
			
			/**This for loop is for all the words in a single line
			 * This for loop will run automatically run for each line*/
			String line = value.toString();
			String lineParts[] = line.split(",");
			for(String SingleWord : lineParts)
			{
				Text OutKey = new Text(SingleWord);
				IntWritable One = new IntWritable(1);
				context.write(OutKey, One);				
			}
		}
	}
