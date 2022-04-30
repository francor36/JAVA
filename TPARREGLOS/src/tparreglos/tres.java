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
public class tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columna, i, j;
        String frase;
        System.out.println("Ingrese la frase");
        frase = sc.nextLine();
        System.out.println("Ingrese la cantidad de filas ");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas ");
        columna = sc.nextInt();
        String[][] Arrgelo = new String[filas][columna];
        CargarArreglo(Arrgelo, filas, columna, frase);
    }

    public static void CargarArreglo(String[][] Arrgelo, int filas, int columna, String frase) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        String[] sacar = frase.split(" ");
        for (String palabra : sacar) {
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columna; j++) {
                    System.out.print("MATRIS[" + i + "][" + j + "]= ");
                    Arrgelo[i][j] = palabra;
                    System.out.println(palabra);
                }
            }
        }

    }
}
