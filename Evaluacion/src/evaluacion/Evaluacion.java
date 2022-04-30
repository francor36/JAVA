package evaluacion;

import java.util.Scanner;
public class Evaluacion {
    
    public static void main(String[] args) {
      double p1, p2, q1, q2, x, y, distancia;
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese una distancia p1:");
        p1 = sc.nextDouble();
        System.out.println("ingrese una distancia p2:");
        p2 = sc.nextDouble();
        System.out.println("ingrese una distancia q1:");
        q1 = sc.nextDouble();
        System.out.println("ingrese una distancia q2:");
        q2 = sc.nextDouble();


        x= p1 - q1;
        y= p2 - q2;

        distancia= Math.sqrt((Math.pow(x,2)) + (Math.pow(y, 2)));

        System.out.println("La distancia entre p y q es:" + distancia);
    }
    
}
