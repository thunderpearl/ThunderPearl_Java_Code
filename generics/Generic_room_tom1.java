package generics;

// We made type as Object because Object is the super class of all the classes.
 // so we wanted to make a case for all the possibilities.
public class Generic_room_tom1 {
	private Object object;
	
	public void set(Object object)
	{
		this.object = object;
	}
	
	public Object get()
	{
		return object;
	}
}
