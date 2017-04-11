package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E20_IntegerPermutation {
	static ArrayList res;

	public static void main(String[] args) {
		int var[] = { 1, 2, 3 };
		perm(var);
	}

	private static void perm(int[] var) {
		perm(new ArrayList(), var);

	}

	private static void perm(ArrayList<Integer> prefix, int[] var) {
		int n = var.length;
		if (n == 0) {
			System.out.println(prefix);
			prefix= new ArrayList();
		} else {
			for (int i = 0; i < n; i++) {
				int[] a = Arrays.copyOfRange(var, 0, i);
				int[] b = Arrays.copyOfRange(var, i + 1, n);
				int[] both = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
				prefix.add(var[i]);
				perm(prefix, both);
			}

		}

	}
}
