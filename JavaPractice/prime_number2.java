package JavaPractice;

import java.util.*;
public class prime_number2
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the number......");

        int value = scn.nextInt();

        int m=0, flag=0;

        m = value/2;

        for (int i=2; i<m ; i++) {
            if (value%i==0) {
                System.out.println("Number is not a prime number");
                flag =1;
                break;
            }

            if(flag==0)
            {
                System.out.println("Number is a prime number");
            }
        }
    }
}

