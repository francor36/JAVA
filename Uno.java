/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tparreglos;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char arreglo[], caracter;
        int longitud;
        System.out.println("Ingrese longitud del arreglo ");
        longitud = sc.nextInt();
        arreglo = new char[longitud];
        char caracterb;
        System.out.println("Ingrese el caracter a buscar");
        caracterb = sc.next().charAt(0);
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese el caracter " + " posicion " + i);
            caracter = sc.next().charAt(0);
            if (Character.isLetter(caracter)) {
                arreglo[i] = caracter;
            } else {
                System.out.println("No es un caracter");

            }
        }
        mostrarPar(arreglo);
        mostrarInversa(arreglo);
        System.out.println(encontrarCaracter(arreglo, caracterb));
    }

    public static void mostrarPar(char[] Par) {
        for (int i = 0; i < Par.length; i = i + 2) {
            System.out.print(Par[i] + " posicion " + "[" + i + "]" + " ");

        }

    }

    public static void mostrarInversa(char[] inv) {
        for (int i = inv.length - 1; i > 0; i--) {
            System.out.print(inv[i] + " posicion " + "[" + i + "]" + " ");

        }

    }

    public static int encontrarCaracter(char[] bus, char busc) {
        int contar = 0;
        char search;
        for (int i = 0; i<bus.length; i++) {
            if (busc==bus[i]){
                contar++;
            }

        }
        return contar;
    }

}
