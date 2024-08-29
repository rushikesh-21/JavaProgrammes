package starPatterns;

public class EquiTraingle {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
		
		for (int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("                                ");
	
//		****
//		***
//		**
//		*
		
		for (int a=1;a<=4;a++) {
			
			for (int b=4;b>=a;b--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("                                ");
		
//		*
//		**
//		***
//		****
//		***
//		**
//		*
		
		for (int x=1;x<=4;x++) {
			
			for (int y=1;y<=x;y++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int p=1;p<=4;p++) {
			
			for (int q=3;q>=p;q--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
