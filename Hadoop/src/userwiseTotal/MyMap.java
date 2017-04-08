package userwiseTotal;



//This is MAPPER program for UserwiseTotal

//"usertotal.txt" is the input file for this
import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/*
* This is a simple program as well.
* we will be passing a name(String) as arg[0] in command and 
* it will give sum of all the expenses by that name.
* */

public class MyMap extends Mapper<LongWritable, Text, Text, DoubleWritable>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
			// This is an important line to put it on arg[0].
			String SearchString = context.getConfiguration().get("searchstring");
			String line = value.toString();
			String lineParts[] = line.split(",");
			Text mapkey = new Text(lineParts[2]); // name of the person. 
			
			// lineparts[3], it refers to the Amount.
			DoubleWritable mapout = new DoubleWritable(Double.parseDouble(lineParts[3]));
			
			// Here we are just giving the key and putting sum as it's value
			if(mapkey.toString().equals(SearchString))
			{
			context.write(mapkey,mapout );
			}
		}
	}

