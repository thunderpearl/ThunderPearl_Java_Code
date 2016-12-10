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

// This is the part of Enumeration, Enummobby1 partner program

// This "EnumSet" class has to be imported to use the "range" function.
import java.util.EnumSet;
public class Enumtom1 {
    public static void main(String[] args)
    {
        for(Enummobby1 people:Enummobby1.values()) // values() is built in array
        	// and will loop through each of the constants
        {
            // people are object and we are calling method on objects here 
        	// and constructor will run and properties will be set.
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
        }
        
        System.out.println();
        System.out.println("Now we are setting the range");
        
        // Below we are giving the range of starting and ending point.
        for(Enummobby1 people:EnumSet.range(Enummobby1.scarlett, Enummobby1.candice))
        {
        	System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());	
        }
    }
}
