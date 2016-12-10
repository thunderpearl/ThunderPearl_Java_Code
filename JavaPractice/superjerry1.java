package JavaPractice;

public class superjerry1 extends supermobby1{
int number = 18;

public superjerry1()
{
	super(); // here we are invoking the constructor of super class.
	System.out.println("I am the constructor of child class");
}

public void display()
{
	super.display(); // we are calling super class display method
	System.out.println("I am the number variable of parent class " +super.number);
	}
}
// same way we can access super class instance variable as well 
// super.variable