package JavaPractice;

public class Instance_initialized_block_child extends Instance_initialized_block_parent{
	Instance_initialized_block_child()
	{
		super();
	
		// Java compiler will copy instance block here, this is why instance block will execute
		// before below line. But, super will execute even before this instance block.....
		System.out.println("I am the  constructor of the child class");
	}
	
	{
		// This is the instance block which will be copied in child class's constructor 
		System.out.println("I am the instance block which is getting initialized......");
	}
	
	public static void main(String[] args)
	{
		// Creating the instance of the child class....
		Instance_initialized_block_child obj1 = new Instance_initialized_block_child();
	}
	
// Instance Initializer Block is useful when we have many constructor to be called and 
// all the constructors are doing same thing, let's say we have static int count=0;
// All, the constructors are doing count++ which is actually a case of code duplication. So
// to avoid this we will use code initial initializer block which will execute everytime
// a constructor is call and will solve the purpose.
// 
}
