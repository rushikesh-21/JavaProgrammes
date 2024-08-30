package javaProgrammes;

public class ReverseStrings {

	public static void main(String[] args) {

//		METHOD 1

		String name = "Rishi";

		String rev = "";

		/*
		 * for(int i=name.length()-1;i>=0;i--) {
		 * 
		 * rev=rev+name.charAt(i); }
		 * 
		 * System.out.println(rev);
		 */

//		METHOD 2
//		toCharArray

		/*
		 * char c[]=name.toCharArray();
		 * 
		 * for (int i=c.length-1;i>=0;i--) {
		 * 
		 * rev=rev+c[i];
		 * 
		 * } System.out.println(rev);
		 */

//		METHOD 3
//		USING StringBuffer class

		/*StringBuffer sb = new StringBuffer(name);

		System.out.println(sb.reverse());*/

//		METHOD 4
//		USING StringBuilder class

		StringBuilder sb = new StringBuilder(name);

		StringBuilder reverse=sb.reverse();
		
		System.out.println(reverse);
	}

}
