package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Chidambaram";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			//System.out.println(charArray[i]);
			System.out.print(charArray[i]);
			
		}
	}

}
