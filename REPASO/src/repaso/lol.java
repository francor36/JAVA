package repaso;

import java.util.Scanner;

public class lol {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;
        String letra;

        System.out.println("Ingrese una frase");
        frase = sc.nextLine();

        System.out.println("Ingrese la palabra a encontrar");
        letra = sc.nextLine();

        EnCaracter(frase, letra);
    }

    public static void EnCaracter(String frase, String letra) {

        int tamaño = frase.length();
        boolean siEsta = false;
        for (int i = 0; i < tamaño; i++) {
            if (frase.substring(i,tamaño)) {
                siEsta = true;
            }
        }

        if (siEsta) {
            System.out.println("el caracter SI esta en la frase");
        } else {
            System.out.println("el caracter NO esta en la frase");
        }

    }

}