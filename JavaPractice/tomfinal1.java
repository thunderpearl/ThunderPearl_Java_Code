package JavaPractice;

public class tomfinal1 {
	public static void main(String[] args)
	{
		jerryfinal1  obj1 = new jerryfinal1(26);
	//	jerryfinal1  obj2 = new jerryfinal1(16);
		
		for(int x=0; x<8; x++)
		{
		obj1.add();
		
		// At the end we want our result to be in this string format.
		// toString() will convert the result into the string.
		// this obj1 will directly call that toString() method.		
		System.out.printf("%s", obj1);
		//System.out.printf("%s", obj2);
		
		// If we try to pass other integer into the final variable then it will not happen.
		}
	}
}
