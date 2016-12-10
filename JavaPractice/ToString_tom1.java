package JavaPractice;

public class ToString_tom1 {
	public static void main(String[] args)
	{
		int x = 5;
		Integer y = 7;
		
		// This below cannot be done because x is not an Object.
		// System.out.println(x.toString());
		
	    // System.out.println(Integer.toString(x);
		System.out.println(Integer.toString(23));
		
		// Compiler itself put the toString() method for object.
		Integer z = new Integer(x);
		System.out.println(z);
		System.out.println(z.toString());
		
		// This is String representation of Object.
		System.out.println(y.toString());
	}
}
