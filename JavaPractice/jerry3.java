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
public class jerry3 {
    private int hour;
    private int minute;
    private int second;
    
    public jerry3() //This is constructor
    {
        this(0,0,0); // After this it will direct to below constructor which have 3 parameters.
    }
    
    public jerry3(int h) // This is also constructor takes 1 value
    {
        this(h,0,0);
    }
    
    public jerry3(int h, int m) // This is also contructor take 2 value
    {
        this(h,m,0);
    }
    
    public jerry3(int h, int m, int s) // Constructor taking 3 value
    {
        setTime(h,m,s);
    }
    
    public void setTime(int h, int m, int s)
    {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    
    public void setHour(int h)
    {
        hour = ((h>=0 && h<24)? h:0);
    }
    
        public void setMinute(int m)
    {
        minute = ((m>=0 && m<60)? m:0);
    }
        
        public void setSecond(int s)
    {
        second = ((s>=0 && s<60)? s:0);
    }    
        
    public int getHour()
    {
        return hour;
    }
    
    public int getMinute()
    {
        return minute;
    }
    
    public int getSecond()
    {
        return second;
    }
    
    public String toMilitary()
    {
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }
}
