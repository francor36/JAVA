
package primos;

import java.util.Scanner;
public class Primos {


    public static void main(String[] args) 
    {
     int numero, i; //declaro la varible numero e i que son enteros;
     Scanner sc= new Scanner(System.in);
     do // empieza las instrucciones siempre y cuando se cumplan en el while;
     {
         System.out.println("ingrese un numero");   //pido ingresar un numero;
         numero = sc.nextInt(); //se guarda en numero;
         boolean primo = true;  //declaro que primo es verdadero;
         
         for (i =1; i<=numero && primo==true; i++)  //si i menor igual al numero y primo sea verdadero se va a sumar uno en i;
         {
             if (numero%i==0) primo=false; // numero tiene resto cero entonces primo pasa a ser falso;
         }
         if (primo==true) // si primo es verdadero;
             System.out.println(numero +" es primo"); // muestro el cartel diciendo el numero es primo;
         else //si primo es falso digo;
         System.out.println(numero +" no es primo"); // muestro el cartel diciendo numero no es primo
     }
     
     while(numero>0); // mientras el numero sea mayor a 0 se va a repetir siempre. Pero si el numero es menor a 0 termina el programa;
    
    }
    
    
}
