package JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// This is the helper class which have method to be used by main class.

public class Count_String_Test2_helper {
	
	// List Collection which will be holding all 4 arrays.
	// Applying generic as well
	private static List<String> al = new ArrayList<String>(); 
	
	// Empty constructor
	public Count_String_Test2_helper()
	{
		
	}
	
	// This Constructor will be called every time an object an object of this class will be created
	// in the main class. So, this constructor will be called 4 times and all 4 arrays will get 
	// added into "List" object "al". 
	public Count_String_Test2_helper(String[] arr)
	{	
		Collections.addAll(al, arr);
	}
	
	// This method will be called in the main class. 
	public void num_of_times()
	   {
			// HashMap collections is used for getting count of every distinct string inside "al"
			// object
	        Map<String,Integer> map = new HashMap<String, Integer>();
	        for(int i=0;i<al.size();i++)
	        {          
	        	// This integer is object here.
	            Integer count = map.get(al.get(i));       
	            map.put(al.get(i), count==null?1:count+1);  
            }
	        
	    // Printing all distinct keys with values    
        System.out.println(map);
        
        System.out.println();
        
        System.out.println("Dish, that is ordered most is:- ");
        
        // getting values of all keys.
        Collection val = map.values();
     
        // Entry set is used to have the set view of map 
        for (Entry<String, Integer> entry : map.entrySet()) 
        	{ 
            if (entry.getValue()==Collections.max(val)) { // comparing max value with every value
                System.out.print(entry.getKey()+"-");     // Print the key with max value
                System.out.println(entry.getValue());    // print the max value.
            }
        }
	}
 }