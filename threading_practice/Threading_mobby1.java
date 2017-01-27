package threading_practice;

public class Threading_mobby1 implements Runnable{
	public void run()
	{
		// Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread " + Thread.currentThread().getName()+ " is Running...");
		
		try {
			for(int x=0; x<10; x++)
			{
				System.out.println(x);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error is "+ e);
		}
		
		// Calling the saying() method in here.
		saying();
	}
	
	public void saying()
	{
		System.out.println("Thread "+ Thread.currentThread().getName()+" is Ending...");
	}
}
