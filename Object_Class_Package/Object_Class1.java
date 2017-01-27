package Object_Class_Package;

public class Object_Class1 {
	public static void main(String[] args)
	{
		Object_Class1 obj1 = new Object_Class1();
		
		Class<? extends Object_Class1> class_name = obj1.getClass();
		// Object class_name = obj1.getClass(); // This can also work.
		System.out.println("My Class is: "+class_name);
		System.out.println(obj1.getClass());
		
		//System.out.println(obj1.getSuperclass());
	}
}
