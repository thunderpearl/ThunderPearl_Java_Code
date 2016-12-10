

package JavaPractice;

// this toString method is used for representing the object in string form.
class Tostringtom2{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Tostringtom2(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }  
	 public static void main(String args[]){  
	   Tostringtom2 s1=new Tostringtom2(101,"Raj","lucknow");  
	   Tostringtom2 s2=new Tostringtom2(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()
	   
	   // we have override the toString() method, hence we will 
	   // be able to print the assigned value by constructor.
	 }  
	} 
