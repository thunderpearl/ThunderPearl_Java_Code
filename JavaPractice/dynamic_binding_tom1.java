package JavaPractice;

public class dynamic_binding_tom1 {
	public static void main(String[] args)
	{
		// This is also called as upcasting.
		dynamic_binding_mobby1 obj1 = new dynamic_binding_jerry1();
		
		obj1.start();
	}
	// Now, this is an example of dynamic binding as which method is to be run us decided by type 
	// of object called and that is decoded at run time.
}
