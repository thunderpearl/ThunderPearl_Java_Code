
/*This is the example of the immutable class*/
package JavaPractice;

// A class with modifier 'final' cannot be extended.
public final class Immutable_class_tom1 {
	final String name;
	
	public Immutable_class_tom1()
	{
		name = null;
	}
	
	public Immutable_class_tom1(String name)
	{
		this.name = name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		Immutable_class_tom1 obj1 = new Immutable_class_tom1("meliodas");
		System.out.printf("The passed name is %s", obj1.getname());
		
	//	obj1.name = "demon king";
		// Above cannot be done as it is an final variable.
	}
}
