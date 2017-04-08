

package custominputformat1;
import java.io.IOException;

import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;

public class Server1Inputformat extends FileInputFormat<MyKey, MyValue> {
	
	@Override
	// InputFormat file must do 3 tasks.
	// Define the type information of map input keys and values.
	// how input should be divided, that is done by "InputSplit arg0"
	// Must indicate the RecordReader instance that should read the data from source.
	
	// Number of Input Splits decides the number of mapper to be run, hence 
	// it is crucial in parallelism.
	public RecordReader<MyKey, MyValue> createRecordReader(InputSplit arg0,
			TaskAttemptContext arg1) throws IOException, InterruptedException {
		
		return new MyRecordReader();
		
		
		
	}	
}

