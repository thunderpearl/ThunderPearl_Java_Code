package mapsidejoin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.filecache.DistributedCache;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable,Text, Text, NullWritable> {
    
	//  HashMap is the part of collections in java and is used to store as temparary 
	// cache for either request scope or session scope.
	
	// HashMap maintains the key,value pairs, HashMap implements Map Interface.
	// HashMap methods allow null keys and values.
	// It do not return the keys and values in the order they have been inserted.
	// HashMap extends to Map class.
	private Map<String, String> CustDetails = new HashMap<String, String>();
	// It means it's keys,values values are gonna be Strings.
	
	protected void setup(Context context) throws java.io.IOException, InterruptedException{
		
		// getConfiguration() method is used to gather global configuration data
		// of object used in hadoop.
		// context is an object used to interact with mapreduce systems.	
		
		// Accessing the Distributed Cache like as below.
		Path[] files = DistributedCache.getLocalCacheFiles(context.getConfiguration());		
		
		// This loop is for accessing all the Distributed Cache Files though we have only one available
		// but, still we made a generalized one.
		for (Path SinglePath : files) {
			if (SinglePath.getName().equals("custs.dat")) // custs.dat is our look up file
			{
				// reading the custs.dat file
				BufferedReader reader = new BufferedReader(new FileReader(SinglePath.toString()));
				String line = reader.readLine();
				while(line != null) 
				{
					// splitting the first line inside custs.dat file
					String[] lineParts = line.split(",");
					String CustUid = lineParts[0];
					String CustName = lineParts[1]+" "+lineParts[2];
					CustDetails.put(CustUid, CustName); // CustDetails is a (key,value) view provided by HashMap.
					line = reader.readLine(); // it is like counter++
				}
				reader.close();
			}
		}
		if (CustDetails.isEmpty()) 
		{
			throw new IOException("Unable To Load Customer Data.");
		}
	}
	
	// Here, input file can be anything but should have intersection with look up file 
	// else, results will be null.
    protected void map(LongWritable key, Text value, Context context) throws java.io.IOException, InterruptedException 
    {    	   	
    	String Record = value.toString();
		String RecordParts[] = Record.split(",");
		
		// we are using txnlarge.dat or txnsmall.dat file's reference here
		String Uid = RecordParts[2];
		String Amt = RecordParts[3];
		
		// This shall give those results which have matching UId
		// We are passing a key in get() method below and it will return the value of
		 // that point.....
		String Name =  CustDetails.get(RecordParts[2]); // This will give the value part of Hash "CustDetails"
		
		Text OutPutUid = new Text("Uid:"+Uid);
		Text OutPutAmt = new Text("Amt:"+Amt);
		Text OutPutName = new Text("Name:"+Name);
		
		Text OutPutKey = new Text("{"+OutPutName+";"+OutPutUid+";"+OutPutAmt+";}");
  	  	context.write(OutPutKey,null);
  	  	// context is an object used to communicate with the mapreduce systems.
  	  	// It unifies the role of JobConf, 
  	  	// OutputCollector, and Reporter from old API.
  	  	
  	  	// This program is been executed perfectly.
  	  	
  	  	/** We are not gonna get any empty output because all the records in both the
  	  	 * files are matching. There is no record in the file which is not matching....
  	  	 *  */
    }  
}


