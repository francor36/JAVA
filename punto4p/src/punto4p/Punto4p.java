
package punto4p;

import java.util.Scanner;

public class Punto4p {


     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int promedio,i,Sseguro=0,Cseguro=0,acumDeAños = 0, Ccumpleaños=0;
        String pelotero, seguro;

        System.out.println("¿Quiere cargar un pelotero? Ingrese 'SI' o 'NO'");
        pelotero = sc.next();
        
        while (pelotero.equals("SI")) {
            System.out.println("cantidad de cumpleaños que se han realizado en el año");
            Ccumpleaños = sc.nextInt();
            
            System.out.println("Tiene seguro ? 'SI' o 'NO'");
            seguro = sc.next(); 
            if(seguro.equals("SI"))
            {
                
                
            }
            else
            {
                
            }
            
            
            promedio = acumDeAños/Ccumpleaños;
            System.out.println("El promedio de cumpleaños celebrados son: "+promedio);
            
            System.out.println("¿Quiere cargar un pelotero? Ingrese 'SI' o 'NO'");
            pelotero = sc.next();
            }

        }
     }
    

