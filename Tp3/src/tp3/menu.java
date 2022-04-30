/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class menu {
   public static void cargarTerreno(Terreno[] arr, int longitud){
        Scanner sc = new Scanner(System.in);
        int code, app;
        double b, h;
        for (int i = 0; i < longitud; i++) {
            System.out.println("Ingrese codigo del terreno");
            code = sc.nextInt();
            System.out.println("Ingrese manzana del terreno");
            app = sc.nextInt();
            System.out.println("Ingrese la altura del terreno");
            h = sc.nextDouble();
            System.out.println("Ingrese la base del terreno");
            b = sc.nextDouble();
            
            arr[i] = new Terreno(code, b, h, app);
        }
    }

    public static void menuT(){
        System.out.println("");
        System.out.println("MENU DE OPCIONES:");
        System.out.println("1. Encontrar el terreno mas grande");
        System.out.println("2. Mostrar dimesiones de un terreno por su codigo");
        System.out.println("3. Mostrar los datos de los terrenos de una manzana");
        System.out.println("4. Mostrar el precio de cada uno de los terrenos");
        System.out.println("5. Finalizar programa");
    }
    
    public static Terreno terrenoGrande(Terreno[] arr, int longitud){
        double dimension;
        int esTerreno;
        dimension = 0;
        esTerreno = 0;
        for (int i = 0; i < longitud; i++) {
            
            if(arr[i].superficie() > dimension){
                dimension = arr[i].superficie();
                esTerreno = i;
            }
        }
        return arr[esTerreno];
    }
    
    public static void dimensionesT(Terreno[] arr, int codigo){
        int i = 0, esTerreno = 0;
        boolean encontrado = false;
        while(!encontrado){
            if(arr[i].getCodigo() == codigo){
                esTerreno = i;
                encontrado = true;
            }
            i++;
        }
        System.out.println("Las dimensiones del terreno codigo " + codigo + " son: " + arr[esTerreno].getAltura() + " metros de alto y " + arr[esTerreno].getBase() + " metros de base");
    }
    
    public static void terrenosM(Terreno[] arr, int manzana, int longitud){
        for (int i = 0; i < longitud; i++) {
            if(arr[i].getManzana() == manzana){
                System.out.println(arr[i].toString());
            }
        }
    }
    
    public static void precioT(Terreno[] arr, int longitud, double precio){
        for (int i = 0; i < longitud; i++) {
            System.out.println("Precio terreno " + (i+1) + " : " + arr[i].valor(precio));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantT, longitudArr, code, app, seleccion;
        double price;
        
        System.out.println("Carga de terrenos:");
        System.out.println("Ingrese la cantidad de terrenos");
        cantT = sc.nextInt();
        Terreno[] arregloT = new Terreno[cantT];
        longitudArr = arregloT.length;
        
        System.out.println(arregloT.length);
        cargarTerreno(arregloT, longitudArr);
        menuT();
        
        do{
            System.out.println("Ingrese una opcion del menu:");
            seleccion = sc.nextInt();
            switch(seleccion){
                case 1: System.out.println("El terreno mas grande es: " + terrenoGrande(arregloT, longitudArr).toString());
                        break;
                case 2: System.out.println("Ingrese un codigo de terreno");
                        code = sc.nextInt();
                        dimensionesT(arregloT, code);
                        break;
                case 3: System.out.println("Ingrese una manzana");
                        app = sc.nextInt();
                        terrenosM(arregloT, app, longitudArr);
                        break;
                case 4: System.out.println("Ingrese el precio por metro cuadrado");
                        price = sc.nextDouble();
                        precioT(arregloT, longitudArr, price);
                        break;
                case 5: System.out.println("Fin del programa.");
                        break;
                default: System.out.println("Ingrese una opcion del menu correcta");
            }
        }while(seleccion != 5);
    } 
}
