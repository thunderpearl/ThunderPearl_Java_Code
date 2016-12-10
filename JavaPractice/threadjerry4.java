package JavaPractice;

public class threadjerry4 {

	public static void main(String[] args) throws Exception
	{
		//threadtom4 obj1 = new threadtom4();
		
		Thread t1 = new Thread(new threadtom4(), "First Thread");
		t1.start();
		
		Thread t2 = new Thread(new threadtom4(), "Second Thread");
		t2.start();
		
	}
}
