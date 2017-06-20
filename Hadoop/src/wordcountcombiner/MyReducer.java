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
			
/** One combiner will work on output of one mapper and act like a mini reducer. Here, file is 
 * not that much big hence we are not doing anything in reducer but, in case of big files where 
 * there will be more than one mappers we will have same number of combiners. And, both combiners
 * after doing their mini reduction part will still have same key in both the combiners and can
 * have different values for those keys. Then, in reducer phase we will have to aggregate both
 * the keys and write the aggregation code inside reducer as well.... 
			  
	*/		
		}
	}
}

