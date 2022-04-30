/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        cargarArreglo(arr);

    }

    public static void cargarArreglo(int[] arr) {
        Scanner sc = new Scanner(System.in);
        String res;
        int inv[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese un valor ");
            arr[i] = sc.nextInt();
            System.out.println("Valor " + arr[i]);
        }

        for (int x = arr.length - 1, j = 0; x >= 0; x--, j++) {

            inv[j] = arr[x];

            System.out.print(inv[j] + ",");

        }
    }

}

