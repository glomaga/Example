package ejemplos;

public class E21_JustFive {

	static int cont = 0;

	E21_JustFive() throws Exception {
		if (cont > 4) {
			throw new Exception("Supera el minino");
		} else {
			cont++;
			System.out.println(cont);
		}

	}

	public static void main(String[] args) {
		int i = 0;
		try {
			while (i < 10) {
				new E21_JustFive();
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
