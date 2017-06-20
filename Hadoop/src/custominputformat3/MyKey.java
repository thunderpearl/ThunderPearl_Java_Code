package custominputformat3;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

// WritableComparables can be compared to each other, typically via Comparators. Any type which
 // is to be used as a key in the Hadoop Map-Reduce 
  // framework should implement this interface. Also, see the documentation.
public class MyKey implements WritableComparable{
	private Text tid,txndate;
	
	public MyKey(){
		this.tid = new Text();
		this.txndate = new Text();
	}
	public MyKey(Text tid,Text txndate){
		this.tid = tid;
		this.txndate = txndate;		
	}
	
	//deserialization, reading the state of object in byte streams.
	
// The DataInput interface provides for reading bytes from a binary stream and reconstructing
 // from them data in any of the Java primitive types. 
	
	// It is generally true of all the reading routines in this interface that if end of file 
	// is reached before the desired number of bytes has been read, an EOFException (which is a 
	// kind of IOException) is thrown. If any byte cannot be read for any reason other than end 
	// of file, an IOException other than EOFException is thrown. In particular, an IOException 
	// may be thrown if the input stream has been closed.
	public void readFields(DataInput in) throws IOException{
		tid.readFields(in);
		txndate.readFields(in);
	}
	
	
	//serialization, writing the state of the objects in byte streams.
	
	// The DataOutput interface provides for converting data from any of the Java primitive 
	// types to a series of bytes and writing these bytes to a binary stream. There is also 
	// a facility for converting a String into modified UTF-8 format and writing the resulting 
	// series of bytes
	public void write(DataOutput out) throws IOException{
		tid.write(out);
		txndate.write(out);
	}

	// Object is the super class of all the classes.
	public int compareTo(Object o){
		MyKey other = (MyKey)o; // case of down casting.
		
		// That above "other" object will have access to all the instance variables of MyKey class
		// and we will be accessing those as below.
		int cmp = tid.compareTo(other.tid); // This method will give 1,0,-1 based on compare result
		if(cmp != 0){
				return cmp;  // it will return which bigger. 
		}
		return cmp = txndate.compareTo(other.txndate);
	}
	
	// These are the getters and setters.
	public String getTid() {
		return tid.toString();
	}
	public void setTid(Text tid) {
		this.tid = tid;
	}
	public String getTxndate() {
		return txndate.toString();
	}
	public void setTxndate(Text txndate) {
		this.txndate = txndate;
	}
}
