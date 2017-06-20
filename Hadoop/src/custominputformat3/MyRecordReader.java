package custominputformat3;

//Check out this
// https://hadoop.apache.org/docs/r2.4.1/api/org/apache/hadoop/mapreduce/RecordReader.html
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;

//As we are extending to RecordReader class and overriding it's methods, so read the 
// documentation of RecordReader class also....
public class MyRecordReader extends RecordReader<MyKey,MyValue> {

// MyKey and MyValue in this program, MyKey and MyValue are just data types which are
	// name for convenience only. 
	private MyKey key;
	private MyValue value;
	
	// Read the documentation of LineRecordReader class, there all these below methods
	 // are define. So, reading those will make things easy to understand.... 
	
	// LineRecordReader class treats key as offset and value as line.
	private LineRecordReader reader = new LineRecordReader();
	
	@Override
	public void close() throws IOException {
		// Close the InputSplit to the future operations.
		reader.close();
	}

	@Override
	public MyKey getCurrentKey() throws IOException, InterruptedException {
		// Returns the current position...
		 // Returns the current key or null if there is no current key
		return key;
	}

	@Override
	public MyValue getCurrentValue() throws IOException, InterruptedException {
		// Returns the object that was read
		// This method will return the whole line as value bcoz that is the default 
		 // function of real RecordReader to take offset as key and to take whole line
		  // as value.
		// We will make key and value by diving the value as per our convenience 
		 // as below ....
		return value;
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		// Returns the value  between 0.0 and 1.0 depending on the progress done.... 
		return reader.getProgress();
	}

	@Override
	public void initialize(InputSplit is, TaskAttemptContext tac)
			throws IOException, InterruptedException {
		
		reader.initialize(is, tac);
		
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		// Read the next key-value pair
		
		  // Returns TRUE if a key-value pair was read......
		
	    //00000000,06-26-2011,4000001,040.33,Exercise & Fitness, Cardio Machine Accessories,Clarksville,Tennessee,credit
		boolean gotNextKeyValue = reader.nextKeyValue();

	if(gotNextKeyValue)
	{
			if(key == null){
				key = new MyKey();
			}
			
			// Remember the concept of classes, member variables and objects here.
			// It will help in understanding below code and do not get confused by naming
			 // of the reference variables.
			if(value == null){
				value = new MyValue();
			}
			Text line = reader.getCurrentValue();
			String[] tokens = line.toString().split(",");
			
			value.setTid(new Text(tokens[0]));
			value.setTxndate(new Text(tokens[1]));
			value.setUid(new Text(tokens[2]));
			value.setAmt(new Text(tokens[3]));
			value.setCat(new Text(tokens[4]));
	}
	else
	{
		key = null;
		value = null;
	}
	return gotNextKeyValue;
	
	}

}

