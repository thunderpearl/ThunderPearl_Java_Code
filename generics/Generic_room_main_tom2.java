package generics;

public class Generic_room_main_tom2 
{
	public static void main(String[] args)
	{
		// This way of generic can be done only when we have define class to be generic
		 // like Generic_room_tom2<T>
		
		// This below <Integer> will replace <T> in Generic_room_tom2 class. Consider T as variable.
		Generic_room_tom2<Integer> obj4 = new Generic_room_tom2<Integer>(23);
		
		// This below will give error as default constructor of without parameter is not defined. 
		// This is caused by the technique of java called as erasure.
		// Generic_room_tom2<Integer> obj5 = new Generic_room_tom2<Integer>();
		
		// Here, we will catch the error at compile time directly
		// obj4.set("40");
		
		obj4.set(40);
	System.out.println("Added value is " + obj4.get());
		
	}
}
