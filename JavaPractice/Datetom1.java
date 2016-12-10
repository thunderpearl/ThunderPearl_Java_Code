

package JavaPractice;

// This is "java.util" package
import java.util.*;
public class Datetom1 
{
	public static void main(String[] args)
	{
		System.out.println("We are gonna print the date here:- ");
		
		//Instantiate the Date object
		// Data class of java.util package have Data constructor initialize the object with the current date and time.
		Date date = new Date();
		
		// Here we are printing the date and time at present
		System.out.println("Present date is "+ date.toString());
		// This above object without toString() method can also work because compiler itself put 
		// toString() method after the object.
	}
}
