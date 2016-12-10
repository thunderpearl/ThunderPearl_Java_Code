package JavaPractice;

public class Exception_tom5 {
	public static void main(String[] args)
	{
		int num1 = 20;
		try
		{
		 float result = num1/0;
		 System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured is :-" + e);
		}
		 
	}
}
