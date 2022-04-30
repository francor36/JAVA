
package equivalencia;

import java.util.Scanner;

public class Equivalencia {


    public static void main(String[] args){
     double grAz, tazaG, tazaP, cucharaG, cucharaP;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Ingrese gramos de azucar");
     grAz = sc.nextDouble();
     
     tazaG = grAz/120;
     
     tazaP = grAz/70;
     
     cucharaG = grAz/18;
     
     cucharaP = grAz/7;
     
     System.out.println("La taza grande equivale a "+ tazaG);
     System.out.println("La taza pequeña equivale a "+ tazaP);
     System.out.println("La cuchara grande equivale a "+ cucharaG);
     System.out.println("La cuchara pequeña equivale a "+ cucharaP);
        
        
        
    }
    
}
