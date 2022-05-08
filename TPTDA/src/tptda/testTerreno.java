package tptda;

import java.util.Scanner;

public class testTerreno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantTerreno;
        System.out.println("Ingrese la cantidad de terenos");
        cantTerreno = sc.nextInt();
        int[] arr = new int[cantTerreno];
        cantTerreno = arr.length;
        cargarArreglo(arr, cantTerreno);
    }

    public static void cargarArreglo(int[] arr, int cantTerreno) {
        Scanner sc = new Scanner(System.in);
        TPTDA terreno = new TPTDA(0, 0, 0, 0);
        double base, altura;
        int codigo, manzana;
        codigo = 0;
        for (int i = 0; i <     ; i++) {
            codigo++;
            terreno.setCodigo(codigo);
            System.out.println("Ingrese base y altura");
            base = sc.nextDouble();
            terreno.setBase(base);
            altura = sc.nextDouble();
            terreno.setAltura(altura);

            System.out.println("Ingrese manzana");
            manzana = sc.nextInt();
            terreno.setManzana(manzana);
            CalcularTerreno(arr, cantTerreno, terreno);
        }
    }

    public static void CalcularTerreno(int[] arr, int cantTerreno, TPTDA terreno) {
        double base, altura, perimetro;
        Scanner sc = new Scanner(System.in);
        String cerca = "";
        double precio;
        base = terreno.getBase();
        altura = terreno.getAltura();
        perimetro = (base * altura) / 2;
        int codigo;
        codigo = terreno.getCodigo();
        for (int i = 0; i <codigo; i++) {
            System.out.println("el codigo del terreno es " + codigo + " "+"el perimetro del terreno " + perimetro);
            System.out.println("Datos completos del terreno "+terreno.toString());
            System.out.println("Quiere cerrar el perimetro ? ");
            cerca = sc.nextLine();
            switch (cerca) {
                case "cerrar":
                    perimetro = perimetro * 3;
                    System.out.println("la cantidad de alambre para el perimetro es " + perimetro + "mt cuadrados");
                    break;

                case "limpiar":
                    perimetro = perimetro * 150;
                    System.out.println(perimetro);
                    break;
                case "vender":
                    perimetro = perimetro * 2;
                    System.out.println("Ingrese el precio por metros cuadrados ");
                    precio = sc.nextDouble();
                    precio = perimetro * precio;
                    System.out.println("El precio del terreno es " + precio);
                    break;
            }

        }
    }
}
