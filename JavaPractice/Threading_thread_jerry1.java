package threading;

public class Threading_thread_jerry1 extends Thread{
	
	
	public Threading_thread_jerry1(String name)
	{
		// This below will call the constructor of parent class i.e. Thread class.
		// Allocates the new thread object, "name" is the name of the new thread.
		super(name);
	}
	
	@Override
	public void run()
	{
		System.out.println("heavy work:- start "+ Thread.currentThread().getName());
		
		try{
			Thread.sleep(1000);
			
			doProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("heavy work:- end "+ Thread.currentThread().getName());
	}
	
	public void doProcessing() throws InterruptedException
	{
		Thread.sleep(6000);
	}
}
