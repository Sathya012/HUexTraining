package solveTheQuestions;

public class missingNumber {
	
	
	public static int findMissingNumber(int num[], int totalCount) {
		int expectedSum =( totalCount * (totalCount +1)/2);
		int actualSum = 0;
		for(int e : num) {
			actualSum+=e;
		}
			return expectedSum - actualSum ;
		
		
		
	}

	public static void main(String[] args) {
		int num[]= {1,2,3,5,6,7,8};
	int n=	findMissingNumber(num, 8);
		System.out.println(n);
	}
}
