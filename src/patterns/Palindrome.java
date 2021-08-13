package patterns;


	
	import java.util.*;   
	public class Palindrome 
	{  
		//Check if the string can be converted to palindrome
		public static void MakePalindrome(String str) {
		    Set<Character> Letters = new HashSet<>();
		    for ( char c : str.toCharArray() ) {
		        if ( ! Letters.remove(c) ) {
		            Letters.add(c);
		        }
		    }
		    if (Letters.size() <= 1)
		    {
		    System.out.println("Entered string is not a Palindrome, but can be converted to Palindrome");
		    
		    }
		    else
		    {
		    	System.out.println("Entered string is not a Palindrome and cannot be converted to palindrome");
		    }
		   
		}
		
		//Check if the string is a palindrome or not
		public static boolean checkPalindrome(String str) {
			String revstring = "";
			int length = str.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		    	  revstring+= str.charAt(i);  
		      if (str.equals(revstring))  
		    	  return true;
		     //    System.out.println("Entered string/number is a palindrome.");  
		      else  
		    	  return false;
		       //  System.out.println("Entered string/number isn't a palindrome.");  
		}
	   public static void main(String args[])  
	   {  
	      String str;  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string/number:");  
	      str = in.nextLine(); 
	      
	      
	      
	      if(checkPalindrome(str))
	      {
	    	  System.out.println("Entered string/number is a palindrome."); 
	      }
	      else
	      {
	    	  MakePalindrome(str); 
	      }
	      
	      
	       
	   }  
	   
	   
	}  

