package searchTxnbyArgs;



//This is the program for searching the text by argument
import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, NullWritable,Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	// 444		4000001,Kristina,Chung,55,Pilot
			// txt_search_arg4.jar is the working file 

			String Txn = value.toString();
			String TxnParts[] = Txn.split(",");
			String Uid = TxnParts[2];
			
			// During command line we will give the arg[0](string to be searched)
			// that string will get compared with every line below. 
			
			// context is an object that allows mapper and reducer to interact with 
			// rest of the hadoop and it 
			// includes configuration data as well.
			String Uid2Search = context.getConfiguration().get("Uid2Search");
			// And this parameter arg[0] passed will be available to mapper 
			// using context.getConfiguration.get("Uid2Seach") 
			
			if(Uid.equals(Uid2Search))
			{
				context.write(null, value);	
			}			
		}
	}

