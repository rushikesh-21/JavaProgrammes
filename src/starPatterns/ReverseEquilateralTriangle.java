package starPatterns;

public class ReverseEquilateralTriangle {

	public static void main(String[] args) {
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		//rows 
		for (int i=1;i<=5;i++) {
			
			//spaces
			for (int j=4;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			//stars
			for (int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			
			//next line
			System.out.println();
			
		}
		
		System.out.println("                                       ");
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		for (int a=1;a<=5;a++) {
			
			//spaces
			for (int b=1;b<=a;b++){
				
				System.out.print(" ");
			}
			
			//stars
			for (int c=5;c>=a;c--) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		System.out.println("                                       ");
		
//		    *
//		   **
//		  ***
//		 **** 
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		
		for (int p=1;p<=5;p++) {
			
			for (int q=4;q>=p;q--) {
				
				System.out.print(" ");
			}
			
			for (int r=1;r<=p;r++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int x=2;x<=5;x++) {
			
			for(int y=2;y<=x;y++) {
				
				System.out.print(" ");
			}
			
			for(int z=5;z>=x;z--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
