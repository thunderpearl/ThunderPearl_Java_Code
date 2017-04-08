package averageTransaction;



import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class MyPartitioner extends Partitioner<Text, Text> {

		public int getPartition(Text key, Text value, int numPartitions) {
			
			int month = Integer.parseInt(key.toString());
			return month-1;
			
//			switch (month) {
//			case 1:
//				return 0;
//			case 2:
//				return 1;
//			case 3:
//				return 2;
//			case 4:
//				return 3;
//			case 5:
//				return 4;
//			case 6:
//				return 5;
//			case 7:
//				return 6;
//			case 8:
//				return 7;
//			case 9:
//				return 8;
//			case 10:
//				return 9;
//			case 11:
//				return 10;
//			case 12:
//				return 11;
//			default:
//				return 12;
//			}

		}

	}
