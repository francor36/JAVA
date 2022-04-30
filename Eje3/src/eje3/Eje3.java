package eje3;
import java.util.Scanner;

public class Eje3{
    public static void piramide(int num){
        int col, fila;
        for (fila = num; fila >= 1; fila--){
            for (col = fila; col >= 1; col--) {
                if ((fila % 2 == 1)){
                    System.out.print(convertir(col)+ "  ");
                }
                else {
                   System.out.print(col+ "  ");
                } 
            }
            
        System.out.println(" ");    
        }
    }
    public static char convertir(int num) {
        char res = ' ';
        switch (num) {
            case 1: res = 'A';
            break;
            case 2: res = 'B';
            break;
            case 3: res = 'C';
            break;
            case 4: res = 'D';
            break;
            case 5: res = 'E';
            break;
            case 6: res = 'F';
            break;
        }
        return res;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int filas;
        
        System.out.println("Ingrese la cantidad de filas de la piramide");
        filas = sc.nextInt();
        
        if(filas>0 && filas<7)
        {
            piramide(filas);
        }
        else{
            System.out.println("Error");
        }
  }
    
}