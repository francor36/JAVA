/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testedificio;

import java.util.Scanner;

/**
 *
 * @author Franco
 */
public class TestEdificio {

    public static void cargarArreglo(Edificio[] edificio, int cantEdificios) {
        Scanner sc = new Scanner(System.in);
        String nombre, identificacion;
        char tipo;
        int cantP;
        double val;
        boolean constr;

        for (int i = 0; i < cantEdificios; i++) {
            System.out.println("ingrese el edificio");
            identificacion = sc.next();
            edificio[i] = new Edificio(identificacion);

            System.out.println("ingrese el nombre del edificio");;
            nombre = sc.next();
            edificio[i].setNombre(nombre);

            System.out.println("ingrese el destino, ‘V’  vivienda, ‘O’ oficina, ‘E’ edificio para el Estado y ‘X’ otros");
            tipo = sc.next().charAt(0);
            edificio[i].setDestino(tipo);

            System.out.println("ingrese la cantidad de pisos ");
            cantP = sc.nextInt();
            edificio[i].setCantPiso(cantP);

            System.out.println("Ingrese los metros cuadrados");
            val = sc.nextInt();
            edificio[i].setValorMt2(val);

            System.out.println("El edificio esta construido? True(si),False(no)");
            constr = sc.nextBoolean();
            edificio[i].setConstruido(constr);

        }

    }


    public static void masArreglo(Edificio[] arreglo, int cantP) {
        int cantidp;
        Edificio[] arre = new Edificio[1];
        cantidp = arreglo[0].getCantPiso();
        for (int i = 0; i < cantP; i++) {
            if (arreglo[i].getCantPiso() > cantidp) {
                cantidp = arreglo[i].getCantPiso();
                arre[0] = arreglo[i];
            }

        }
        System.out.println("El edificio con mas pisos es ");
        System.out.println(arre[0].toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantEdificios;

        System.out.println("¿cuantos edificios quiere ingresar?");
        cantEdificios = sc.nextInt();
        Edificio[] edificio = new Edificio[cantEdificios];
        cargarArreglo(edificio, cantEdificios);

        masArreglo(edificio, cantEdificios);

    }

}
