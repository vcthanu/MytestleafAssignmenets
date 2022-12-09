package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String dispRev = "";
		String[] x = test.split(" ");
		for (int i = 0; i < x.length; i++) {

			if (i%2 != 0) {

				char[] rev = x[i].toCharArray();
				for (int j = rev.length-1; j >= 0; j--) {

					dispRev = dispRev+rev[j];
					dispRev = dispRev+" ";



				}
				System.out.print(" "+dispRev);
				dispRev ="";



			}
			else {
				System.out.print(""+x[i]);
			}
		}
	}

}
