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
public class once {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        System.out.println("Ingrese los valores del primer arreglo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arreglo 1");
            arr[i] = sc.nextInt();
        }
        System.out.println("Ingrese los valores del segundo arreglo");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Arreglo 2");
            arr2[j] = sc.nextInt();            
        }
        comparArr(arr,arr2);
        
    }

    public static void comparArr(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {       
            for (int j = 0; j < arr2.length; j++) {
            if (arr[i]==arr2[j]){
                System.out.println("Son iguales");
                break;
             }
            }
        }
    }
}