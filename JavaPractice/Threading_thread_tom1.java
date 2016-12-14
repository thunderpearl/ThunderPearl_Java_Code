package threading;

public class Threading_thread_tom1 implements Runnable{
	
	// implementing the run method.
	
	@Override
	public void run()
	{
		System.out.println("Heavy work:-  START " + Thread.currentThread().getName());
	
		try
		{
			Thread.sleep(1000);
			
			doProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Heavy work:- END " + Thread.currentThread().getName());
	}
	
	
	public void doProcessing() throws InterruptedException
	{
		
		Thread.sleep(6000);
		
		// This below code will also work if we do not throws Exception.
		
//		try{
//		Thread.sleep(5000);
//		}
//		catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
	}
	
}
