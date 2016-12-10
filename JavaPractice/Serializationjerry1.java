

// SERIALIZATION......

// This class is implementing the Serializable interface
// hence telling that this class will be using the Serialization.

// If we do not want some of the members to be serialize
// then "Transient" key word is used for that.

package JavaPractice;

import java.io.Serializable;  // This is a marker Interface.
public class Serializationjerry1 implements Serializable{  
 private int id;  
 private String name;  
 public Serializationjerry1(int id, String name) {  
  this.id = id;  
  this.name = name;  
 }  
}  