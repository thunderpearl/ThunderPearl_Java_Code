package JavaPractice;

public class static_binding_tom1 {
	public static void main(String[] args)
	{
		static_binding_tom1 obj1 = new static_binding_tom1();
		
		obj1.saying();
	}
	
	public void saying()
	{	
		// When object type is determined at the time of compilation then
		// it is called as static binding.......
		System.out.println("I am because of static binding");
	}
	
	// static binding occurs at compile time and dynamic binding occurs at run time.

	// private,final and static methods and variables uses static binding.
	
	// static binding uses class type for static binding and dynamic binding uses object 
	// for dynamic binding.
	
	// Overloaded methods are bonded using static binding, while Overridden methods are bonded 
	// using dynamic binding hence we can say that dynamic binding happens during the time of
	// inheritance.
}
