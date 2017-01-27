package JavaPractice;

/* Nested interface are good for keep track of related interface as they cannot be accessed directly.
 * So, nested interfaces are easy to maintain with related class and interfaces. 
 * */
public interface Inner_interface_tom2 {
	
	public void calling();
	
	 interface Inner_interface_child
	{
		void saying();
		
	}
}
