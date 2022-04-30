
package distancia.entre.puntos;

import java.util.Scanner;

public class DistanciaEntrePuntos {

    

    public static void main(String[] args) {

    double xUno, xDos, yUno, yDos, D, parentecisUno,parentecisDos,suma;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Ingrese x1");
    xUno = sc.nextDouble();
    System.out.println("Ingrese x2");
    xDos = sc.nextDouble();
    System.out.println("Ingrese y1");
    yUno = sc.nextDouble();
    System.out.println("Ingrese y2");
    yDos = sc.nextDouble(); 
    
    parentecisUno = xUno-xDos;
    
    double elevado1 = Math.pow(parentecisUno,2);
    
    parentecisDos =yUno-yDos;
    
    double elevado2 = Math.pow(parentecisDos,2);    
    
    D = elevado1+elevado2;
    
    double raiz = Math.sqrt(D);
    
    System.out.println("La raíz cuadrada de " + D + " es " + raiz);
    }
    
}
