package JavaPractice;

import java.util.*;

class Annotations_tom2{
	
	// Without below annotation it will through an error
	
@SuppressWarnings("unchecked")

public static void main(String args[])
	{  
		ArrayList list=new ArrayList();  
		list.add("sonoo");  
		list.add("vimal");  
		list.add("ratan");  
		  
		for(Object obj:list)  
		System.out.println(obj);  
  
	}
}  