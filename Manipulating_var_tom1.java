package threading;

/* This was a test to manipulate some variable, we achieved that by using constructor
 * else we cannot pass any parameter to run method of Runnable interface as run() method is
 * defined without parameter in java.
 * */
public class Manipulating_var_tom1 implements Runnable{
	private String name;
	
	// constructor for the class
	Manipulating_var_tom1(String name)
	{
		this.name = name;
	}
	
	public void run()
	{
		System.out.println("Hello " + name);
		
		System.out.println("Welcome to "+ Thread.currentThread().getName());
	}
}
