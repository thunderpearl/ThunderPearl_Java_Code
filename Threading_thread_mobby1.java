package threading;

public class Threading_thread_mobby1 {
	public static void main(String[] args)
	{
		/* These threads are those threads which we are running by implementing Runnable 
			interface.
		*/
		// creating thread object and giving thread name as "Thread1"
		Thread t1 = new Thread(new Threading_thread_tom1(), "Thread1");
		
		// creating thread object and giving thread name as "Thread2"
		Thread t2 = new Thread(new Threading_thread_tom1(), "Thread2");
		
		System.out.println("Starting Runnable Threads");
		
		t1.start();
		t2.start();
		
		System.out.println("Runnable Threads have been started");
		
		
		// These threads are the threads which we are running by extending Thread class
		Thread t3 = new Thread("Thread3");
		Thread t4 = new Thread("Thread4");
		
		System.out.println("Starting extended Threads");
		
		// These Threads are also running but their names are not coming...
		t3.start();
		t4.start();
		
		System.out.println("Extended Threads have started");
	}
	/*
	 * Once we start the thread, we do not have any control over which thread will 
	 * start first. Though we can set priority but even though we are not sure that
	 * a higher priority thread will be executed first. 
	 * */
}
