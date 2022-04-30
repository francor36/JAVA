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
public class modulotp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columna, i, j;
        System.out.println("Ingrese la cantidad de filas ");
        filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas ");
        columna = sc.nextInt();
        int[][] Arrgelo = new int[filas][columna];
        CargarArreglo(Arrgelo, filas, columna);
    }

    public static void CargarArreglo(int[][] Arrgelo, int filas, int columna) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columna; j++) {
                System.out.print("MATRIS[" + i + "][" + j + "]= ");
                Arrgelo[i][j] = sc.nextInt();
            }
            mostrarArreglo(Arrgelo);
        }
    }

    public static void mostrarArreglo(int[][] Arrgelo) {
        int i, j;
        System.out.println("valores introducidos:");
        for (i = 0; i < Arrgelo.length; i++) {
            for (j = 0; j < Arrgelo[i].length; j++) {
                System.out.print(Arrgelo[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
