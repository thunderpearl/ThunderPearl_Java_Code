package generics;

public class Non_generic_class {
	private Object object;
	
	// We could have used constructor here as well.
	public void set(Object object)
	{
		this.object = object;
	}
	
	public Object get()
	{
		return object;
	}
}
