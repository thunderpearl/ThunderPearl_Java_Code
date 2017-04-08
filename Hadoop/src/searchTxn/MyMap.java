package searchTxn;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, NullWritable, Text>{
	
	// By default key is offset 
	// and value is data record in mapper.
	
	// This is the Mapper for the SearchTxn
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			
			String Txn = value.toString(); // converting value to String
			String TxnParts[] = Txn.split(","); // Splitting the Txn with ","
			Double Amt = Double.parseDouble(TxnParts[3]);
			String Uid = TxnParts[2];			
			if(Uid.equals("4000010") && Amt>100)
			{
				context.write(null, value);	// Here, we have just directly printed
				// out the first split string in the answer
				// because we were just doing the search.
			}			
		}
	}
