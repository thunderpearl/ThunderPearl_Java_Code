package searchTxnby2Args;

// jar file is searchlovers1.jar
// input folder is search_lovers
// output folder is search_lovers_output
// input text file is chunk_of_data.txt
import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class mymapper extends Mapper<LongWritable, Text, NullWritable,Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

			String Txn = value.toString();
			String TxnParts[] = Txn.split("[+\\-*/,.\\^ ]+");
			
			String lover1 = context.getConfiguration().get("Arg1");
			String lover2 = context.getConfiguration().get("Arg2");
			
			String bothlovers = "";
			
			// More optimized code is needed and more better way of output is needed
			 // like avatarkatara or avatar-katara
			for(String lovers:TxnParts)
			{
				if(lovers.equals(lover1))
				{
					bothlovers = bothlovers.concat(lovers);
				}
				
				if(lovers.equals(lover2))
				{
					bothlovers = bothlovers.concat(lovers);
				}
			}
			
			Text result_value = new Text(bothlovers);
			

			// This will print the result of both the lovers......
				context.write(null, result_value);	
						
		}
	}


