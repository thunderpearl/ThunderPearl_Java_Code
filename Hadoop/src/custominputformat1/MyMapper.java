package custominputformat1;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<MyKey, MyValue, Text, Text> {
        
	// Main thing to focus is how our custom RecordReader aka MyRecordReader will read 
	 // each line. So, for knowing that check out the code of MyRecordReader....
          protected void map(MyKey key, MyValue value, Context context)
              throws java.io.IOException, InterruptedException {
        	  
           // value is like an object of MyValue and hence getAmt() method
        	   // is working on it	  
           if(value.getAmt()>150)
           {
        	   context.write(new Text(key.getTid()), new Text(value.getUpperCat()));
           }
            		
          }  
}