
package personas;

import java.util.Scanner;
public class gorditos {
    
 public static void calcularCaloria(int nc, int h, String tipo) {  //modulo de una piramide
        //
        int normapeso, sobrepeso,Oextrema;
        normapeso = 100;
        sobrepeso = 150;
        Oextrema = 200;
        switch(tipo)
        {
            case"normopeso":
            nc= normapeso*h;
            System.out.println("calorias gastada de las personas: "+nc);
            break;
            case"sobrepeso":
            nc= sobrepeso*h;
            System.out.println("calorias gastada de las personas: "+nc);
            break;
            case"obesoextremo":
            nc= Oextrema*h;
            System.out.println("calorias gastada de las personas: "+nc);
            break;
                
        }
 
        

        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String tipo;
        int caminantes, horas;
        
        System.out.println("Ingrese caminantes ");
        caminantes = sc.nextInt();
        System.out.println("Ingrese el tipo de obesidad (normopeso, sobrepeso, obesoextremo ");
        tipo = sc.next();
        System.out.println("Ingrese las horas  ");
        horas = sc.nextInt();
        switch(tipo)
        {
            case "normopeso":
            calcularCaloria(caminantes,horas, tipo); 
            System.out.println("normopeso gasta 100 calorias");
            break;
            
            case "sobrepeso":
            calcularCaloria(caminantes,horas, tipo); 
            System.out.println("sobrepeso gasta 150 calorias");
            break;
            
            case "obesoextremo":
            calcularCaloria(caminantes,horas, tipo);
            System.out.println("sobrepeso gasta 200 calorias");
            break;
                
        }
        
    }
    
}
