package ejemplos;

public class E8_EditStrings {

	public static void main(String[] args) {
		String a = "pale";
		String b = "bake";
		System.out.println(Edit(a, b));

	}

	private static boolean Edit(String a, String b) {
		if (a.length() == b.length()) {
			// reviso las letras internas
			if (Dif(a, b,0) >= 2) {
				return false;
			}
		} else {
			// removieron o adicinaron letras
			int resta = a.length() - b.length();
			if (resta == 1 || resta == -1) {
				if (Dif(a, b,1) >= 2) {
					return false;
				}
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public static int Dif(String a, String b,int mod) {
		// reviso las letras internas
		for (int i = 0; i < a.length()&& i< b.length(); i++) {
				if (a.charAt(i) != b.charAt(i)) {
					mod++;
				}
			}
		return mod;
	}
}