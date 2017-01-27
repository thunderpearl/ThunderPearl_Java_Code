
/*
 * StringBuffer is same as String class except that it is a mutable class
 *  means it's value can be changed. */
package JavaPractice;

public class String_Buffer_tom1 {
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("meliodas");
		
		// If StringBuffer were not immutable class then we could never have written the line 
		  // like below.
	    // We will have to write like sb1 = sb1.append(" elizabeth");
		sb1.append(" elizabeth");
		
		System.out.println(sb1);
	}
}
