
package uno;

import java.util.Scanner;
public class Uno {
    public static void piramide(int n) 
    {
        int fil, col;
        for ( fil = 1; fil <= n; fil++) {
         for ( col = 1; col <= fil; col++) {
            if ((fil % 2 == 0)){
                    System.out.print(convertir(fil)+ "  ");
                }
                else {
                   System.out.print(fil+ " ");
                }
            }
                     System.out.println(""); 
        }
    }
     public static char convertir(int num) {
        char res = ' ';
        switch (num) {
            case 1: res = 'A';
            break;
            case 2: res = 'B';
            break;
            case 3: res = 'C';
            break;
            case 4: res = 'D';
            break;
            case 5: res = 'E';
            break;
            case 6: res = 'F';
            break;
        }
        return res;
    }
    
    
    

    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     int n;
     System.out.println("ingresar cantidad de lineas: ");
        n = sc.nextInt();
        if (n > 0 && n < 7) {
            piramide(n);
        }
        else
            System.out.println("error");
    }
        
}
