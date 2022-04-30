/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;


public class valoresIntercambiados 
{
    public static String array(char []tipo) {
        int i;
        String cadena="";
        char letra;
      for(i=tipo.length-1; i>=0; i--)
        {
            letra = tipo[i];
            cadena = cadena + letra;
        }
      return cadena;
    }

    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    int i;
    char resp;

    char Us[] = new char[5];
    System.out.println("El tamaño del arreglo es: " +Us.length);
        for(i=0; i<Us.length; i++)
        {
         System.out.print("Ingrese el valor: " +(i+1)+" posicion:");
         Us[i] = sc.next().charAt(0);
        }
        System.out.println("Quiere ver los valores normal(n) o invertidos(i) ?");
        resp = sc.next().charAt(0);
        switch(resp){
            case 'n':
         for(i=0; i<Us.length; i++)
        {
         System.out.print(Us[i]+"-");
        }
        break;
        case 'i':
            System.out.println("El arreglo invertido es "+array(Us));   
        break;
            
        }
        
               
    }
   
    
}
