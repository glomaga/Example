package ejemplos;

public class E4_Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = "hola";
		String a = "casa";
		UniqueChar(a);
	}

	private static void UniqueChar(String a) {
		boolean res = false;
		char temp = ' ';
		inicio: for (int i = 0; i < a.length(); i++) {
			temp = a.charAt(i);
			for (int j = 1; j < a.length(); j++) {
				if(i!=j){
				if (temp == a.charAt(j)) {
					res = true;
					break inicio;
				}}
			}
		}
		if (res == true) {
			System.out.println("NO UNICO");
		} else {
			System.out.println("UNICO");
		}
	}

}
