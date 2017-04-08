package loganalysis;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyPartitioner extends Partitioner<Text, Text> {

		public int getPartition(Text key, Text value, int numPartitions) {

			String RecordType = key.toString();
			
			// This is a simple java method to check if 2 strings are equal ignoring the case sensitivity.
			if(RecordType.equalsIgnoreCase("error"))
			{
				return 0;
			}
			else if(RecordType.equalsIgnoreCase("info"))
			{
				return 1;
			}
			else if(RecordType.equalsIgnoreCase("fatal"))
			{
				return 2;				
			}
			else if(RecordType.equalsIgnoreCase("debug"))
			{
				return 3;
			}
			else if(RecordType.equalsIgnoreCase("trace"))
			{
				return 4;
			}
			else if(RecordType.equalsIgnoreCase("warn"))
			{
				return 5;
			}			
			else
			{
				return 6;
			}		
		}

	}
