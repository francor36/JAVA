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
public class sads {
    public static void cargarArreglo (char[] arreglo){
       //Este modulo es creado para cargar los valores de cada posicion del arreglo
       Scanner sc= new Scanner(System.in);
       char letra;
       int i=0;
       char continuar=' ';
       while(i<arreglo.length && continuar!='N'){
           letra= sc.next().charAt(0);
           if((int)letra >64 && (int)letra <123 ){
               arreglo[i]=letra;
               i++;
           }else{
               System.out.println("Caracter NO valido");
           }
           System.out.println("Desea ingresar otra letra? S para si, N para no");
           continuar = sc.next().charAt(0);
     }
    }
          public static void mostrarArreglo(char[] arreglo){
       //Este modulo recibe un arreglo ya cargado sus elementos, y los muestra.
       int i=0;
       for(i=0; i< arreglo.length; i++){
           System.out.println("En la posicion "+i+" usted cargÃ³ la letra: "+arreglo[i]);
       }
        
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0,posicionLetra,contarLetra;
        char [] arregloPrueba=new char[8];
        System.out.println("Cargue su arreglo con letras");
        cargarArreglo(arregloPrueba);
        mostrarArreglo(arregloPrueba);
    }
       
}
