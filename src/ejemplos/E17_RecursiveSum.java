/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author ggallego
 */
public class E17_RecursiveSum {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum1N(n));
    }

    private static int Sum1N(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Sum1N(n - 1);
        }
    }
}
