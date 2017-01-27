package threading_practice;

public class Threading_tom1 {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Threading_jerry1(),"First");
		Thread t2 = new Thread(new Threading_mobby1(),"Second");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		/* Once threading starts we cannot control which thread to be executed first, though
		 * we can give the priority to the threads but still that do not guarentee the order of
		 * threads*/
		
		// This is the static method and can be called directly....
		//final_saying();
	}
	
//	public static void final_saying()
//	{
//		System.out.println("Ending the Threading....");
//	}
}
