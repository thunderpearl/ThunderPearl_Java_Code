package JavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Method_reference_java8 {
	public static void main(String[] args)
	{
		List<String> arr = new ArrayList<String>();
		
		arr.add("meliodas");
		arr.add("elizabeth");
		arr.add("lucy");
		arr.add("natsu");
		arr.add("grey");
		arr.add("juvia");
		
		// This is called as method referencing. It has started in java 8. 
		arr.forEach(System.out::println);
		
		// Method referencing is used in 3 types of methods:-
		// Static, Constructor and Instance Methods.
	}
}
