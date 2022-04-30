
package edulcorante;

import java.util.Scanner;

public class Edulcorante {
    

    public static void main(String[] args) {
        
        int gotas, tazas;
        
        Scanner sc = new Scanner(System.in);
        
        tazas = sc.nextInt();
        
        tazas = tazas*2;
        
        gotas = tazas*4;
        
        gotas = gotas*2;
        
        System.out.println("para preparar "+ gotas);
        System.out.println("gotas necesarias para preparar "+ gotas);
        
        
        
    }
    
}
