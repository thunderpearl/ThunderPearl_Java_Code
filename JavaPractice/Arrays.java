package JavaPractice;

public class Arrays {
	public static void main(String[] args)
	{	
		// This is the way of defining arrays in java.  
		int array1[] = new int[4]; 
		
		int array2[] = new int[]{3,4,5,6,7};
		
		int array3[] = {1,2,3};
		
		System.out.println(array2[2]);
		
		System.out.println("These below are array3's elements......");
		
		for(int x=0; x<array3.length; x++ )
		{
			System.out.println(array3[x]);
		}
	}
}
