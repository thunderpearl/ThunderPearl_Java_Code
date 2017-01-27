package JavaPractice;

import java.util.Vector;

public class Vector_class_tom1 {
	public static void main(String[] args)
	{
		// If we do not give any parameter in vector object then constructor of vector
		 // will create default vector of capacity i.e. 10
		Vector<Integer> vc = new Vector<Integer>();
		
		System.out.println("Present capacity of vector is "+ vc.capacity());
		
		// Vector size is 0 as there is nothing in vector.
		System.out.println("Size of the present vector is "+vc.size());
		
		vc.addElement(2);
		vc.addElement(3);
		
		int array1[] = {5,6,7,8};
		
		
		// we can add a whole array into vector also. 
		 // vc.addElement(array1);
		  // As generic has already been assigned, above array can't be added.  
		
		// After the addition of array we have got 3 elements as array has been treated as 
		 // one single element that has been added into the vector.
		System.out.println("Size of vector after the addition of array is "+vc.size());		
	}
}
