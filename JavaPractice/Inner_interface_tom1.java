package JavaPractice;

/* Nested interface are good for keep track of related interface as they cannot be accessed directly.
 * So, nested interfaces are easy to maintain with related class and interfaces. 
 * */
public class Inner_interface_tom1{
	
	private interface greeting
	{
		void saying();
	}
	
	public static void main(String[] args)
	{
		Inner_interface_tom1 obj1 = new Inner_interface_tom1();
		
		obj1.saying();
	}
	
	void saying()
	{
		System.out.println("Hello, welcome to inner interface...");
	}
}
