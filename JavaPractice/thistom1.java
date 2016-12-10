

//example of this keyword  
package JavaPractice;

class thistom1{  
    int id;  
    String name;  
      
    thistom1(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
   // void display(){System.out.println(this.id+" "+this.name);}  
    void display(){System.out.println(id+" "+name);} 
    public static void main(String args[]){  
    thistom1 s1 = new thistom1(111,"Karan");  
    thistom1 s2 = new thistom1(222,"Aryan");  
    s1.display();  
    s2.display();  
}  
}  