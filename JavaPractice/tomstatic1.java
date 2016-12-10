

package JavaPractice;

// This program is attached with jerrystatic1.
public class tomstatic1 {
	public static void main(String[] args)
	{
		jerrystatic1 obj1 = new jerrystatic1("Scarlett","Johansson");
		jerrystatic1 obj2 = new jerrystatic1("Alessandra","Ambrosio");
		jerrystatic1 obj3 = new jerrystatic1("Adriana","Lima");
		
		System.out.println();
		
		System.out.println("This is without the object");
		// With "static" we do not even need to make the object. 
		System.out.println(jerrystatic1.getMembers());
		System.out.println();
		
		System.out.println("THIS IS WITH THE OBJECT");
		
		System.out.println(obj1.getFirst());
		System.out.println(obj1.getLast());
		
		// This will again shared with all the members, hence it will print 3
		System.out.println(obj1.getMembers()); 
	}
}
