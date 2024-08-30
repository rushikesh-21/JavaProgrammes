package javaProgrammes;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to Reverse :");
		
		int no=sc.nextInt();
		
//		METHOD 1  
		
		int rev=0;
		int rem;
		
		while(no>0) {
			
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse Number is : "+rev);
		
		
//		METHOD 2
//		USING STRINGBuffer class
		
		int no1=45000;
		StringBuffer sb=new StringBuffer(String.valueOf(no1));
		
		StringBuffer rev1=sb.reverse();
		
		System.out.println("Reverse no is"+rev1);
		
		
//		METHOD 3
//		USING STRINGBuilder class
		
		int no2=123456;
		
		StringBuilder sd=new StringBuilder();
		sd.append(no2);
		
		StringBuilder reverseno=sd.reverse();
		
		System.out.println(reverseno);
		

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
