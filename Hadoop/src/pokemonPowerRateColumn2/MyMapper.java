package pokemonPowerRateColumn2;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// Input file is Pokemon.csv
// jar file used here is pokemonPowerRateColumn2_2.jar and it's output is in pokemonPowerRateColumn_
 // output2_2
// This job will not have header of csv file in it.
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
		try{
		int HP = Integer.parseInt(lineparts[5]); // converting lineparts[5] into integer.
		
		
		if(key.get()==0)
		{
			String new_row = line + "," + power_rate;
			context.write(null, new Text(new_row));
		}
		
		else
		{
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
		catch(Exception e)
		{
			System.out.println(e+" Occurred");
		}
	}
}
