package threading;

public class All_threads_running_tom1 implements Runnable{
	
	private long id;
	
	public void run()
	{
		// Printing the name of thread.
		System.out.println("I am " + Thread.currentThread().getName());
		
		// getting method's ID printed.
		System.out.println("My ID is " + tell_ID());
	}
	
	
	// Method for Threads ID stored in a variable. 
	public long tell_ID()
	{
		id = Thread.currentThread().getId();
		
		return id;
	}

}
