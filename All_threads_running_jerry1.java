package threading;

public class All_threads_running_jerry1 {
	public static void main(String[] args)
	{
		//creating thread....
		Thread t1 = new Thread(new All_threads_running_tom1(), "Thread1");
		
		// starting the thread...
		t1.start();
	}
}
