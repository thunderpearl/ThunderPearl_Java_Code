
// This is again POLYMORPHISM...........
/*
 * In previous example we have used polyjerry1 type argument in polydetect1 method
 * What if we have the requirement from more classes?
 * So, To overcome that problem we will make the argument with the type of super class.  
 * */
package JavaPractice;

public class polytom2 
{
	public static void main(String[] args)
	{
		// This object is made for using the method add() of polydetect2 class.
		polydetect2 duo = new polydetect2();
		
		// These objects are made for passing arguments in add() method.
		polyjerry2 obj1 = new polyjerry2();
		polymobby2 obj2 = new polymobby2();
		polycobby2 obj3 = new polycobby2();
		
		duo.add(obj1);
		duo.add(obj2);
		duo.add(obj3);
	}
}
