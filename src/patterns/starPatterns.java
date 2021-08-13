package patterns;

public class starPatterns {

	public static void main(String[] args) {
		
		
		for( int i=1; i<=4 ; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i+i-1; k++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		for( int i=3; i>=1 ; i--) {
			for(int j=3 ; j>=i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=i+i-1 ; k++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
		
		



	}

}
