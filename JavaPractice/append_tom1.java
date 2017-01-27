/*String buffer class in java is same as String class
 * except that it is mutable class*
 * 
 * This class is thread safe, it means multiple threads cannot access it
 *  hence, it will follow an order. */
package JavaPractice;


import java.util.*;
public class append_tom1 {
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello ");
		
		// This append method update the value of object that invoke this method....
		sb.append("World!");
		
		System.out.println(sb);
	}
}
