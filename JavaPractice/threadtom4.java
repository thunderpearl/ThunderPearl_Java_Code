

/*
 * This is a trial of threading from our own side
 * */
package JavaPractice;

public class threadtom4 implements Runnable{

	public void run()
	{
		for(int x=0; x<10; x++)
		{
			System.out.println(Thread.currentThread().getName()+ " is running");
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("thread's exception" + ie);
			}
		}

		
		// Threading will get finish for both the threads which are running......
		System.out.println("Threading is finished");
	}
}
