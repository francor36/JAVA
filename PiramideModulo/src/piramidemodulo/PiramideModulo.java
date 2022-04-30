
package piramidemodulo;

import java.util.Scanner;


public class PiramideModulo {

  public static double A(double radio)
{
double PI, area;
PI = 3.14;
area = PI *radio*radio;
return area;
    
}
    public static void main(String[] args)
    {
        int i, j, pisos;
        char letra;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese cantidad de pisos:");
        pisos = sc.nextInt();
        for(i=1; i<=pisos; i++)
        {
         System.out.println("");
         for(j=1; j<=i; j++)
         {
          System.out.print(j);
         }
        }
        System.out.println("");
     

    }
    
}
