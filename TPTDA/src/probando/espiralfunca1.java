package probando;

import java.util.Scanner;

public class espiralfunca1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este algoritmo intenta hacer un recorrido bidimensional en Caracol
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese nxn");
        n = sc.nextInt();
        String[][] matriz = new String[n][n];
        int a = 0;
        int b = n - 1;
        int valor = 1;
        int i, j, f;

        for (j = 0; j < matriz.length; j++) {

                    //llena la primera fila
            for (i = a; i <= b; i++) {
                matriz[a][i] = valor++ + " \t";
            }

             //llenar la ultima columa por cada de la ultima fila
            for (i = a + 1; i <= b; i++) {
                matriz[i][b] = valor++ + " \t";
            }

            //llenar la parte de abajo
            for (i = b - 1; i >= a; i--) {
                matriz[b][i] = valor++ + " \t";
            }

            //llenar la columna de la izquierda de abajo hacia arriba
            for (i = b - 1; i >= a + 1; i--) {
                matriz[i][a] = valor++ + " \t";
            }

            a++;
            b--;
        }

        //recorre la matriz
        for (f = 0; f < matriz.length; f++) {
            for (i = 0; i < matriz[0].length; i++) {
                System.out.print(matriz[f][i]);
            }
            System.out.println(" ");
        }
    }
}
