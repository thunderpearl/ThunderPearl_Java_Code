package JavaPractice;

public class Abstracttom1 {

	public static void main(String[] args)
	{
		Abstractjerry1 obj1 = new Abstractjerry1();
		obj1.display(); // calling the display() method which will be overriding the 
		// abstract method of super class.
		
		// calling the speak() method.
		obj1.speak();
		
		Abstractjerry1 obj2 = new Abstractjerry1();
		
		obj2.greet();
		
	// we can not create object of abstract method.	
	//	Abstractmobby1 obj3 = new Abstractmobby1();
		
		// But we can do typr casting with abstract class.
		Abstractmobby1 obj4= new Abstractjerry1();
		obj4.display();
		
	}
}
