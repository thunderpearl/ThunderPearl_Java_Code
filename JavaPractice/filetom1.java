
package JavaPractice;

import java.io.File; // This is the file class
public class filetom1 {
	public static void main(String[] args)
	{
		// We have to give "\\" in path as "\" is normally an escape character in java.
		File yoyo = new File("C:\\Javapractice\\amount.class");
		
		if(yoyo.exists())
		{
			//getName() is used to get the name of the file.
			System.out.println("You file " + yoyo.getName()+ " exists");
		}
		
		else 
		{
			System.out.println("Your searched file do not exists");
		}
	}

}
