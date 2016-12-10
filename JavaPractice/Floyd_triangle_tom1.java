package JavaPractice;

import java.util.Scanner;

public class Floyd_triangle_tom1
{
    public static void main(String args[])
    {
	
        int range, i, j, k=1;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Range (Upto How Many Line ?) : ");
        range = scan.nextInt();
		
        System.out.print("Floyd's Triangle :\n");
        for(i=1; i<=range; i++)
        {
        	// It will just increase k by 1
            for(j=1; j<=i; j++, k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
			
        }
    }
}