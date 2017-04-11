package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class E10_IsRotation {

	static boolean checkRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		if ((s1+s1).contains(s2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkRotation("waterbottle","erbottlewat"));
		
	

	}

}
