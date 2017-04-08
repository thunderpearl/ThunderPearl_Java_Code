package loganalysis;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, Text, Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			String Record = value.toString();
			String RecordParts[] = Record.split(" ");
			
			// substring method will take out the substring from a string.
			// It takes 2 parameters, beginindex(inclusive) and endindex(exclusive).
			String RecordType = RecordParts[3].substring(1, RecordParts[3].length()-1);
			Text OutPutKey = new Text(RecordType);
			
			// context.write(OutPutKey,value);
			// We could have used direct value instead of below line
			Text OutPutValue = value;
			context.write(OutPutKey,OutPutValue);
		}
	}

