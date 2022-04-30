package piramidede;

import java.util.Scanner;

public class Piramidede {
    
    
    public static char convert(int i) {
        //conversor de numeros a letras
        char res = 0;
        switch (i) {
            case 1: res = 'A'; break;
            case 2: res = 'B'; break;
            case 3: res = 'C'; break;
            case 4: res = 'D'; break;
            case 5: res = 'E'; break;
            case 6: res = 'F'; break;
        }
        return res;
    }
     
    public static void piramide(int i) {
        //modulo piramide
        int n = 1;
        for(i = i; i >= n; i--) {
            
            for(int j = 1; j >= n; j--) {
                if(i>=1){
                System.out.print(i + " ");
                }
            }
            for(int j = 1; j>= n; j--) {
                if(i>=2){
                System.out.print(convert(i)+ " ");
                }
            }
            for(int j = 1; j >= n; j--) {
                if(i>=3){
                System.out.print(i + " ");
                }
            }
            for(int j = 1; j>= n; j--) {
                if(i>=4){
                System.out.print(convert(i)+ " ");
                }
            }
            for(int j = 1; j >= n; j--) {
                if(i>=5){
                System.out.print(i + " ");
                }
            }
            for(int j = 1; j>=n; j--) {
                if(i==6){
                System.out.print(convert(i)+ " ");
                }
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        //pide numero de filas y devuelve piramide decresciente intercalando numeros y letras
        int n = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar cantidad de lineas: ");
        i = sc.nextInt();
        if (i > 0 && i < 7) {
            piramide(i);
        }
        else
            System.out.println("error");
    }
    
}
