package JavaPractice;

// This is 4th type of use of this keyword in java. 
class thistom4{  
	  void m(thistom4 obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  
	  }  
	    
	  public static void main(String args[]){  
	  thistom4 s1 = new thistom4();  
	  s1.p();  
	  }  
	}  