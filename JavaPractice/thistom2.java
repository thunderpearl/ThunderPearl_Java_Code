
// Use of "this" for calling constructor from constructor
// we overload the constructor
// "this" has to be used inside the constructor.
package JavaPractice;

class thistom2 {
	 
	 thistom2() {
	 this("JBT"); // "this" keyword is used to call the constructor with argument 
	 // from the constructor without argument.
	 
	 // "this" keyword must come at top inside the constructor.
	 System.out.println("Inside Constructor without parameter");
	 }
	 
	 thistom2(String str) {
	 System.out.println("Inside Constructor with String parameter as " + str);
	 }
	 
	 public static void main(String[] args) {
	 thistom2 koko = new thistom2(); // constructor without the argument will be called. 
	 }
	}