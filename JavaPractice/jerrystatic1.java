

package JavaPractice;

public class jerrystatic1 {
	// We are defining the private variables here.
	private String fname;
	private String lname;
	private static int members=0; // this is a static variable which will be 
	// shared by every member.
	
	
	// This is the constructor of jerrystatic1.
	public jerrystatic1(String fn, String ln) 
	{
		fname = fn;
		lname = ln;
		members++;
		System.out.printf("Constructor for %s %s is %d\n",fname, lname, members);
	}

	public String getFirst()
	{
		return fname;
	}
	
	public String getLast()
	{
		return lname;
	}
	
	public static int getMembers()
	{
		return members;
	}
}
