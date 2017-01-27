package java_collections;

import java.util.*;
public class Collection_Arraylist_tom2 {
	public static void main(String[] args)
	{
		ArrayList<String> als = new ArrayList<String>();
		
		als.add("Paris");
		als.add("London");
		als.add("Berlin");
		als.add("Belgrade");
		
		Iterator<String> itr = als.iterator();
		
		System.out.println("Elements of the Array List are ");
		System.out.println();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
