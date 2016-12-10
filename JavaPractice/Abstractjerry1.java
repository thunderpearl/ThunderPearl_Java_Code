package JavaPractice;

public class Abstractjerry1 extends Abstractmobby1 {
	public void display()
	{	
		// This method must override the abstract method of Abstractmobby1 i.e. display().
		System.out.println("Hello! I am overriding the Abstract method of super class");
	}
	
	public void speak()
	{
		System.out.println("I am speak method of Abstractjerry1");
	}

}
