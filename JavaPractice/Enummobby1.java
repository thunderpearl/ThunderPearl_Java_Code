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
// It's partner program is Enumtom1.

// Enum is very popular to use when we have fixed set of things to deal with.
public enum Enummobby1 {
    tony("nice", "24"), // 
    scarlett("hot","24"), // enumeration are constants that are objects as well.
    gwayne("pretty","23"),
    candice("perfect","19"),
    megan("sexy","25"),
    taylor("beauty","22"); // These all are constants and hence objects.
    
    private final String desc;  // These variables are need to be final and static.
    private final String year; // Each of above objects have these 2 things.
    
    // Now making constructor
    // Those above are objects and when we pass something in object then that goes to constructor.
    // Hence, above enum properties will get assign by constructor.
    Enummobby1(String description, String birthday)
    {
         desc = description;
         year = birthday;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public String getYear()
    {
        return year;
    }
        
}
