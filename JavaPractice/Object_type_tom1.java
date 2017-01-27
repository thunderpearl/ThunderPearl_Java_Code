package JavaPractice;

// This is the polymorphism.
public class Object_type_tom1 {
	public static void main(String[] args)
	{
		//Object_type_jerry1 obj1 = new Object_type_jerry1();
		Object_type_cobby1[] poly = new Object_type_cobby1[2];
		
		poly[0] = new Object_type_jerry1();
		poly[1] = new Object_type_mobby1();
		
		// now we can call these respective methods based on their objects array
		 // elements.
		for(Object_type_cobby1 x:poly)
		{
			x.saying();
		}
	}
}
