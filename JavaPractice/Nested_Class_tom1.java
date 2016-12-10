package JavaPractice;

/* Java program to demonstrate how to implement static and non-static
classes in a java program. */
class Nested_Class_tom1{
private static String msg1 = "I am a static message";
private String msg2 = "I am the non static message";
 
// Static nested class
public static class NestedStaticClass{
   
    // Only static members of Outer class is directly accessible in nested 
    // static class 
    public void printMessage() {

      // Try making 'message' a non-static variable, there will be 
      // compiler error  
      System.out.println("Message from nested static class: " + msg1);
     
      // we can not access the non-static members of outer class.
      // System.out.println("2nd Message from the nested class: "+ msg2);
    }
 }
 
 // non-static nested class - also called Inner class
 public class InnerClass{
     
    // Both static and non-static members of Outer class are accessible in 
    // this Inner class
    public void display(){
       System.out.println("Message from non-static nested class: "+ msg1);
       System.out.println("@nd message from the nested class: "+ msg2);
    }
 }
} 
