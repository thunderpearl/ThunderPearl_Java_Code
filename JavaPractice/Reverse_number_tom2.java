package JavaPractice;

import java.util.*;
public class Reverse_number_tom2 {
	public static void main(String[] args)
	{
		System.out.println("Enter a multi Digit number of your choice.....");
		
		Scanner scn = new Scanner(System.in);
		 int number = scn.nextInt();
		 
		 int temp = 0;
		 int reverse = 0;
		 
		 while(number > 0)
		 {
			 temp = number%10;
			 reverse = reverse * 10 + temp ;
			 number = number/10;
		 }
		 
		 System.out.println("Reversed Number is:- " + reverse);
	}
}
