package wordcountWithoutReducer2;
// input file is /input_files/student_names2.txt

// jar file created is wordcount_withoutreducer4.jar
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

//"Combiner" will extends to "Reducer"
public class MyCombiner extends Reducer<Text,IntWritable,Text,IntWritable> {

	private IntWritable result = new IntWritable();

	public void reduce(Text key, Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
		int sum = 0;
		for (IntWritable value : values) {
			sum += value.get();
		}
		result.set(sum);
		context.write(key, result); 
	}
}

