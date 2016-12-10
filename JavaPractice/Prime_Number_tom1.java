package JavaPractice;

import java.util.*;
class Prime_Number_tom1{  
	 public static void main(String args[]){
		 
		 System.out.println("Enter the number.....");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int n = scanner.nextInt();
		  int i,m=0,flag=0;      
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1;    
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime");    
	}  
	}  