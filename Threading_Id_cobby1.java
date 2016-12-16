package threading;

public class Threading_Id_cobby1 {
	
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Threading_Id_tom1(), "Thread1");
		Thread t2 = new Thread(new Threading_Id_jerry1(), "Thread2");
		Thread t3 = new Thread(new Threading_Id_mobby(), "Thread3");
		
		
		System.out.println("I am "+ Thread.currentThread().getName() + " and my ID is "+ Thread.currentThread().getId());
		
		t1.start();
		t2.start();
		t3.start();
		
		// 
		System.out.println(Thread.currentThread().getName() + " Thread is Ending.");
		
		/*
		 * When the JVM starts, it creates a thread called "Main". Your program will run on 
		 * this thread, unless you create additional threads yourself.

	The first thing the "Main" thread does is to look for your static void main(String[] argv)
	 method and invoke it. That is the entry-point to your program.

	If you want things to happen "at the same time", you can create multiple threads, 
	and give each something to execute. They will then continue to do these things concurrently. 
	The JVM also creates some internal threads for background work such as garbage collection.
	
	
	daemon are the process which runs in background and we do not have direct control over them.
	Most of the daemon have "d" attached to them, eg:- syslogd
		 * */
	}
}
