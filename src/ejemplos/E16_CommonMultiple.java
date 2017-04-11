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
public class E16_CommonMultiple {

    public static void main(String[] args) {
        //int arg1 = 10;
        // int arg2 = 15;

        int arg1 = 8;
        int arg2 = 9;

        System.out.println(HasSmallCommonMultiple(arg1, arg2));

    }

    private static boolean HasSmallCommonMultiple(int arg1, int arg2) {
        int m = Mcm(arg1, arg2);
        int a = arg1 * arg2;
        if (m < a) {
            return true;
        } else {
            return false;
        }

    }

    private static int Mcm(int arg1, int arg2) {
        int mcm = 0;
        int a = Math.max(arg1, arg2);
        int b = Math.min(arg1, arg2);
        mcm = (a / mcd(arg1, arg2)) * b;
        return mcm;
    }

    private static int mcd(int arg1, int arg2) {
        int mcd = 0;
        int a = Math.max(arg1, arg2);
        int b = Math.min(arg1, arg2);

        do {
            mcd = b;
            b = a % b;
            a = mcd;
        } while (b != 0);
        return mcd;
    }
}
