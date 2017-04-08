package wordcountcombiner;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text,IntWritable,Text,IntWritable> {

	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
		for (IntWritable SngleValue : values) {
			context.write(key, SngleValue); 
			// As most of the work is handled by combiner here
			//reducer just have to collect the values.
			
			// But, specifically in this program we do not want final result 
			// total number of counts, we are just printing 
			//what is coming into the reducer.
			
			// This may seems that for loop will have to handle more than one entity
			 // but actually it has to do or say act on one entry only......
			  // and reducer will run that for loop on every line just for one entry each.
			
		}
	}
}

