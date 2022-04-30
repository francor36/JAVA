package tp7;

import java.util.Scanner;
public class TP7 {

public static void main(String[] args) 
 {
     int cAlumnos, i, nota, correcto, incorrecto, nRespondido;
     incorrecto = -1;
     String noAlumno;
      
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("ingrese cantidad alumnos:");
     cAlumnos = sc.nextInt();
     
     for(i = 0; i <= cAlumnos; i++)
     {
     System.out.println("ingrese nombre de alumno:");
     noAlumno = sc.next();
     
     System.out.println("ingrese cantidad de respuestas correctas:");
     correcto = sc.nextInt();
     System.out.println("ingrese cantidad de respuestas incorrectas:");
     incorrecto = sc.nextInt();
     System.out.println("ingrese cantidad de no repondidas:");
     nRespondido = sc.nextInt();
     
     correcto = correcto*2;
     incorrecto = incorrecto;
     nRespondido = nRespondido + 0;
     
     nota = (correcto)-(incorrecto-nRespondido);
     
     System.out.println (" la suma es: " + noAlumno + "la nota es" + nota);
     }
     
 }
}