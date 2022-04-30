package tp7;

import java.util.Scanner;


public class eje2 
{
 public static double PesoA(double envioA)
{
double corto, envio;
corto = 50;
envio = corto*envioA;
return envio;
    
}
  public static double PesoB(double envioB)
{
double corto, envio;
corto = 75;
envio = corto*envioB;
return envio;
    
}
  public static double PesoC(double envioC)
{
double corto, envio;
corto = 100;
envio = corto*envioC;
return envio;
    
}    
     
   public static void main(String[] args) 
 {
   double res;
   char envio, letra;
   int peso;
   
  
   Scanner sc = new Scanner(System.in);
   

      
      System.out.println("Los envios van A) Corta distancia: 50 pesos por Kg más un seguro de 50 pesos. B)  Media distancia: 75 pesos por Kg más un seguro de 50 pesos. C) Larga distancia: 100 pesos por Kg más un seguro de 50 pesos.:");
      System.out.println("ingrese el tipo envio(A-B-C):");
      envio = sc.next().charAt(0);
      
      System.out.println("ingrese el peso:");
      peso = sc.nextInt();
      
       
   switch(envio)
   {
        case 'A':
        {  
        res = PesoA(peso);
        System.out.println("El peso es: "+ peso);
        System.out.println("El precio es: "+ res);
        break;
        }
        case 'B':
        {
        res = PesoB(peso);
        System.out.println("El peso es: "+ peso);
        System.out.println("El precio es: "+ res);

        break;
        }
        case 'C':
        {
        res = PesoC(peso);
        System.out.println("El peso es: "+ peso);
        System.out.println("El precio es: "+ res);
        break;
        }
   }
    
 }
   
   
   
}
