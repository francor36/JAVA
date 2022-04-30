
package evaluacione;
import java.util.Scanner;

public class Evaluacione {
    //COMIENZO DE MODULO
    public static void IPiramide(int f) //Declaro f de fila, como entero
    {
     int i, j;  //Declaro i de fila, j de columna como entero
     for(i=f; i>=1; i--) // digo que I va a ser igual a la cantidad de filas ingresadas; I si I es mayor o igual a 1 entonces a I se le resta 1
     {
         for(j=1; j<=i; j++) // J comienz en 1; si j es menor e igual a I entonces se suma uno
         {
             if(j>i) //si j mayor que i
             {
                System.out.print("  "); // hace un salto
             }
             else
             {
                 System.out.print((i-j+1) + "  "); // SINO muesta 
             }
         }
         System.out.println("");
     }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in); // Scanner sirve para ingresar datos
        int N; // Declaro la variable N como entero
        System.out.println("Ingrese cantidad de filas"); // Lanzo un mensaje
        N = sc.nextInt(); // se guarda lo que el usuario ingreso en N
        if(N>0 && N<7) // SI N MAYOR A 0 Y MENOR A 7
        {
            IPiramide(N);    // SE ENVIA N AL MODULO LLAMDO IPiramide
        }
        else // SINO
        {
            System.out.println("Error"); //Envio un mensaje de error
        }
    }
    
}
