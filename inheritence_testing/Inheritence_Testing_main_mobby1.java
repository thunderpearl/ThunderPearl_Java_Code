package inheritence_testing;

public class Inheritence_Testing_main_mobby1{
	public static void main(String[] args)
	{
		// We have done the up casting here
		// We know that the 'Object' is the super class of all the classes but we would not put 
		 // the reference type for the below variable as 'Object' because we do not have any saying()
		  // method in the 'Object class'.
		Inheritence_Testing_tom1 obj_tom1 = new Inheritence_Testing_jerry1();
		
		obj_tom1.saying();
		
	// Type mismatch below
		// We have defined our own Object Class.
	//	Object obj_obj = new Inheritence_Testing_jerry1();
	}
}
