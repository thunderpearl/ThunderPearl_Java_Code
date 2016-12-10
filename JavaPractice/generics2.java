

package JavaPractice;

import java.util.*;  

class generics2
{  
public static void main(String args[]){  
	
	//ArrayList is a class which extends AbstractList and it supports
	// dynamic array which can stretch and 
	// shrink as per needed.
ArrayList<String> list=new ArrayList<String>();  
list.add("rahul");  // adding the string to the list
list.add("jai");  
//list.add(32);//compile time error  
  
String s=list.get(1);//type casting is not required  
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator(); // This iterator will work on the above array 
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
