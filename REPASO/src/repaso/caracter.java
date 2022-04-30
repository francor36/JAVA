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
public class caracter {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        char ver;
        char num ='1';
        System.out.println("Ingrese un caracter ");
        for (int i = 0; i<arr.length; i++) 
        {
            ver=sc.next().charAt(0);
            if (ver != num)
            {
                System.out.println("es un caracter");
                arr[i]= ver; 
                
            }
            else
            {
                System.out.println("no es un caracter");
            }          
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
    }
    
}
