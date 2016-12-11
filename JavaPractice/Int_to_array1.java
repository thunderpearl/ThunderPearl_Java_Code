package JavaPractice;

import java.util.*;
public class Int_to_array1 {
	public static void main(String[] args)
	{
		System.out.println("Enter a number.....");
		
		Scanner scn = new Scanner(System.in);
		
		// get int value
		int number = scn.nextInt();
		
		// converting int to String
		String str = String.valueOf(number);
		
		// Defining an array with char type.
		char arr[] = new char[str.length()];
		
		// Storing values into array
		for(char x=0; x<str.length(); x++)
		{
			arr[x] = str.charAt(x);
		}
		
		// Printing elements of array
		for(int y=0; y<str.length(); y++)
		{
			System.out.print(" " + arr[y]);
		}
		
	}
}
