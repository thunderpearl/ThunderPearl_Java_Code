package JavaPractice;

public class Getters_tom1 {
	public static void main(String[] args)
	{
		
		
		Getters_tom1 obj1 = new Getters_tom1();
		
		// This will help us in knowing the name of the class.
		Class cl_name = obj1.getClass();
		System.out.println(obj1.getClass());
		
		// Here getName() tells the name of the class 
		System.out.println(cl_name.getName());
		
		// getName() on object of File will give the name of the directory and file name. 
		
		//this.message();  // we can not use it this way.
		
	}
	
	// We have not used this below method anywhere, was just trying to use through this.
	public String message()
	{
		return "Hello!";
	}
}
