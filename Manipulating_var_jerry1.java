package threading;

public class Manipulating_var_jerry1 {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Manipulating_var_tom1("Meliodas"), "Thread1");
		
		// starting the thread, "Thread1".
		t1.start();
	}
}
