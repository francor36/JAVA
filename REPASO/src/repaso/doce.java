/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class doce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr;
        char[] arrC;
        int longitud;
        System.out.println("Ingrese la longitud del arreglo");
        longitud =sc.nextInt();
        arr = new char[longitud];
        arr = new char[arr.length];
        for (int i = 0; i <arr.length; i++)
        {
            System.out.println("Ingrese un caracter");
            arr[i]=sc.next().charAt(0);
            
        }
                for (int j = 0; j <arr.length; j++){
                    arrC[j]=arr;
            
        }
        
        
    }
}
