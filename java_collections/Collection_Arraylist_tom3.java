package java_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Arraylist_tom3 {
	public static void main(String[] args)
	{
		// With generic type you can add different types of data inside an ArrayList.
		ArrayList<Object> als = new ArrayList<Object>();
		
		als.add("Paris");
		als.add("London");
		als.add("Berlin");
		als.add("Belgrade");
		als.add(4);
		
		Iterator<Object> itr = als.iterator();
		
		System.out.println("Elements of the Array List are ");
		System.out.println();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
