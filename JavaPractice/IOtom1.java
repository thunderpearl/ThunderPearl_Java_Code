

package JavaPractice;

import java.io.*;
public class IOtom1 {
	public static void main(String[] args) throws IOException
	{
		try{
			int i=10;
		    i = System.in.read();
			System.out.println((char)i);
		}
		catch(Exception e)
		{
			System.out.println("Please clear the exception error");
		}
		
	}
	

}
