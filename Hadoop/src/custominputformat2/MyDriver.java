
// At HDFS we are using /custominputformat/txnslarge.dat
// output folder is gonna be /custominputformat_output2

// And, conclusion is that, yes we need to create custominputformat as well because
 // there we will be using MyKey and MyValue ....

// Same way, custom RecordReader will also be required..... aka MyRecordReader
package custominputformat2;

// This is the application we are trying without the custominputformat
 // We wanna check whether after craeting custom key and value, do we need to make
  // custominputformat as well?
import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;

public class MyDriver {

  public static void main(String[] args) 
                  throws IOException, ClassNotFoundException, InterruptedException {
        
    Job job = new Job();
    job.setJarByClass(MyDriver.class);
    job.setJobName("CustomTest");
    job.setNumReduceTasks(0);
    job.setMapperClass(MyMapper.class);
    
    // set the "Server1Inputformat" as inputformat class for the Job.
    
    // Every job in MapReduce must define its inputs according
    // to contracts specified in the InputFormat abstract class.
  //  job.setInputFormatClass(Server1Inputformat.class);
    job.setMapOutputKeyClass(Text.class);
    job.setMapOutputValueClass(Text.class); 
    
    // The Parent Class FileInputFormat provides all of the input split functionality.
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    
    job.waitForCompletion(true);
  }
}