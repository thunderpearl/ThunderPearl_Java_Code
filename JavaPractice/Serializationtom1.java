

// SERIALIZATION..........
// This is the main class 

// Serialization is a mechanism of writing the state of an object into the byte stream.
// It is mainly used to travel object's state on the network.
package JavaPractice;

import java.io.*;  
class Serializationtom1{  
 public static void main(String args[])throws Exception{  
  Serializationjerry1 s1 =new Serializationjerry1(211,"ravi");  
  
  // This file will be created in eclipsepractice folder.
  // This below code is or writing the 
  FileOutputStream fout=new FileOutputStream("iamthefile.txt"); 
  
  // The ObjectOutputStream class is used 
  // to write primitive data types and Java objects to an OutputStream. 
  // Only objects that support the java.io.Serializable interface can be written to streams.
  ObjectOutputStream out = new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  
