package generics;

public class generic_main_mobby1 {
	public static void main(String[] args)
	{
		generic_implement_interface_jerry1 obj1 = new generic_implement_interface_jerry1("meliodas",112000);
		generic_implement_interface_jerry1 obj2 = new generic_implement_interface_jerry1("elizabeth",121000);
		
		obj1.getKey();
		obj1.getValue();
		
		obj2.getKey();
		obj2.getValue();
		
		System.out.printf("I am %s and my power level is %d",obj1.getKey(),obj1.getValue());
		
		// printf means printing format....
		System.out.println();
		System.out.printf("I am %s and my power level is %d",obj2.getKey(),obj2.getValue());
	}
}
