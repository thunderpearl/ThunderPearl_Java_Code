package JavaPractice;

public class Getters_jerry2 {
	public static void main(String[] args)
	{
		Getters_tom2 obj1 = new Getters_tom2("meliodas", 14);
		
		Getters_tom2 obj2 = new Getters_tom2();
		
		// toString() of the Getters_jerry2 will replace the default toString() method.
		System.out.println(obj1);
		
		System.out.println(obj2);
	}
}
