package wordcountWithoutReducer2;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// This format is fixed. First two arguments are input key-value pair
// And, second two arguments are output key-value pair
public class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			
			// key is generally the offset of data 
			// value is the data record
			String line = value.toString(); // we are converting the data into the String
			String lineParts[] = line.split(","); // we are splitting the value with " "  
			for(String SingleWord : lineParts)
			{
				Text OutKey = new Text(SingleWord);
				IntWritable One = new IntWritable(1);
				context.write(OutKey, One);				
			}
		}
	}

