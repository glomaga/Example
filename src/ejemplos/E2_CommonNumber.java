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
public class E2_CommonNumber {
    public static void main(String[] args) {
        int a[]= {13,27,35,40,49,55,59};
        int b[]= {17,35,39,40,55,58,60};
        Common(a,b);
    }

    private static void Common(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]){
                    System.out.println("igual: " + a[i]);
                }
            }
        }
    }
   
}
