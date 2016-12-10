package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Count_String_Test1 {
	public static void main(String[] args)
	{
		String arr1[] = {"Paneer Tikka Masala", "Dal Makhani", "Rice, Naan", "Raita, Gulab Jamun"}; 
		String arr2[] = {"Paneer Makhani", "Dal Tadka", "Pulav", "Roti", "Chhaas", "Jalebi"};
		String arr3[] = {"Paneer Thai Satay", "Mexican Rice", "Veg Makhani", "Delights Gravy", "Salad", "Papad"};
		String arr4[] = {"Suran Fry", "Matki Usal", "Plain Dal", "Steam Rice", "Papad", "Curd", "Solkadhi", "Shrikhand"};
		
		// Array list can have repeatitive values.
		List<String> listt = new ArrayList<String>();
		
		Collections.addAll(listt,arr1);
		Collections.addAll(listt, arr2);
		Collections.addAll(listt, arr3);
		Collections.addAll(listt, arr4);
		
		System.out.println(listt);
		
		
		for(String temp:listt)
		{
			System.out.println(temp +": number of occurence is--> "+ Collections.frequency(listt, temp));
		}
		
		System.out.println();
		System.out.println("Maximum occurence is of "+"'"+Collections.max(listt)+"'"+ " with frequency "+ Collections.frequency(listt,Collections.max(listt)));
		
	}
}
