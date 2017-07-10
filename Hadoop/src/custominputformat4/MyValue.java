package custominputformat4;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;


public class MyValue implements WritableComparable{
	private Text Tid,Txndate,uid,amt,cat;
	
	public MyValue(){
		this.Tid = new Text();
		this.Txndate = new Text();
		this.uid = new Text();
		this.amt = new Text();
		this.cat = new Text();
	}
	public MyValue(Text value1, Text value2, Text value3, Text value4, Text value5){
		this.Tid = value1;
		this.Txndate = value2;
		this.uid = value3;
		this.amt = value4;
		this.cat = value5;
	}
	public void readFields(DataInput in) throws IOException{
		Tid.readFields(in);
		Txndate.readFields(in);
		uid.readFields(in);
		amt.readFields(in);
		cat.readFields(in);
	}
	
	public void write(DataOutput out) throws IOException{
		Tid.write(out);
		Txndate.write(out);
		uid.write(out);
		amt.write(out);
		cat.write(out);
	}
	public int compareTo(Object o){
		MyValue other = (MyValue)o;
		int cmp = amt.compareTo(other.amt);
		if(cmp != 0){
				return cmp;
		}
		return cat.compareTo(other.cat);
		
	}
	
	public String getUpperCat() {
		return cat.toString().toUpperCase();
	}
	
	// My own custom InputFormat for making a whole line as value. 
	public Text getTid()
	{
		return Tid;
	}
	
	public void setTid(Text Tid)
	{
		this.Tid = Tid;
	}
	
	public Text getTxndate()
	{
		return Txndate;
	}
	
	public void setTxndate(Text Txndate)
	{
		this.Txndate = Txndate;
	}
	
	public Text getUid() {
		return uid;
	}
	public void setUid(Text uid) {
		this.uid = uid;
	}
	public Double getAmt() {
		return Double.parseDouble(amt.toString());
	}
	public void setAmt(Text amt) {
		this.amt = amt;
	}
	public String getCat() {
		return cat.toString();
	}
	public void setCat(Text cat) {
		this.cat = cat;
	}
	
	public Double get10xAmt() {
		return Double.parseDouble(amt.toString())*10;
	}

}

