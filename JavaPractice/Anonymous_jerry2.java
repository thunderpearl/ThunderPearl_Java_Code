package anonymous_class;

public class Anonymous_jerry2 {
	public static void main(String[] args)
	{
		/* This is a anonymous class here as well. This anonymous class is given name
		 * by compiler which implements Anonymous_tom2 interface and provides the 
		 * implementation of the eat() method. 
		 * */
		Anonymous_tom2 obj1 = new Anonymous_tom2(){
			public void eat()
			{
				System.out.println("Nice Food....");
			}
		};
		
		obj1.eat();
	}
}
