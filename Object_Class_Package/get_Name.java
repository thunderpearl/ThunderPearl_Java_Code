package Object_Class_Package;

public class get_Name {

   public static void main(String[] args) {

     // returns the Class object associated with this class
     get_Name cl = new get_Name();
     Class c1Class = cl.getClass();

     // returns the name of the class
     String name = c1Class.getName();
     System.out.println("Class Name = " + name);
   }
}
