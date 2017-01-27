/* Generics can be applied to class*/
package generics;

public class Generic_method_tom1 {
	public static void main(String[] args)
	{
		System.out.println(saying(23));
		System.out.println(saying("hello"));
	}
	
	public static<T> T saying(T data)
	{
		return data;
	}
}
