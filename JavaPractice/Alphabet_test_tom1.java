package JavaPractice;

public class Alphabet_test_tom1 {
	public static void main(String[] args)
	{
		int number1 = 43;
		
		String str = String.valueOf(number1);
		
		System.out.println(str);
	
		// Can't do below thing.
	//	int sum = str + 4;
		
		int number2 = Integer.valueOf(str);
		System.out.println(number2 + 2);
		
		int number3 = Integer.parseInt(str);
		System.out.println(number3 + 4);	
		
		int number4 = 56;
		// System.out.println(number4.toString());		
	}
}
