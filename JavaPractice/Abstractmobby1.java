
// This is the Abstract class.
package JavaPractice;

// meaning of abstract class is that we can not make it's object.
// for an abstract method to work class must be defined abstract but not vice versa.
public abstract class Abstractmobby1 {
	
	// Abstract method do not have definition, they are logic less. 
	abstract public void display();

	// This is the non abstract method inside the abstract class.
	public void greet()
	{
		System.out.println("Hello! I am non-abstract method of the Abstract class, Nice to meet you");
	
		// This is one benefit of abstract class that it can define it's non-abstract method as well
		// Abstract class can have member variables as well.
	}
}
