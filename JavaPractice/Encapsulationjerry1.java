package JavaPractice;

public class Encapsulationjerry1 {

	public static void main(String[] args)
	{
		System.out.println("Now, we are gonna test our Encapsulation");
		
		Encapsulationtom1 obj1 = new Encapsulationtom1();
		Encapsulationtom1 obj2 = new Encapsulationtom1();
		Encapsulationtom1 obj3 = new Encapsulationtom1();
		
		obj1.setDesignation("Lead Designer");
		obj2.setEmployeeId(23452);
		obj3.setEmployeeName("Meliodas");
		
		System.out.println("The designation is "+ obj1.getDesignation());
		System.out.println("The designation is "+ obj2.getEmployeeId());
		System.out.println("The designation is "+ obj3.getEmployeeName());
		
		
		/*
		 * Encapsulationtom1 obj1 = new Encapsulationtom1();
		   Encapsulationtom1 obj2 = new Encapsulationtom1();
		   
		   
		   obj1.setDesignation("Lead Designer");
		   obj1.setEmployeeId(23452);
		   obj1.setEmployeeName("Meliodas");
			
	       System.out.println("The designation is "+ obj2.getDesignation());
		   System.out.println("The designation is "+ obj2.getEmployeeId());
		   System.out.println("The designation is "+ obj2.getEmployeeName());
			 * */
		
		/*
		 * This above code will give null value
		 * because obj1 is used for setting the values
		 * but when we are getting the values using obj2 then values are 
		 * not set for obj2 bcoz obj1 and obj2 are unaware of each other.
		 * */
		
	}
}
