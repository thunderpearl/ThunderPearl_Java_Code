
// This is an Example of INTERFACES

package JavaPractice;

public class Interfacetom1 {
	public static void main(String[] args)
	{
		Interfacemobby1 obj1 = new Interfacemobby1();
		
		// Objects are being used for calling the methods of Interfacemobby1 class
		// which in turn are overriding the Interfacejerry1 INTERFACE's methods.
		obj1.display();
		obj1.saying();
		
		// can not instantiate interface object.
		//Interfacejerry1 obj5 = new Interfacejerry1();
	}

}
