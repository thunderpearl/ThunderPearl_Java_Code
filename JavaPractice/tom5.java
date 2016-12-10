/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPractice;

/**
 *
 * @author Noob
 */

// This is the part of Enumeration, mobby5 is it's partner program.

import java.util.EnumSet; // This class allows the use of built in method of range.
public class tom5 {
    public static void main(String[] args)
    {
        for(mobby5 people:mobby5.values()) // values() is built in array and will loop through each of the constants in mobby5
        {
            // people are object and we are calling method on objects here.
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        
        System.out.println("\nNow for the range of constants.....\n");
        
        // This is for calling a range in array from one point to other.
        for(mobby5 people:EnumSet.range(mobby5.tony, mobby5.nicole))
        {
        	 System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        
    }
}
