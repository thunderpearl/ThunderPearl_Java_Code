package binary2sequence;

/*
 * Sequence files are used as a container to store the small files. Sequence files are 
 * flat files containing key, value pairs. A very common use case when designing ingestion systems 
 * is to use Sequence files as containers and store any file related metadata(filename, path, 
 * creation time etc) as the key and the file contents as the value.*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMapper extends Mapper<LongWritable, Text, Text, BytesWritable> {

	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		String uri = value.toString();
		
    // To get access to file system we have to use Configuration like below and then 
		// FileSystem.
	// Configuration will load necessary configuration before interacting with 
		// HDFS/map-reduce.
		Configuration conf = new Configuration();
		
		// URI.create(uri) gives the path of linux i.e. /home/hduser, we can omit 
		// first parameter as well and it will still work. Configuration will take care of that.
		FileSystem fs = FileSystem.get(URI.create(uri), conf);
		FSDataInputStream in = null;
		try {
		// open(new Path(uri)) is the method we are applying on Distributed File System object
		// i.e. 'fs' to get the input stream.
			in = fs.open(new Path(uri));
			java.io.ByteArrayOutputStream bout = new ByteArrayOutputStream();
// see the documentation, http://docs.oracle.com/javase/tutorial/essential/io/charstreams.html
			// We are doing setting the size of buffer here i.e. 1024 times the 1024 Bytes.
			// Reading the data into the buffer.
			byte buffer[] = new byte[1024 * 1024];
			
	// The methods returns the next byte of data, or -1 if the end of the file is reached.
		//	Parameters are like this way, 'destination byte array', 'starting point' and 
		//	'number of  bytes to be read'
			while (in.read(buffer, 0, buffer.length) >= 0) {
				bout.write(buffer);
			}
			context.write(value, new BytesWritable(bout.toByteArray()));
		} finally {
			IOUtils.closeStream(in);
		}
	}

}

/*
 * This program will take in an argument which is nothing but the fully qualified HDFS path
 *  to a file which we would read and display the contents of the file on the screen. 
 *  This program will simulate the hadoop fs -cat  command.

Configuration conf = new Configuration();
1
Configuration conf = new Configuration();

The easiest way to get the configuration of the cluster is by instantiating the Configuration 
object and this will read the configuration files from the classpath and read and load all the
information that is needed by the program.

2
//Get the filesystem - HDFS
FileSystem fs = FileSystem.get(URI.create(uri), conf);
FSDataInputStream in = null;

In the next line we will get the FileSystem object using the URL that we passed as the
program input and the configuration that we just created. This will return the 
DistributedFileSystem object and  once we have the file system object the next thing we need
is the input stream to the file that we would like to read.

3
in = fs.open(new Path(uri));
IOUtils.copyBytes(in, System.out, 4096, false);

We can get the input stream by calling the open method on the file system object by 
supplying the HDFS URL of the file we would like to read. Then we will use copyBytes method 
from the Hadoop’s IOUtils class to read the entire file’s contents from the input stream and 
print it on the screen.

 
 * */

// See Below Program for more understanding.

/*
 * package com.tutorialspoint;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
   public static void main(String[] args) throws Exception {
      
      InputStream is = null;
      byte[] buffer=new byte[5];
      char c;
      
      try{
         // new input stream created
         is = new FileInputStream("C://test.txt");
         
         System.out.println("Characters printed:");
         
         // read stream data into buffer
         is.read(buffer, 2, 3);
         
         // for each byte in the buffer
         for(byte b:buffer)
         {
            // convert byte to character
            if(b==0)
               
               // if b is empty
               c='-';
            else
               
               // if b is read
               c=(char)b;
            
            // prints character
            System.out.print(c);
         }
      }catch(Exception e){
         
         // if any I/O error occurs
         e.printStackTrace();
      }finally{
         
         // releases system resources associated with this stream
         if(is!=null)
            is.close();
      }
   }
}
 * */
 