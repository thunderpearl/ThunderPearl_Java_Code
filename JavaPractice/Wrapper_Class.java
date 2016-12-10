package JavaPractice;

public class Wrapper_Class {
	public static void main(String[] args)
	{
		int x = 7;
		
		// Auto boxing done by us, manually.
		
		// This is Integer representation of int value.
		Integer y = Integer.valueOf(x);
		
		// Auto boxing done by compiler.
		Integer z = x;
		
		
		// Both will give the same results.
		System.out.println("Value of 'y' is: "+y);
		System.out.println("Value of 'z' is: "+z);
	}
}
