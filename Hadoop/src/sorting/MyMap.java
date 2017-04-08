package sorting;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, DoubleWritable, Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			
			// "key" is an offset and value is whole line.
			// hadoop will iterate automatically through each line.
			
			String line = value.toString();
			String lineParts[] = line.split(",");
			DoubleWritable SortingKey = new DoubleWritable(Double.parseDouble(lineParts[3]));
			context.write(SortingKey,value);
			
			// Now, key is an Double sorta thing and value is whole line.
		}
	}

