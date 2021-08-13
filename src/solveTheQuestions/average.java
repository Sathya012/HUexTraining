package solveTheQuestions;

public class average {

	public static void main(String[] args) {
		
		int arr[]= { 1,2,3,4,5,6,7};
		
		int totalCount=0;
		for(int i : arr) {
			totalCount+=i;
			
			
		}
		
     System.out.println(totalCount/arr.length);
	}

}
