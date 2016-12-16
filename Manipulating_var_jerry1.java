package threading;

public class Manipulating_var_jerry1 {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Manipulating_var_tom1("Meliodas"), "Thread1");
		
		// starting the thread, "Thread1".
		t1.start();
		
		Runtime run = Runtime.getRuntime();
		
		// This will show all the free memory available in JVM.
		System.out.println("Available free memory for this process is:- "+ run.freeMemory());
		
		// Total memory of JVM will be printed out.
		System.out.println("Total memory in JVM is:- " + Runtime.getRuntime().totalMemory());
		
		// We can write this way as well
		// System.out.println(run.totalMemory());
		
		/* Thread class provides two types of sleep method, one is in milliseconds like
		 *  Thread.sleep(3000) and other is in milliseconds plus nanoseconds like 
		 *  Thread.sleep(3000, 2000000000) that makes it 2 seconds */
	}

}
