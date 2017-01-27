package JavaPractice;

public class Java_Runtime_class_tom1 {
	public static void main(String[] args) throws Exception
	{
		Runtime.getRuntime().exec("notepad");
		// Runtime.getRuntime().exec("sublime");
		
		// Runtime.getRuntime().exec("C:\\Windows\\System32 -s -t 0");
		
		// This below line will give the number of processors available in the computer.
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().freeMemory());
	}
}
