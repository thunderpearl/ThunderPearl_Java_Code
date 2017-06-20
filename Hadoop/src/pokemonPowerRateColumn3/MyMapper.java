package pokemonPowerRateColumn3;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// Input file is Pokemon.csv
// jar file used here is pokemonPowerRateColumn3_1.jar and it's output is in pokemonPowerRateColumn_
 // output3_1
// This job will include header of csv file as well
public class MyMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String power_rate = "power_rate";
		
		String power_rate_entry;
		String line = value.toString();
		
		String lineparts[] = line.split(",");
		
		// We have to put this under try block else this will give java.lang.NumberFormatException
		// A NumberFormatException is thrown if somehow we are trying to convert string to int, float
		 // double
		
		// NumberFormatException will be thrown because we are converting 6th element of header row
		 // into integer. So, we need to make a better code.
		 // converting lineparts[5] into integer.
		
		
		if(key.get()==0)
		{
			String new_row = line + "," + power_rate;
			context.write(null, new Text(new_row));
		}
		
		else
		{
			int HP = Integer.parseInt(lineparts[5]);
			
			if(HP>=69.25875)
			{
				power_rate_entry = "Powerfull";
				String new_row = line + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
			
			else if(HP<69.25875 && HP>=40.00000)
			{
				power_rate_entry = "Moderate";
				String new_row = line + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
			
			else
			{
				power_rate_entry = "LessPowerful";
				String new_row = line + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
		}
	}
}
