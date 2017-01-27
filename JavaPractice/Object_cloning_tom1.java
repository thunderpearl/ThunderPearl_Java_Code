package JavaPractice;

public class Object_cloning_tom1 implements Cloneable {
	String name;
	int salary;
	
	// constructor of the class.
	Object_cloning_tom1(String name, int salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Object_cloning_tom1 obj1 = new Object_cloning_tom1("meliodas",10000);
		
		// Here, we have cloned the object "obj1"
		Object_cloning_tom1 obj2 = (Object_cloning_tom1)obj1.clone();
		
		// If we try to check equality of two objects then it will come out to be false even
		// after cloning....
		
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
		
	}
}
