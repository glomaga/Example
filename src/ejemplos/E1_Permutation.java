package ejemplos;

public class E1_Permutation {

	public static void main(String[] args) {
		String var = "abc";
		perm(var);
	}

	private static void perm(String var) {
		perm("", var);

	}

	private static void perm(String prefix, String var) {
		int n = var.length();
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				perm(prefix + var.charAt(i), var.substring(0, i) + var.substring(i + 1, n));
			}

		}

	}

}
