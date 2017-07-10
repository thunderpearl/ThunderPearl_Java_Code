package custominputformat4;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<MyKey, MyValue, NullWritable, Text> {
        
	// Main thing to focus is how our custom RecordReader aka MyRecordReader will read 
	 // each line. So, for knowing that check out the code of MyRecordReader....
          protected void map(MyKey key, MyValue value, Context context)
              throws java.io.IOException, InterruptedException {
        	  
           // value is like an object of MyValue and hence getAmt() method
        	   // is working on it	  
           if(value.getAmt()>150)
           {
        	   // In the output of this program we will only get value part because we have 
        	    // taken values only in our custominputformat.
        	   // getUpperCat() method will give category of exercise. See txnslarge.dat file 
        	    // and also see method getUpperCat() .
        	   context.write(null, new Text(value.getUpperCat()));
        	   
        	   // This job is based on "custominputformat3"
        	   // But, There inside mapper we were expecting key which is Text type but inside 
        	    // "MyKey" we have not defined such thing hence inside output of that job we are
        	     // getting empty space in place of key.
        	   
        	   // Here, in this job inside mapper we have made key as null, hence inside output 
        	    // we are getting only value....
           }
            		
          }  
}