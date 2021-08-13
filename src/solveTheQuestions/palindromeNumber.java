package solveTheQuestions;

public class palindromeNumber {
	
	
	public static void palindrome(int n) {
		
		int r=0,sum=0,t;
		t=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(t ==sum) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		
	}
	
	public static void main (String[] args) {
		
		palindrome(121);
		
	}
	

}
