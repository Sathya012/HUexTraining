package patterns;

import java.util.Scanner;

public class LCMOfTwoNumbers
{
	public static void findLCM(int num1,int num2) {
		int gcd = 1;
	      for(int a = 1; a <= num1 && a <= num2; ++a)
	      {
	         if(num1 % a == 0 && num2 % a == 0)
	         {
	            gcd = a;
	         }
	      }
	      int lcm = (num1 * num2) / gcd;
	      System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm + ".");
	}
	
   public static void main(String[] args)
   { 
	   
	   int num1,num2;  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a number:");  
	      num1 = in.nextInt(); 
	      
	      System.out.println("Enter a number:");  
	      num2 = in.nextInt(); 
	      findLCM(num1,num2);
	      
	   
   }
}