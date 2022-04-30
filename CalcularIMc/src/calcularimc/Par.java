package calcularimc;

import java.util.Scanner;

public class Par {

    
    public static void main(String[] args){
        
        int numero;
        boolean resultado;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese un numero entero");
        numero = sc.nextInt();
        resultado = ((numero % 2) ==0);
        System.out.println("el numero "+numero+" es par ?" +resultado);
        
    }
}
