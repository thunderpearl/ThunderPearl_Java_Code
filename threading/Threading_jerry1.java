package threading;

public class Threading_jerry1 implements Runnable{
	
	public void run()
	{
		System.out.println("Starting Thread " + Thread.currentThread().getName() + " Starting");
		
		try{
			
			doProcessing();
			
			// we can use like below as well bcoz java compiler automatically put "this" in front.
			//this.doProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	public void doProcessing() throws InterruptedException
	{
		System.out.println("Ending Thread " + Thread.currentThread().getName());
		Thread.sleep(4000);
	}
}