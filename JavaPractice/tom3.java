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
public class tom3 {
    
    public static void main(String[] args)
    {
        // We are 
        
        jerry3 objj1 = new jerry3(); 
        
        jerry3 objj2 = new jerry3(13);
        
        jerry3 objj3 = new jerry3(11,12);
        
        jerry3 objj4 = new jerry3(11,12,13);
        
        System.out.printf("%s\n", objj1.toMilitary());
        
        System.out.printf("%s\n", objj2.toMilitary());
         
        System.out.printf("%s\n", objj3.toMilitary());
          
        System.out.printf("%s\n", objj4.toMilitary());
        
        
    }
    
}
