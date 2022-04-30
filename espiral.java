package probando;

import java.util.Scanner;

public class espiral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas, valor, n;

        System.out.println("Ingrese nxn");
        n = sc.nextInt();
        valor = 1;
        filas = 0;
        columnas = n - 1;
        String[][] matriz = new String[n][n];

        for(int j=0; j<=matriz.length; j++){
            
        //llena la primera fila
        for (int i=filas; i<=columnas; i++) {
            matriz[filas][i]= valor++ + " \t";
        }
        //llenar la ultima columa por cada de la ultima fila
        for (int i = filas; i<=columnas; i++) {
            matriz[i][columnas]= valor+++ " \t";
        }

        //llenar la parte de abajo
        for (int i = columnas-1; i >= filas; i--) {
            matriz[columnas][i]= valor+++ " \t";
        }
        
        //llenar la columna de la izquierda de abajo hacia arriba
        for (int i = columnas-1; i>=filas+1; i--) {
            matriz[columnas][i]= valor+++ " \t";
        }
        
        filas++;
        columnas++;
        
        }
        
        for(int f = 0; f <matriz.length; f++) {
            for (int i = 0; i <matriz[f].length; i++) {
                System.out.println(matriz[f][i]);
                
            }
            System.out.println(" ");
        }
    }
}
