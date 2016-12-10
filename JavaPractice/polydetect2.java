

package JavaPractice;

public class polydetect2 {

	// This time we make the array of polycobby2 type.
	private polycobby2 yoyo[] = new polycobby2[10];
	private int x=0;
	
	public void add(polycobby2 z)
	{
		yoyo[x]=z;
		System.out.println("The index of object is "+x);
		x++;
	}
}
