package JavaPractice;

public class Custom_exception_jerry1 {
	
	static  void validate(int age)throws Custom_exception_tom1
	{
		if(age<18)
		{
			throw new Custom_exception_tom1("not valid");
		}
		
		else
		{
			System.out.println("Welcome To Vote");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			validate(13);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
		}
		
		System.out.println("Rest of the Code......");
	}
}
