package ejemplos;

public class E9_CompressionString {

	public static void main(String[] args) {
		String cad = "aabcccccaa";
		String res = commpression(cad);
		System.out.println(cad + " " + res);
	}

	private static String commpression(String cad) {
		int cont = 1;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < cad.length(); i++) {
			if (i + 1 < cad.length()) {
				if (cad.charAt(i) == cad.charAt(i + 1)) {
					cont++;
				} else {
					res.append(cad.charAt(i));
					res.append(cont);
					cont = 1;
				}
			} else {
				res.append(cad.charAt(i));
				res.append(cont);
			}
		}
		return res.toString();
	}

}
