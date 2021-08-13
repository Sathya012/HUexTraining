package solveTheQuestions;

public class reverseNumber {
	
	
	
	public static void main(String[] args) {
		 reverseTheNumber(176);
		
		
	}
public static void reverseTheNumber(int num) {
	int rev;
	while(num>0) {
	rev = num % 10;
	System.out.print(rev);
	num= num/10;
	}
}
}
