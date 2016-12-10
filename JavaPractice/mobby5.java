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
public enum mobby5 {
    tony("nice", "24"),
    scarlett("hot","24"), // enumeration are constants that are objects as well.
    gwayne("pretty","23"), // These all are constants and hence objects.
	nicole("italian","13"),
	candy("different","14"),
	erin("iwish","16");
    
    private final String desc;
    private final String year; // Each of above objects have these 2 things.
    
    // Now making constructor
    mobby5(String description, String birthday)
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
