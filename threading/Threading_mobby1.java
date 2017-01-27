package threading;

public class Threading_mobby1 {
	public static void main(String[] args)
	{
		// Here, we are actually running two threads whose definitions are separate
		 // and placed in two different class files.
		Thread t1 = new Thread(new Threading_tom1(), "Thread1");
		Thread t2 = new Thread(new Threading_jerry1(), "Thread2");
	
		t1.start();
		t2.start();
	}

}
