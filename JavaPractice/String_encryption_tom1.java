package JavaPractice;

public class String_encryption_tom1 {
	public static void main(String[] args)
	{
		String str1 = "lfslj3242slf424ks";
		String str2 = "";
		
		int str_len = str1.length();
		
		for(int i=0; i<str_len; i++)
		{
			char variable = str1.charAt(i);
			
			if(Character.isDigit(variable))
			{
				str2 = str2 + variable;
			}
		}
		
		System.out.println("New String is:- " + str2);
	}
}
