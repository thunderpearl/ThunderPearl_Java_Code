package JavaPractice;

import java.util.*;
public class Fibonacci_Series2 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of fibonacci numbers you want....");
		
		int inputt = scanner.nextInt();
		
		// Defining the general array
		int array1[] = new int[inputt];
		
		array1[0] = 0;
		array1[1] = 1;
		
		for(int x=2; x<inputt; x++)
		{
			array1[x] = array1[x-1] + array1[x-2];
		}
		
		for(int j=0; j<inputt; j++)
		{
			System.out.printf("%d\t", array1[j]);
		}
	}
}
