package searchavatar;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
// import org.apache.hadoop.mapreduce.Mapper.Context;

public class mymapper extends Mapper<LongWritable, Text, NullWritable, Text>{
	// By default key is offset 
		// and value is data record in mapper.
		
		// This is the Mapper for the SearchTxn
			public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
				
				String Txn = value.toString(); // converting value to String
				String TxnParts[] = Txn.split("[+\\-*/,.\\^ ]+"); // Splitting the Txn with ","
				//Double Amt = Double.parseDouble(TxnParts[3]);
			//	String Uid = TxnParts[2];	
				
				for(String shabd:TxnParts)
				{
					if(shabd.equals("avatar"))
					{
						Text new_value = new Text(shabd);
						context.write(null, new_value);
					}
	// Use only Mapper to find the string from a text file because if we use
		// reducer also it will take extra processing which is not even required.			
				}		
			}

}
