package threading;

public class Threading_Id_jerry1 implements Runnable{
	
	public void run()
	{
		System.out.println("My name is "+Thread.currentThread().getName() + "  and My Id is "+ Thread.currentThread().getId());
	
		try{
		Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
