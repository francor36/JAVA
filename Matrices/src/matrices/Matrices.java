
package matrices;

import java.util.Scanner;
public class Matrices {


    public static void main(String[] args) 
    {
     int j, contador, filas, columnas, i;
     contador = 0;
     
     
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Ingrese columnas "); //se ingresan las columnas
     columnas = sc.nextInt();
     System.out.print("Ingrese filas ");//se ingresan las filas
     filas = sc.nextInt();
     
     int numeros[][]=new int[filas][columnas]; // declaracion de matriz, [filas]: son la cantidad que ingresa el usuario, [columnas]: son las que va a ingresar el usuario
     
     for(i=0; i<filas; i++){ // i es fila i inicia en cero, luego i dice que se va a hacer hasta que se menor a fila, luego se va a sumar
         for(j=0; j<columnas; j++) // j es columna j inicia en cero, luego j dice que se va a hacer hasta que se menor a fila, luego se va a sumar
         {
             numeros[i][j]= contador; // numeros va a ser igual a contador;
             contador++; //contador se va a sumar en uno;
             
             System.out.print("["+numeros[i][j]+"]");   //se muestra corchete la matriz osea numero se cierra corchete
         }
         System.out.println(""); // este se utiliza para hacer un salto de linea
     
     
     }

    }
    
}
