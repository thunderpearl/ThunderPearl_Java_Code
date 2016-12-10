


package JavaPractice;

import java.util.*;
import java.text.*;

public class Datetom2 {
   public static void main(String args[]) {
	   
	   // Everytime we need to pass the 'object' inside the method. 

      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
