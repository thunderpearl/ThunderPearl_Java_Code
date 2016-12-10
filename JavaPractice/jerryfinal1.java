package JavaPractice;

public class jerryfinal1 {
	private int sum;
	private final int NUMBER; // if this is set once then it can't be changed 
	
	public jerryfinal1(int x)
	{
		NUMBER = x;
	}
	
	public void add()
	{
		sum+=NUMBER; // By default sum's value is 0.
	}
	
	
	// This toString() will be called whenever object of this class will be called.
	public String toString()
	{
		return String.format("Sum is = %d\n", sum);
	}
}
