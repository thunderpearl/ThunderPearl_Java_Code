


package JavaPractice;

public class Finaljerry1 {
	private int sum;
	private final int NUMBER; // if this is set once then it can't be changed 
	
	public Finaljerry1(int x)
	{
		NUMBER = x;
	
	}
	
	
	public void add()
	{
		sum+=NUMBER; // By default sum's value is 0.
	}
	
	
	// This toString() will be called whenever object of this class will be called.
	// here we are overriding toString()
	public String toString()
	{
		return String.format("Sum is = %d\n", sum);
	}
}
