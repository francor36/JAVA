/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivero;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class TestArbol {
    
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int arbolU, longitudArr;
        System.out.println("Ingrese la cantidad de arboles");
        arbolU = sc.nextInt();
        Arbol[] arregloA = new Arbol[arbolU];
        longitudArr = arregloA.length;        
        cargarArbol(arregloA, longitudArr);

    
    }

    public static void cargarArbol(Arbol[] arr, int longitud) {
        Scanner sc = new Scanner(System.in);
        //cargan los arboles
        double altura;
        int codigo = 0;
        boolean cargar = true;
        String arb;
        String especi;
        boolean flor = false; 
        boolean fruto = false;
        boolean perenne = false;
        Arbol ars;
        ars = new Arbol(0,0,false,false,false);
        for(int i = 0; i < longitud; i++) {
            
            System.out.println("Ingrese el nombre del arbol");
            arb = sc.nextLine(); 
            arr[i] = new Arbol(arb);
            arr[i].setNVariedad(arb);
            System.out.println("Ingrese la especie");
            especi = sc.next(); 
            ars.setEspecie(especi);
            
            System.out.println("Ingrese la altura");
            altura = sc.nextDouble(); 
            ars.setAltura(altura);
            
            System.out.println("Tiene flor?");
            flor = sc.nextBoolean(); 
            ars.setFlor(flor);
            
            System.out.println("da fruto?");
            fruto = sc.nextBoolean(); 
            ars.setFruto(flor);
            
            System.out.println("es perenne?");
            perenne = sc.nextBoolean(); 
            ars.setFruto(perenne);
            
            
        }
    }
}
