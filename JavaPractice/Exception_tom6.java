package JavaPractice;

public class Exception_tom6{  
	
	// Simple example to custom throw the exception...... 
	   static void validate(int age)
	   {
		 
	     if(age<18)
	    try{	 
	      throw new ArithmeticException("not valid");
		 } catch(ArithmeticException e)
		 {
			 System.out.println(e);
		 }
		 
	     else  
	      System.out.println("welcome to vote");  
	   }
	   
	   public static void main(String args[]){  
		   // validate method is a static method, hence we do not need to make it's object
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  
	}
