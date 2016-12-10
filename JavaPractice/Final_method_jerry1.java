package JavaPractice;

public class Final_method_jerry1 extends Final_method_mobby1{
	public void saying()
	{
		// we can't override saying method of super class as it is declared final, but we can overload 
		// that method.
		System.out.println("I cannot override the saying method of my super class");
	}
}
