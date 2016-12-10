package JavaPractice;

public class Static_Method {
	public static void main(String[] args)
	{
		// Static method and variables do not need instance of a class to get executed.
		// For outside classes we can use class name and method like below.
		Static_Method.hello();
		
		// class within the main class do not need even the instance.
		hello();
		
		System.out.println();
		
		// But here we need object to use a method whose return type is integer.
		Static_Method obj1 = new Static_Method();
		
		System.out.println(obj1.number());
	}
	
	static void hello()
	{
		System.out.println("I am a static method which will be called without object as it is in the same class");
	}
	
	int number()
	{
		return 23;
	}
}
