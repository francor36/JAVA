
package calcularimc;

import java.util.Scanner;

public class CalcularIMc {


    public static void main(String[] args) {
        
        //calcular el indice de masa corporal
        double peso, altura, imc;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calcular el IMC");
        
        System.out.println("Ingrese el peso de la persona");
        
        peso = sc.nextDouble();
        
        System.out.println("Ingrese la altura de la persona");
        
        altura = sc.nextDouble();
        
        imc = peso/ Math.pow(altura,2);
        
        System.out.println("el imc es "+imc);
        
 
        
    }
    
}
