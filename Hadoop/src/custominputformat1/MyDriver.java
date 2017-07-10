// txn file is input file here....
//Here core common loggings jar is also used along with core jar.

/* Understanding flow of this job is like :-
 *
 * "MyDriver.java"
 * MyKey.java
 * MyValue.java
 * MyRecordReader.java
 * Server1Inputformat.java
 * MyMapper.java
 * */

package custominputformat1;
import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;

public class MyDriver {

  public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException
   {

        Job job = new Job();
        job.setJarByClass(MyDriver.class);
        job.setJobName("CustomTest");
        job.setNumReduceTasks(0);
        job.setMapperClass(MyMapper.class);

        // set the "Server1Inputformat" as inputformat class for the Job.

        // Every job in MapReduce must define its inputs according
        // to contracts specified in the InputFormat abstract class.

        // Default input format class is "TextInputFormat" class.
        job.setInputFormatClass(Server1Inputformat.class);
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(Text.class);

        // The Parent Class FileInputFormat provides all of the input split functionality.
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.waitForCompletion(true);
  }
}
