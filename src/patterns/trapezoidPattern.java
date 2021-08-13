package patterns;

public class trapezoidPattern {

	public static void main(String[] args) {
		
				System.out.print("       * * * * * * * * *\n");		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
		}
			System.out.print("*");
			for(int k=0; k<=4; k++) {
				System.out.print("   ");
			}
			
			System.out.print("*");
			System.out.println();
	}
		System.out.print("* * * * * * * * *");

	}
}
