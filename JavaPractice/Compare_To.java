package JavaPractice;

public class Compare_To {
	public static void main(String[] args)
	{
		String str1 = "Hey! This is Thunder";
		String str2 = "Thunder is the best coder";
		
		int val1 = str1.compareTo(str2);
		
		System.out.println(val1);
		
		int val2 = str2.compareTo(str1);
		System.out.println(val2);
		
		// While comparing if some String is less than other then smaller String comes first in 
		// dictionary and if some String is greater than other it means greater String comes later
		// in the dictionary.
		
		// if we get negative value then it means str1 is less than str2.
		// if we get positive value then it means str1 is greater than str2.
		Integer num1 = 23;
		Integer num2 = 43;
		
		// compareTo() method can only be used with primitive datatypes.
		System.out.println(num1.compareTo(num2));
	}

}
