package generics;

public class Generic_room_main_tom1 {
	public static void main(String[] args)
	{
		// This below code is giving error as Generic_room_rom1 class is not a generic class.
	//	Generic_room_tom1<Integer> obj1 = new Generic_room_tom1<Integer>();
		
		Generic_room_tom1 obj2 = new Generic_room_tom1();
		Generic_room_tom1 obj3 = new Generic_room_tom1();
		obj2.set(40);
		obj3.set("40"); // Here, it will not give any error at compile time as this argument is 
		// for sure Object type.
		
		// but at run time that above line will give error.
		
		Integer i = (Integer) obj2.get(); 
		System.out.println(i);	
		
		String s = (String) obj3.get();
		System.out.println(s);
		
	/*	But, what if user accidently type something else like float or long then we are not gonna 
	 *  write the cases for everything so, teh concept of generics is introduced */  
	}
}
