package pokemonPowerRateColumn;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class MyMapper extends Mapper<LongWritable, Text, NullWritable, Text>{
	public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException
	{
		String power_rate = "power_rate";
		
		String power_rate_entry;
		String line = value.toString();
		
		String lineparts[] = line.split(",");
		int HP = Integer.parseInt(lineparts[5]); // converting lineparts[5] into integer.
		
		if(key.get()==0)
		{
			String new_row = value + "," + power_rate;
			context.write(null, new Text(new_row));
		}
		
		else
		{
			if(HP>=69.25875)
			{
				power_rate_entry = "Powerfull";
				String new_row = value + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
			
			else if(HP<69.25875 && HP>=40.00000)
			{
				power_rate_entry = "Moderate";
				String new_row = value + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
			
			else
			{
				power_rate_entry = "LessPowerful";
				String new_row = value + "," + power_rate_entry;
				context.write(null, new Text(new_row));
			}
		}
	}
}
