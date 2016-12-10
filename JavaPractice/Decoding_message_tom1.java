package JavaPractice;

import java.io.*;
import java.util.*;
public class Decoding_message_tom1{

     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("I:\\Programming\\Java Tutorials\\sample.txt"));
        
        // creating Link List 
        LinkedList<Decoding_node_tom1> list1 = new LinkedList<Decoding_node_tom1>();

        // checking if line is not empty         
        String line;
		while ((line = br.readLine()) != null)
         {
			// splitting the line with delimiter and storing in an array. 
             String data[] = line.split(",");
//             
//             System.out.println(data[0]);
//             System.out.println(data[1]);
//             System.exit(0);
             
             // Object creation for passing the values in constructor of Decoding_node_tom1 class.
            Decoding_node_tom1 obj1 = new Decoding_node_tom1(data[0], data[1]);
            
           // inserting data as data[0] and data[1] in LinkedList object.
             list1.add(obj1);
         }
         
//		Iterator itr1 = list1.iterator();
//		
//		while(itr1.hasNext())
//		{
//			Decoding_node_tom1 var1 = (Decoding_node_tom1)itr1.next();
//			
//			System.out.println("Encode value is " + var1.encode_value + " Decode value is " + var1.decode_value);
//			
//		}
//		System.exit(0);
//		
		
         // scanner class to scan what user has input
         Scanner scn = new Scanner(System.in);
        
         System.out.println("Enter Your encoded message.....");
         
        // Storing entered Input from user in str1 variable
         String str1 = scn.nextLine();
         
         // Iterating through list1
         Iterator itr = list1.iterator();
         
         
         // This will run until we have next values in iterator.
         while(itr.hasNext())
         {
        	 Decoding_node_tom1 var = (Decoding_node_tom1)itr.next();
        	
        	 // Checking if the value entered is equal to values in sample.txt file
        	 if((var.encode_value).equals(str1))
        	 {
        		 System.out.println("Decode value for " + var.encode_value + " is " + var.decode_value);
        	 }
//        	 else
//        	 {
//        		 System.out.println("Entered Encode value is Invalid.... ");
//        		 System.exit(0);
//        	 }
         }
         
     }
}
