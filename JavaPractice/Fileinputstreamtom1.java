

// FileImputStream for reading the File......

package JavaPractice;

import java.io.*;  
class Fileinputstreamtom1{  
 public static void main(String args[]){  
  try{  
	  /*
	   * The java.io.InputStream.read() method reads the next byte of the data from the 
	   * the input stream and returns int in the range of 0 to 255. If no byte is available 
	   * because the end of the stream has been reached, the returned value is -1.
	   * */
    FileInputStream fin = new FileInputStream("C:\\eclipse practice\\Project4\\src\\JavaPractice\\abc.txt");  
    int i=0;  
    while((i=fin.read())!=-1){  
     System.out.print((char)i + "\t");  
    }  
    fin.close();  
  }
  catch(Exception e)
  {
	  System.out.println(e);}  
  }  
}  
