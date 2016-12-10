package JavaPractice;

import java.util.*;
public class Triangle_Pattern_tom2 {
	public static void main(String[] args)
	{
		System.out.println("Enter the value here...");
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=(n-1); j>=i; j--)
			{
				System.out.print(" ");
			}
		
			for(int k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
		
			System.out.println("");
	    }
	}
}
