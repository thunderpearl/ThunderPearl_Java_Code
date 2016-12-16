package threading;

public class Thread_tom1 extends Thread{
	private String name;
	private int power;
	
	Thread_tom1(String name, int power)
	{
		this.name = name;
		this.power = power;
	}
	
	public static void main(String[] args)
	{
		Thread_tom1 obj1 = new Thread_tom1("meliodas", 1200);
		
		 // Thread t1 = new Thread(obj1);
		
		obj1.start();
	}
	
	public void run()
	{
		// when passing parameter of class type, nothing is getting print.
		// System.out.println("Hello " + x.name + ", your power is impressively " + x.power );
	
		System.out.println("Hello! I am a thread....");;
	}
}
