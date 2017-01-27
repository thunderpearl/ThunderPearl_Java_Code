package anonymous_class;

public class Anonymous_jerry1{
	public static void main(String[] args)
	{
		/* here, a class is created but it's name is decided by compiler which extends 
			the Anonymous_tom1 class and provides the implementation of the eat() method.
		*/ 
		
		/*This anonymous class will extends the Anonymous_tom1 class and provides 
		 * the implementation of the eat() method.
		 * */
		Anonymous_tom1 obj1 = new Anonymous_tom1(){
			void eat()
			{
				System.out.println("Nice Fruits.....");
			}
		};
		
		obj1.eat();
	}
	
	/*
	 * static class TestAnonymousInner$1 extends Anonymous_tom1.  
		{  
   TestAnonymousInner$1(){}  
   void eat()  
    	{  
        	System.out.println("nice fruits");  
    	}  
}  
	 * */
	
	/*
	 * Anonymous classes enable you to make your code more concise. They enable you to
	 * declare and instantiate a class at the same time. They are like local classes 
	 * except that they do not have a name. Use them if you need to use a local class 
	 * only once.
	 * */
	
	// =================================================================================
	
	/*
	 * While local classes are class declarations, anonymous classes are expressions,
	 * which means that you define the class in another expression.
	 * */
}
