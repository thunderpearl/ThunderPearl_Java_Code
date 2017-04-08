package reducesidejoin;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TxnMapper extends Mapper<LongWritable, Text, Text, Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			
			String Record = value.toString();
			String RecordParts[] = Record.split(",");
			String Uid = "Uid:"+RecordParts[2];
			String Amt = "Amt:"+RecordParts[3];
			Text OutPutKey = new Text(Uid);
			Text OutPutValue = new Text(Amt);
			context.write(OutPutKey,OutPutValue);
		}
	}
