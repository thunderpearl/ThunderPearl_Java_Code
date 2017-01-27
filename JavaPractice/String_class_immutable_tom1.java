package JavaPractice;

public class String_class_immutable_tom1 {
	public static void main(String[] args)
	{
		String str1 = new String("meliodas");
		str1 = "demon prince";
		str1.concat("Dragon");
		
		System.out.println(str1);
	/*	
		String str2 = new String("baan");
		String str2 = new String("snatcher");
		
		This wont work as string is an immutable class.
	*/	
			
	}
}
