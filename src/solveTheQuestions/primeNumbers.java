package solveTheQuestions;
//import java.util.Scanner;  
public class primeNumbers {
	
	
	

	public static void main(String[] args) {
		
	System.out.println( prime(25));
	range(20);
			}
	
	
	public static boolean prime (int n) {
		
		if(n>=2) {
			for(int i=2; i<n; i++) {
				if(n%i==0) {
					return false;
			}
		
			}
		}
		
		else
			{
				return false;
			}
		
			
			
		return true;

	}	
	
	public static void range(int n) {
		for(int i=2; i<=n; i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}
		
	}
}
	
	
		

		

	


