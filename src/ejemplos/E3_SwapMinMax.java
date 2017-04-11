/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Arrays;

/**
 *
 * @author ggallego
 */
public class E3_SwapMinMax {
	public static void main(String[] args) {
		int a[] = { 1, 0, 6, 7, 9 };
		Swap(a);
	}

	private static void Swap(int[] a) {
		System.out.println(Arrays.toString(a));
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[min]) {
				min = i;
			}
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[max]) {
				max = i;
			}
		}
		int tem = a[min];
		a[min] = a[max];
		a[max] = tem;

		System.out.println(Arrays.toString(a));

	}
}
