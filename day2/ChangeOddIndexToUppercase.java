package week1.day2;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] oddtoupper = test.toCharArray();
		for (int i = 0; i < oddtoupper.length; i++) {
			
			if (i%2 == 0) {
				
				System.out.print(Character.toUpperCase(oddtoupper[i]));
				
			} else {
				
				System.out.print(oddtoupper[i]);

			}
			
		}
	}

}
