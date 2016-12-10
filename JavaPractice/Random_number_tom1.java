package JavaPractice;

import java.util.*;
public class Random_number_tom1 {
	public static void main(String[] args)
	{
		Random rnd = new Random();
		
		// We have to add 1 else it will give values between 0 to 5.
		int number = 1+rnd.nextInt(6);
		
		System.out.printf("Random Number generated is:- %d",number);
		

	}
}
