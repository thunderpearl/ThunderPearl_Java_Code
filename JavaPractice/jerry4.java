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
public class jerry4 {
    private int month;
    private int day;
    private int year;
    
    public jerry4(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
        
        
     // any time we got string like below and "this" which is reference to an object
        // then it will search for toString()
        System.out.printf("The constructor for this is %s\n", this);
    }
    
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}
