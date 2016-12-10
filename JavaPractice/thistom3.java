
// "this" keyword can also be used inside Methods to call another Method from same Class.

package JavaPractice;

class thistom3 {
	 
	 public static void main(String[] args) {
	 thistom3 obj = new thistom3();
	 obj.methodTwo();
	 }
	 void methodOne(){
	 System.out.println("Inside Method ONE");
	 }
	 
	 void methodTwo(){
	 System.out.println("Inside Method TWO");
	 this.methodOne();// same as calling methodOne()
	 }
	}
