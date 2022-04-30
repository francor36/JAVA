
package tp2;

import java.util.Scanner;

public class punto3 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,A,D,C,O;
        char Us[] = new char[5];
        char tipo;
        System.out.println("El tamaño del arreglo es: " +Us.length);
        
        for(i=0; i<Us.length; i++)
        {
            System.out.println("Ingrese el primer caracter " + i +" posicion");
            Us[i] = sc.next().charAt(0);
        }
        System.out.println("De que forma decea ver el arreglo en Aumento o Invertido? ");
        tipo = sc.next().charAt(0);
        switch(tipo){
            case 'A':
        for(A=0; A<Us.length; A++)
        {
            System.out.println("Arreglo["+A+"]="+Us[A]);
        }
        break;
            case 'D':
             for(O=0; O<=Us.length/2; O++)
             {
                 C=Us[i];
                 Us[i]=Us[Us.length-1];
             }
                
            for(D=0; D<Us.length; D++)
            {

            }
        break;
        }

    }
}
