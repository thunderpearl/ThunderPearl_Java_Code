package sequence2binary;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

// See core-site.xml file for the configuration.....
// There we have all the information and also the key-value that is fs.defaultFS and
 // hdfs://192.168.56.123:8020
public class MyMapper extends Mapper<Text, BytesWritable, NullWritable, NullWritable> {

	public void map(Text key, BytesWritable value, Context context) throws IOException, InterruptedException {

		// This will also work
	//	Configuration conf = new Configuration();
	//	FileSystem hdfs = FileSystem.get(conf);
		
		// FileSystem needs only one configuration key to successfully connect to HDFS.
		 // and that key is fs.defaultFS
		
		// so all the data will be taken from configurations, that is why we are 
		  // passing "new Configuration()"   
		
		// We can over write the value as well by set() method.
		// FileSystem is an abstract class for fairly generic filesystem.
		FileSystem hdfs = FileSystem.get(new Configuration());

		// names a file or directory in the FileSystem.
		Path newFilePath = new Path("/seq2bin_output3" + key);

		hdfs.createNewFile(newFilePath);

		// Utility that wraps a OutputStream in a DataOutputStream,
		 // buffers output through a BufferedOutputStream and creates a checksum file.
		FSDataOutputStream fsOutStream = hdfs.create(newFilePath);

		fsOutStream.write(value.getBytes());

		fsOutStream.close();
		
		/**
		 * Creating new files on HDFS using hadoop-hdfs classes is quite simple.
		 *  You have to call FileSystem#getFileSystem with proper configuration 
		 *  object to create an instance of DistributedFileSystem. Then call its
		 *   #create method to get FSDataOutputStream instance and use it to write
		 *    down your data.*/
	}
}
