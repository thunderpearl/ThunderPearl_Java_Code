

package JavaPractice;

// INTERFACE is a collection of abstract methods
// An INTERFACE works as abstract class 

/*
 * Writing an interface is similar to writing a class.
 * But a class describes the attributes and behaviours of an object. 
 * And an interface contains behaviours that a class implements.
 * */
public interface Interfacejerry1 
{ 
	// INTERFACE methods are implicitly ABSTRACT.
	public void display();
	public void saying();
	
	// Methods in interface are implicitly public.
	// All the variables and constant defined are final or static 
	// If a class implementing interface do not override all abstract methods, 
	// then that class itself must be declared abstract.
	
	
	/*
	 * INTERFACE is better because a class can implement multiple INTERFACES
	 * whereas a class can inherit only one ABSTRACT class
	 * */
	
	// One benefit of ABSTRACT class is that we only need to override 
	// ABSTRACT methods
	
	// Overall an INTERFACE is better over ABSTRACT Class.
	

}
