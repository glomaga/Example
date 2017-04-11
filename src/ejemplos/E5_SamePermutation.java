package ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class E5_SamePermutation {

	public static void main(String arg[]) {
		String a = "abc";
		String b = "cbd";
		ArrayList resa = new ArrayList();
		ArrayList resb = new ArrayList();
		perm(a, resa);
		perm(b, resb);

		Collections.sort(resa);
		Collections.sort(resb);

		System.out.println(resa.equals(resb));

	}

	private static void perm(String var, ArrayList res) {
		perm("", var, res);

	}

	private static void perm(String prefix, String var, ArrayList res) {
		int n = var.length();
		if (n == 0) {
			res.add(prefix);
			// System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				perm(prefix + var.charAt(i), var.substring(0, i) + var.substring(i + 1, n), res);
			}

		}

	}
}