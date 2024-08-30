package javaProgrammes;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
//		METHOD 1   
//		USING 3rd Variable
		
		int c=a;	//c=20;
		
		a=b;		//a=10;
		
		b=c;		//b=20;
		
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println();
		
//		METHOD 2
//		Without using 3rd Variable
//		USING + and - Operators
		
		int x=10,y=20;
		
		System.out.println("Before Swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=x+y;  //x=30;
		
		y=x-y;	//y=10;
		x=x-y;	//x=20;
		
		System.out.println("After Swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		System.out.println();
		
//		METHOD 3
//		Without using 3rd varibale
//		USING * and / operator
		
		int p=10,q=20;
		
		System.out.println("Before Swapping");
		System.out.println("p="+p);
		System.out.println("q="+q);
		
		p=p*q;	//p=200;
		
		q=p/q;	//q=10;
		p=p/q;	//p=20;
		
		System.out.println("After Swapping");
		System.out.println("p="+p);
		System.out.println("q="+q);
		
		
		
		
		

		
	}

}
