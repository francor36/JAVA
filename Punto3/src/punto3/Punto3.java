
package punto3;

import java.util.Scanner;
public class Punto3 
{
    public static double calcularConsumo( String peso, int tiempo) 
    {
        int Tv,Plancha,Lavadora,Calculo=0;
        Tv = 70;
        Plancha = 1000;
        Lavadora = 2000;
        
        switch(peso)
        {
            case "TV":
            Calculo = Tv * tiempo;
            break;
            case "plancha":
            Calculo = Plancha * tiempo;
            break;
            case "lavadora":
            Calculo = Lavadora * tiempo;
            break;
            
        }
return Calculo;
    }
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nElectromesticos,i, horas;
        double res;
        String tipo;
        System.out.println("Cantidad cantidad de electromesticos :");
        nElectromesticos = sc.nextInt();
        for(i=1; i<=nElectromesticos; i++)
        {        
            System.out.println("ingrese el tipo de electromestico :");
            tipo = sc.next();
            System.out.println("ingrese cantidad de horas :");
            horas = sc.nextInt();
            
            switch(tipo)
            {
                case "TV":
                 calcularConsumo(tipo, horas);
                 System.out.println("El electromestico :" + tipo);
                 System.out.println("El electrodomestico : "+ calcularConsumo(tipo,horas)+" Watts");
                 System.out.println("El minimo de consumo es de 70 Watts :");
                 
                break;
                case "plancha":
                 calcularConsumo(tipo, horas);
                 System.out.println("El electromestico: " + tipo);
                 System.out.println("El electrodomestico : "+ calcularConsumo(tipo,horas)+" Watts");
                 System.out.println("El minimo de consumo es de 1000 Watts :");
                break;
                case "lavadora":
                 calcularConsumo(tipo, horas);
                 System.out.println("El electromestico :" + tipo);
                 System.out.println("El electrodomestico : "+ calcularConsumo(tipo,horas)+" Watts");
                 System.out.println("El minimo de consumo es de 2000 Watts :");
                break;
                
            }
            
            
        }
       
        
    }
    
}
