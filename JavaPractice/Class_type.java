package JavaPractice;

public class Class_type
{
//Hideously slow program! Can you spot the object creation?
public static void main(String[] args) {
	
	// just to check the max value of integer.
	System.out.println(Integer.MAX_VALUE);
	
	
 Long sum = 0L;
 for (long i = 0; i < Integer.MAX_VALUE; i++) {
      sum += i;
 }
 System.out.println(sum);
 
 // Just testing it with integer.
 for(int i=0; i<Integer.MAX_VALUE; i++)
 {
 	sum+=i;
 }
 System.out.println(sum);
	}
}
/*
 *This program gets the right answer, but it is much slower than it should be, 
 *due to a one-character typographical error. The variable sum is declared as a 
 *Long instead of a long, which means that the program constructs about 2^31 
 *unnecessary Long instances (roughly one for each time the long i is added to the Long sum). 
 *Changing the declaration of sum from Long to long reduces the runtime from 43 seconds to 6.8 seconds 
 *on my machine. 
 * */
 