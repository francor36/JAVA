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
public class testTerreno {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double precioM2, b, h;
        int code, app;
        boolean cargar;
        System.out.println("Desea cargar un terreno?");
        cargar = sc.nextBoolean();
        
        do{     
            System.out.println("Ingrese el codigo del terreno");
            code = sc.nextInt();
            Terreno t1 = new Terreno(code);
            
            System.out.println("Ingrese la manzana a la que pertenece el terreno");
            app = sc.nextInt();
            t1.setManzana(app);
            System.out.println("Ingrese la altura del terreno");
            h = sc.nextDouble();
            t1.setAltura(h);
            System.out.println("Ingrese la base del terreno");
            b = sc.nextDouble();
            t1.setBase(b);
            
            System.out.println("El perimetro del terreno es " + t1.perimetro());
            System.out.println("La cantidad de alambre para el cerco necesaria es de: " + t1.superficie()*3);
            System.out.println("La superficie del terreno es " + t1.superficie());
            System.out.println("El costo de limpiar el terreno es " + t1.superficie()*150);
        
            System.out.println("Ingrese el precio por metro cuadrado para el terreno");
            precioM2 = sc.nextDouble();
            System.out.println("El precio del terreno es " + t1.valor(precioM2));
            
            System.out.println("Desea cargar otro terreno?");
            cargar = sc.nextBoolean();
        }while(cargar==true);
        
        
    }
}
    
