package JavaPractice;

import java.util.*;
public class Even_Odd_tom1 {
	public static void main(String[] args)
	{
		System.out.println("Enter a number......");
		
		Scanner scanner = new Scanner(System.in);
		
		int number1 = scanner.nextInt();
		
		int result = number1%2;
		if(result == 1 || result == -1)
		{
			System.out.println("Number you entered is odd number...");
		}
		
		else
		{
			System.out.println("Number you entered is even number...");
		}
	}
}
