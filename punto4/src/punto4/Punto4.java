
package punto4;

import java.util.Scanner;
public class Punto4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double ndias, i, Cdias=0, Clluvia=0, temperatura=0, Adias=0;
        String clima="si";
        System.out.println("ingrese cantidad de dias :");
        ndias = sc.nextInt();
        for(i=0; i<ndias; i++)
        {
        System.out.println("Llovio en el dia ? :");
        clima = sc.next();
        
        System.out.println("Ingrese la temperatura minima :");
        temperatura = sc.nextInt();
        

        if(clima.equals("si"))
        {
            Cdias++;
            Adias = Adias+temperatura;
        }
        if(clima.equals("si"))
        {
            Clluvia++;
            Adias = Adias+temperatura;
        }
                     
        }
        switch(clima)
        {
            case "si":
            System.out.println("dias llovidos :" +Cdias);
            temperatura = Adias/ndias;
            System.out.println("El promedio de la temperatura minima fue :" +temperatura);
            break;
            
            case "no":
            System.out.println("dias llovidos :" +Cdias);
            temperatura = Adias/ndias;
            System.out.println("El promedio de la temperatura minima fue :" +temperatura);
            break;
            
        }
        
          
    }
}     