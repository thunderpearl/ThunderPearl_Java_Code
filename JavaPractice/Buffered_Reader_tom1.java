package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader_tom1 {
	public static void main(String[] args) throws IOException
	{
		// This is same as what we use to do by Scanner class
		BufferedReader bgstr1 = new BufferedReader(new InputStreamReader(System.in));
	
		// Object of BufferReader will use to read the whole line.
		 // later we can do any manipulation as we please.
		System.out.println(bgstr1.readLine());
	}
}
