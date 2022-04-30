package modulos;

/**
 *
 * @author mag15
 */
import java.util.Scanner;
public class Modulos {
    public static void piramideA(int num) {  //modulo de una piramide
        //
        int fila, col;
        for (fila = 1; fila <= num; fila++){
            for (col = 1; col <= fila; col++){
                System.out.print(fila + "  ");
            }
            System.out.println(" ");
        }
    }
    public static void piramideB(int num) {
        //
        int fila, col;
        for (fila = 1; fila <= num; fila++){
            for (col = 1; col <= fila; col++){
                System.out.print(col + "  ");
            }
            System.out.println(" ");
        }
    }
    public static void piramideC(int num) {
        //
        int fila, col;
        for (fila = 1; fila <= num; fila++){
            for (col = fila; col <= (fila*fila); col = col + fila){
                System.out.print(col + "  ");
            }
            System.out.println(" ");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        En este algoritmo indicamos el valor de la pirÃ¡mide y el tipo que queremos 
        */
        Scanner sc = new Scanner(System.in);
        char tipo;
        int n;
        
        System.out.println("Ingrese el tipo de piramide: A. B. C.");
        tipo = sc.next().charAt(0);
        System.out.println("Ingrese el valor de la piramide");
        n = sc.nextInt();
        
        if (tipo == 'A') {
            piramideA(n);
        }
        else {
            if (tipo == 'B') {
                piramideB(n);
            }
            else {
                piramideC(n);
            }
        }
    }
    
}