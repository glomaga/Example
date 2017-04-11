package ejemplos;

public class E18_TestForSum {

	public static void main(String[] args) {
		int arg[] = { 5, 1, 23, 21, 17, 2, 3, 9, 22 };
		boolean res = TestForSum(arg, 22);
		System.out.println(res);
	}

	private static boolean TestForSum(int[] arg, int val) {
		boolean fin = false;
		if (arg.length > 0) {
			fin: for (int i = 0; i < arg.length; i++) {
				for (int j = 0; j < arg.length; j++) {
					for (int k = 0; k < arg.length; k++) {
						if (i != k & i != j & k != j) {
							if ((arg[i] + arg[j] + arg[k]) == val) {
								fin = true;

								System.out.println(arg[i]);
								System.out.println(arg[j]);
								System.out.println(arg[k]);
								break fin;
							}
						}
					}
				}
			}
		}
		return fin;
	}

}
