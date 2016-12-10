package JavaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Count_String3 {

	
public static void main(String[] args) {
	
	String arr1[] = {"Paneer Tikka Masala", "Dal Makhani", "Rice, Naan", "Raita, Gulab Jamun"}; 
	String arr2[] = {"Paneer Makhani", "Dal Tadka", "Pulav", "Roti", "Chhaas", "Jalebi"};
	String arr3[] = {"Paneer Thai Satay", "Mexican Rice", "Veg Makhani", "Delights Gravy", "Salad", "Papad"};
	String arr4[] = {"Suran Fry", "Matki Usal", "Plain Dal", "Steam Rice", "Papad", "Curd", "Solkadhi", "Shrikhand"};
	
        ArrayList<String> al = new ArrayList<String>();    //init first,just for test
        Collections.addAll(al,arr1);
        Collections.addAll(al,arr2);
        Collections.addAll(al,arr3);
        Collections.addAll(al,arr4);
       
         
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<al.size();i++){            
            Integer count = map.get(al.get(i));       
            map.put(al.get(i), count==null?1:count+1);   //auto boxing and count
        }
        System.out.println(map);
        
        Collection val = map.values();
        Collection key = map.entrySet();
        Collection key_set = map.keySet();
        
       // System.out.println(Collections.max(key));
        System.out.println(Collections.max(val));
        System.out.println(Collections.max(key_set));
    
 
    }
}
