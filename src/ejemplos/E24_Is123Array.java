package ejemplos;

public class E24_Is123Array {

	static int Is123Array(int[] a) {
		int d2 = 0, d3 = 0, d5 = 0, other = 0, res;
		if (a.length <= 1) {
			return 1;
		} else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0) {
					d2++;
				}
				if (a[i] % 3 == 0) {
					d3++;
				}
				if (a[i] % 5 == 0) {
					d5++;
				}
				if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
					other++;
				}
			}
		}
		res = d2 + d3 + d5 + other;
		if (res == a.length) {
			return 1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println(Is123Array(new int[] { 2, 3, 5, 7, 11 }));// 1
		System.out.println(Is123Array(new int[] { 2, 3, 6, 7, 11 }));// 0
		System.out.println(Is123Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));// 0
		System.out.println(Is123Array(new int[] { 2, 4, 8, 16, 32 }));// 1
		System.out.println(Is123Array(new int[] { 3, 9, 27, 7, 1, 1, 1, 1, 1 }));// 1
		System.out.println(Is123Array(new int[] { 7, 11, 77, 49 }));// 1
		System.out.println(Is123Array(new int[] { 2 }));// 1
		System.out.println(Is123Array(new int[] {}));// 1
		System.out.println(Is123Array(new int[] { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 }));// 1

	}

}
