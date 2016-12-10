


package JavaPractice;

public class Finaltom1 {
	public static void main(String[] args)
	{
		Finaljerry1  obj1 = new Finaljerry1(26);
	//	Finaljerry1  obj2 = new Finaljerry1(16);
		
		for(int x=0; x<8; x++)
		{
		obj1.add();
		
		// At the end we want our result to be in this string format.
		// toString() will convert the result into the string.
		// this obj1 will directly call that toString() method.
		// because compiler automatically append toString() with object, but here that 
		// method will be overwritten by toString inside Finaljerry1 class.
		System.out.printf("%s", obj1);
		//System.out.printf("%s", obj2);
		
		// If we try to pass other integer into the final variable then it will not happen.
		}
	}
}
