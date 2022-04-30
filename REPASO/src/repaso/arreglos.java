/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import java.util.Scanner;

class arreglos {
    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);
    int[] arr;
    arr = new int[5];
    int inv[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese un valor ");
             arr[i]= sc.nextInt();

             System.out.println("Valor "+arr[i]);
        }
                for (int x=arr.length-1, j=0; x>=0; x--,j++) {
               
               inv[j]=arr[x];
   
             System.out.print(inv[j]+",");
        }   
}
}
