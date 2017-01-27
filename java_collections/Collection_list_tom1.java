
/*Java Collection means a single unit of object.*/

/*Java ArrayList implements List interface and inherits AbstractList class
 * It can maintain insertion order and it can contain duplicate elements.*/
package java_collections;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collection_list_tom1 {
	public static void main(String[] args)
	{
		// creating object for the ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(11);
		al.add(12);
		al.add(23);
		al.add(26);
		al.add(35);
		al.add(46);
		al.add(52);
		al.add(57);
		al.add(75);
		
		Iterator<Integer> itr = al.iterator(); 
		
		// Traversing using while loop.
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}
