/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ggallego
 */
public class E15_Occurrences {

    public static void main(String[] args) {
        char a[] = {'c', 'e', 'e', 'e', 'a', 'q'};
        Occurrence(a);
    }

    static void Occurrence(char[] a) {
        Arrays.sort(a);
        int c = 0, y = 0;
        int i = 0;
        while (i < a.length) {
            if (i < a.length - 1) {
                if (a[i] == a[i + 1]) {
                    c++;
                } else {
                    Printas(a[i], c);
                    c = 0;
                }
            } else {
                Printas(a[i], c);
            }
            i++;
        }
    }

    private static void Printas(char object, int c) {
        StringBuilder res = new StringBuilder();
        res.append(object);
        res.append("-");
        for (int i = 0; i <= c; i++) {
            res.append("*");
        }
        System.out.println(res);

    }

}
