package custominputformat2;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.LineRecordReader;


public class MyRecordReader extends RecordReader<MyKey,MyValue> {

	private MyKey key;
	private MyValue value;
	private LineRecordReader reader = new LineRecordReader();
	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		reader.close();
	}

	@Override
	public MyKey getCurrentKey() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public MyValue getCurrentValue() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float getProgress() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		return reader.getProgress();
	}

	@Override
	public void initialize(InputSplit is, TaskAttemptContext tac)
			throws IOException, InterruptedException {
		reader.initialize(is, tac);
		
	}

	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//00000000,06-26-2011,4000001,040.33,Exercise & Fitness,Cardio Machine Accessories,Clarksville,Tennessee,credit
		boolean gotNextKeyValue = reader.nextKeyValue();
		if(gotNextKeyValue){
			if(key==null){
				key = new MyKey();
			}
			if(value == null){
				value = new MyValue();
			}
			Text line = reader.getCurrentValue();
			String[] tokens = line.toString().split(",");
			
			key.setTid(new Text(tokens[0]));
			key.setTxndate(new Text(tokens[1]));
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

