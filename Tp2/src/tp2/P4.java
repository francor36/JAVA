/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, i, c = 0, o=0;
        int entero[] = new int[10];
        System.out.println("Ingrese un valor entero");
        N = sc.nextInt();
        for (i = 1; c < entero.length; i++) {
            if (i % N == 0) {
                entero[o]=i;
                c++;
                System.out.println("Es multiplo de " + entero[0]+";");
            }
        }

    }
}
