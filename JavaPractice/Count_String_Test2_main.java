package JavaPractice;

public class Count_String_Test2_main {
	public static void main(String[] args)
	{
		// These are the list of items ordered at 4 different days.
		String arr1[] = {"Paneer Tikka Masala", "Dal Makhani", "Rice, Naan", "Raita, Gulab Jamun"}; 
		String arr2[] = {"Paneer Makhani", "Dal Tadka", "Pulav", "Roti", "Chhaas", "Jalebi"};
		String arr3[] = {"Paneer Thai Satay", "Mexican Rice", "Veg Makhani", "Delights Gravy", "Salad", "Papad"};
		String arr4[] = {"Suran Fry", "Matki Usal", "Plain Dal", "Steam Rice", "Papad", "Curd", "Solkadhi", "Shrikhand"};
		
		// Creating Objects so that constructor of "Count_String_Test2_helper" 
		// class will get activated 
		Count_String_Test2_helper obj1 = new Count_String_Test2_helper(arr1);
		Count_String_Test2_helper obj2 = new Count_String_Test2_helper(arr2);
		Count_String_Test2_helper obj3 = new Count_String_Test2_helper(arr3);
		Count_String_Test2_helper obj4 = new Count_String_Test2_helper(arr4);
		
		// This object below is used for calling the method "num_of_times".
		Count_String_Test2_helper obj5 = new Count_String_Test2_helper();
		
		// Calling method.
		obj5.num_of_times();
		
	}
}
