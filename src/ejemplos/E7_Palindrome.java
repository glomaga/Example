package ejemplos;

import java.lang.*;

public class E7_Palindrome {

	public static void main(String[] args) {
		String a = "malayalam";
		System.out.println(Ispalindrome(a));
	}

	private static boolean Ispalindrome(String a) {

		StringBuilder rev = new StringBuilder(a);
		rev= rev.reverse();
		System.out.println(rev);
		if (a.equals(rev.toString())) {
			return true;
		} else {
			return false;
		}
	}

}
