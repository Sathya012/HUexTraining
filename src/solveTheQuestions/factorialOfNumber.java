package solveTheQuestions;

public class factorialOfNumber {
	
	public static void factorial(int n) {
		int fact=1;
		
		if(n==0) {
			System.out.println("1");}
		else {
		
		for(int i=1;i<=n; i++) {
			fact=fact*i;}
		
		System.out.println(fact);
		}
		
	}

	public static void main(String[] args) {
		
		factorial(0);
	}

}
