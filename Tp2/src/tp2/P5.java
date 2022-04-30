/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class P5 {
    public static char convertidor (char caracter){
        switch(caracter){
            case 'a': caracter = '*'; break;
            case 'e': caracter = '/'; break;
            case 'i': caracter = '+'; break;
            case 'o': caracter = '-'; break;
            case 'u': caracter = '#'; break;
            default: caracter = caracter;
        }
        return caracter;
    }
    public static String cadenaEncriptada(String cadena){
        String nuevaCadena = "";
        int longitud = cadena.length();
        for(int i = 0; i < longitud; i++){
            nuevaCadena += convertidor(cadena.charAt(i));
        }
        return nuevaCadena;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = ""; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena a encriptar: ");
        cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        System.out.println("La nueva cadena es: " + cadenaEncriptada(cadena));
    }
    
}
