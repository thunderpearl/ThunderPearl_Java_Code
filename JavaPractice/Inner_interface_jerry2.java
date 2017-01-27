package JavaPractice;

/* Nested interface are good for keep track of related interface as they cannot be accessed directly.
 * So, nested interfaces are easy to maintain with related class and interfaces. 
 * */
public class Inner_interface_jerry2 implements Inner_interface_tom2.Inner_interface_child{
	public static void main(String[] args)
	{
		Inner_interface_jerry2 obj2 = new Inner_interface_jerry2();
		
		obj2.saying();
	}
	
	public void saying()
	{
		System.out.println("Hello! I am saying method which will override inner interface's method");
	}
	
//	public void calling()
//	{
//		
//	}
}
