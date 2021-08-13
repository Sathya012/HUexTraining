package patterns;

import java.util.Scanner;

public class Hollowsquare {
	
	public static void printPattern(int n) {
		for(int i=0;i<n;i++)
	      {
	          
	          for(int j=0;j<n;j++)
	          {
	              
	              if(i==0 || i==n-1 || j==0 || j==n-1 || i == j || j == n-i-1)
	              {
	              System.out.print("*");
	              }
	              
	              else
	              System.out.print(" ");
	          }
	          System.out.println();
	      }
	}
	     
	 public static void main(String args[]) 
	  {
		 
		 int n;  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a number:");  
	      n = in.nextInt(); 
	      printPattern(n);
	      
	      
	  }
	}

