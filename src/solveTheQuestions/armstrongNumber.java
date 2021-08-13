package solveTheQuestions;

public class armstrongNumber {

	
	public static void armstrong(int n) {
		
		
		int r=0,cube=0,t;
		t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			cube=cube+(r*r*r);
			
		}
		if(t==cube) {
			System.out.println("an armstrongnumber");}
		else {
			System.out.println("not an armstrongnumber");
		}
	}
	

	
	public static void main(String[] args) {
		
		
		armstrong(371);
	}

}
