package JavaPractice;

public class Array_object_type1 {
	public static void main(String[] args)
	{
		Object[] arr1 = new Object[]{2,3,"yo"};
		
		for(Object x: arr1)
		{
			System.out.println(x);
		}
	}
}
