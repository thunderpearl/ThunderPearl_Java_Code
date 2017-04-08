package wordcountwithpartitioner;


/**
 * A partitioner works like a condition in processing an input dataset.
 * The partition phase takes place after the Map phase and before the Reduce phase.
 *
 * Number of partitioner is equal to the number of reducers.
 * */

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

// Partitioning may happen after the shuffling.  
// We got generics set for input only bcoz we are not generating any results here 
// we are just dividing the data.
public class MyPartitioner extends Partitioner<Text, IntWritable> {

		// We are returning something, hence it is int type.	
		public int getPartition(Text key, IntWritable value, int numPartitions) {

			String myKey = key.toString().toLowerCase();

			if (myKey.startsWith("a") ) { // This is the partition of strings
				return 0; // strings which starts with "a" will go to reducer 0
			}
			else if (myKey.startsWith("n")) {
				return 1; // strings which start with "n" will go to reducer 1
			}
			else if (myKey.startsWith("k")) {
				// there is no name in "student_names.txt" file hence part-r-00002 
				 // will be empty.
				return 2;
			}		
			else if (myKey.startsWith("p")) {
				return 3;
			}	
			else if (myKey.startsWith("l")) {
				return 4;
			}
			else {
				return 5;
				
				// we can make a little fool of framework by returning more number 
				 // of times than number of reducers but ultimately keeping the
				  // things in between.
				
			// for example if we have defined 4 reducers in driver class but here in
			 // partitioner class we can return more than 4 times but in that we can 
			  // repeat return many times but keeping last return as "return 3".	
			}
		}

	}

