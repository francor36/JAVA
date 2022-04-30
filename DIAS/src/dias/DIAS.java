
package dias;

import java.util.Scanner;
public class DIAS {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int dias, x, temperatura;
        boolean lluvia;
        System.out.println("ingrese dias: ");
        dias = sc.nextInt();
        if(lluvia = true)
        {
        
        for(x=0; x<=dias; x++)
        {
        System.out.println("ingrese la temperatura minima: ");
        temperatura =sc.nextInt();
        System.out.println("llovio?: ");
        lluvia = sc.next();
        System.out.println("La temperatura fue minima: "+temperatura);

        switch(x)
        {
            case 1:
            System.out.println("La temperatura fue minima: "+temperatura);
            System.out.println("el dia: "+lluvia) ;
            break;
        }
        }
    }
    }
}
