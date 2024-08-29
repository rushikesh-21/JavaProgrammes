package starPatterns;

public class Pyramid {

	public static void main(String[] args) {
		
//		 *
//		* *
//	   * * *
//	  * * * *
		
		for (int i=1;i<=4;i++) {
			
			for (int j=3;j>=i;j--) {
				
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		System.out.println("                                     ");
		
//		Method 2
		
		for (int a=1;a<=4;a++) {
			
			for (int b=3;b>=a;b--) {
				
				System.out.print(" ");
			}
			for (int c=1;c<=a;c++) {
				
				System.out.print("*");
			}
			
			for (int d=2;d<=a;d++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
