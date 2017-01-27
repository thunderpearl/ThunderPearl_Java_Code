package JavaPractice;

public class Getters_tom2 {
	String name;
	int age;
	
	Getters_tom2()
	{
		super();
	}
	
	Getters_tom2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return getName() + " Age is: " + getAge();
	}
}
