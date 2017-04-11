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
public class E14_DisplayArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a[] = {"Bob", "Steve", "Sue"};
        DisplayArray(a);

    }

    static void DisplayArray(String[] a) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            b.append(a[i]);
            if (i < a.length - 1) {
                b.append(",");
            }
        }
        System.out.println(b.toString());
    }

}
