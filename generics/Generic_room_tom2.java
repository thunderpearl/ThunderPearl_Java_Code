package generics;

// Without the class type of T below get method will give  compile time error

// Generics can be understood at compile time only. At run time java will only deal in 
 // primitive data types.
public class Generic_room_tom2<T> 
{
	private T var1;
	private T answer;
	
	// Constructor for the generic class.
	
	// We cannot call the constructor for generic type. without giving some parameter.
	public Generic_room_tom2(T var1)
	{
		this.var1 = var1;
	}
//	
	public void set(T var1)
	{
		this.var1 = var1;
	}
	
	public T get()
	{
		return var1;
	}
}
