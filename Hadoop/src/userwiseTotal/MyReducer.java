package userwiseTotal;



//This is REDUCER program for UserwiseTotal
//"usertotal.txt" is the input file for this
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text,DoubleWritable,Text,NullWritable> {

	public void reduce(Text key, Iterable<DoubleWritable> values,Context context) throws IOException, InterruptedException {
		
		// We will get many values with same key separately.
		// Now, will add those values.
		Double sum = 0.0;	
		for (DoubleWritable value : values) {
			sum += value.get();
		}
		String Result = "The total for user-id "+key.toString()+" is INR."+sum.toString();
		context.write(new Text(Result), null); 
	}
}

