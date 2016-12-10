package JavaPractice;

class Nested_Class_jerry1
{
    // How to create instance of static and non static nested class?
    public static void main(String args[]){
        
       // create instance of nested Static class
    	// NestedStaticClass is a class inside Nested_Class_tom1
       Nested_Class_tom1.NestedStaticClass printer = new Nested_Class_tom1.NestedStaticClass();
        
       // call non static method of nested static class
       printer.printMessage();   
  
       // In order to create instance of Inner class we need an Outer class 
       // instance. Let us create Outer class instance for creating 
       // non-static nested class
       Nested_Class_tom1 outer = new Nested_Class_tom1();        
       Nested_Class_tom1.InnerClass inner  = outer.new InnerClass();
        
       // calling non-static method of Inner class
       inner.display();
        
       // we can also combine above steps in one step to create instance of 
       // Inner class
       Nested_Class_tom1.InnerClass innerObject = new Nested_Class_tom1().new InnerClass();
        
       // similarly we can now call Inner class method
       innerObject.display();
    }
}
