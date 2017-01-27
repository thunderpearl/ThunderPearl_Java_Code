package JavaPractice;

public class Wrapper_Class_tom1 {
	public static void main(String[] args)
	{
		// This is because of wrapper class on java.
		
		// All these wrapper class can take respective arguments and String both except 
		 // char

		Integer num1 = new Integer(23);
		Integer num2 = new Integer("35");
		System.out.println("Sum of numbers is " +(num1+num2));
		
		Integer num3 = new Integer(917409143);
		// Byte value of the num3
		// Computer will first convert above integer to binary and then convert it to byte
		  // and byte is of 8 bits so it will convert 8 bits from right to decimal.
		System.out.println(num3.byteValue());
		
		// Visit below link and more explanation is given there.
		// http://www.w3resource.com/java-tutorial/java-wrapper-classes.php
	}
}
