
package javaapplication25;

import java.util.Scanner;
public class JavaApplication25 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cadena;
        int i;
        System.out.println("Ingrese una cadena de caracter");
        cadena = sc.next();
        for(i=0; i<cadena.length(); i++)
        {
            System.out.println("posicion "+ i +" :"+cadena.charAt(i) );
            
        }
        
        
        
    }
    
}
