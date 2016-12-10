package JavaPractice;

import java.util.*;

public class Calender_tom2 {
	public static void main(String[] args)
	{
		Calendar now = Calendar.getInstance();
		
		// This Calendar class is gonna give month 1 less than present month.
		// So, we need to add 1 into it.
		System.out.println(now.get(Calendar.MONTH)+ 1);
		
		// But addition of 1 is not needed in date and month.
		System.out.println(now.get(Calendar.DATE));
		
		// Here it is gonna print the Year.
		System.out.println(now.get(Calendar.YEAR));
		
		
		
		// Like get we have add method as well 
		now.add(Calendar.DATE,10 );
		
		System.out.println(now.get(Calendar.DATE));
		
		
	}
}
