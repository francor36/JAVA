/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class Tp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][],nFilas, nCol,i,j;
        System.out.println("Ingrse la cantidad de filas: ");
        nFilas = sc.nextInt();
        
        
        System.out.println("Ingrse la cantidad de columnas: ");
        nCol = sc.nextInt();
        
        matriz = new int[nFilas][nCol];
        
        for(i=0; i<nFilas; i++)
        {
            for(j=0; j<nCol; j++)
            {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz [i][j]= sc.nextInt();
            }
        }
        
        
        for(i=0; i<nFilas; i++)
        {
            for(j=0; j<nCol; j++)
            {
                System.out.print(matriz[i][j]);
            }
        System.out.println("");
        }
    } 

}
