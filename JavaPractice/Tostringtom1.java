

package JavaPractice;

//this toString method is used for representing the object in string form.
class Tostringtom1{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Tostringtom1(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	  
	 public static void main(String args[]){  
	   Tostringtom1 s1=new Tostringtom1(101,"Raj","lucknow");  
	   Tostringtom1 s2=new Tostringtom1(102,"Vijay","ghaziabad");  
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   System.out.println(s2);//compiler writes here s2.toString()  
	   
	   // we will get the hash code value of the above objects.
	 }  
	}  