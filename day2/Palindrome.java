package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String x= "thanu";
		String rev = "";
		char[] xArray = x.toCharArray();
		for (int i = (xArray.length)-1; i >= 0; i--) {
			
			rev = rev + xArray[i];
		}
		
		boolean y = x.equals(rev);
		if (y) {
			
			System.out.println("The word "+rev +"is a palindrome");
			
		} else {
			System.out.println("The word"+x+ "is not a palindrome");

		}
			

			
		


}

}
