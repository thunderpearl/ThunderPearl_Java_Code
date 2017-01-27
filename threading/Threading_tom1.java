package threading;

public class Threading_tom1 implements Runnable{
	public void run()
	{
		System.out.println("Starting Thread " + Thread.currentThread().getName() + " Starting");
		
		try{
			this.doProcessing();
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
