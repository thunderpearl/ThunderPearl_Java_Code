package reducesidejoin;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

// Reduce-side joins are easy to implement as they are less stringent than map-side join.

// But they are less efficient than map-side as data set have to go through 
// sorting and shuffling phase. 

/*
 * Here, map side processing emits join key and corresponding tuples of both the tables. 
 * As an effect of this processing, all the tuples with same join key fall into the 
 * same reducer which then joins the records with same join key.
 * */

public class MyJoinReducer extends Reducer<Text, Text, Text, NullWritable> {
	
	public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
		
		String CustName = "";
		double CustTotal = 0.0;
		int TxnCount = 0;		
		for (Text SingleVal : values) {
			String ValueParts[] = SingleVal.toString().split(":");
			if (ValueParts[0].equals("Amt")) {
				TxnCount++;
				CustTotal += Double.parseDouble(ValueParts[1]);
			} 
			else if (ValueParts[0].equals("Name")) {
				CustName = ValueParts[1];
			}
		}
		String OutputString = CustName+" did a total of "+TxnCount+" transaction with total spendings of INR."+CustTotal;
		context.write(new Text(OutputString), null);
	}
}
