

// Multiple catch for different type of Exceptions

// At a time only one Exception is occurred 
// and at a time only one catch block is executed.

// All catch blocks must be ordered from 
// most specific to most general i.e. catch for 
// ArithmeticException must come before catch for Exception .
// It means that most specific exception will be given highest priority.

package JavaPractice;

public class Exceptiontom4{  
	  public static void main(String args[]) throws ArithmeticException{  
	     
		  throw ArithmeticException(); 
	    int a[]=new int[5];  
	    a[5]=30/0;  
	    
//	   catch(ArithmeticException e){System.out.println("task1 is completed");}  
//	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
//	   catch(Exception e){System.out.println("common task completed");}  
//	  
	   System.out.println("rest of the code...");
	   
	   
	 }  
	}  
