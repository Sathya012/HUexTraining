package patterns;

public class NumberPattern {
	
//	     1
//	    *3
// 	   *5*
//    7*9* 
	public static void main(String[] args) {
	int num=1;
	
		for(int i=0; i<=3 ; i++) {
			for(int j=2; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				if(num%2==0) {
					System.out.print("*");}				
			else {
				System.out.print(num);}
				num++;
				}			
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println("     *");
		for(int i=0; i<=4; i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("1");
				}
			System.out.print("*");
				for(int k=0; k<=i*2; k++) {
				
				
				System.out.print("1");}
							
					System.out.print("*"); 
				
						System.out.println();
			}
		System.out.println("---------");
		System.out.println("      *");
		for(int i=0; i<=4; i++) {
			
			
			for(int j=4;j>=i; j--) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			for(int k=0; k<=i*2; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}
}
		

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

