package JavaPractice;

public class threadtom7 extends Thread {
	public void run()
	{
		for(int x=0; x<10; x++ )
		{
		System.out.printf("I am a thread and I am running %d time",x);
		System.out.println();
		
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception occured is: "+e);
		}
		
		}
	}
}
