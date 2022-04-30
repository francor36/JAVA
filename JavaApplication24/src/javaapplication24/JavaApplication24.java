
package javaapplication24;

import java.util.Scanner;
public class JavaApplication24 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int años, horasV, horasM, acumV, acumM, cantM3;
        double promS, promSi;
        char seguro;
        String respuesta;
        acumV = 0;
        acumM = 0;
        horasV = 0;
        horasM = 0;
        cantM3 = 0;
        System.out.println("quiere ingresar un pelotero? Ingrese si o no");
        respuesta=sc.next();
        do{
            System.out.println("ingrese si tiene seguro C'con seguro' o S'sin seguro'");
            seguro = sc.next().charAt(0);

            System.out.println("ingrese cantidad de años de uso");
            años=sc.nextInt();

            System.out.println("¿quiere ingresar otro pelotero? Ingrese si o no");
            respuesta=sc.next();


            if(seguro=='C'){
            horasV = horasV + años;
            acumV = acumV + 1;
            }else{
            if (seguro=='S'){
            horasM = horasM + años;
            acumM = acumM + 1;

                if(años>50){
                cantM3 = cantM3 + 1;
                }
            }

            }

        }while(respuesta.equals("si"));

        promS = horasV/acumV;
        promSi = horasM/acumM;

        System.out.println("el promedio de horas de estudio de los alumnos varones es: "+promS);
        System.out.println("el promedio de horas de estudio de las alumnas mujeres es: "+promSi);
        System.out.println("la mujeres que estudian mas de 3 horas son: "+cantM3);
    }
}
    

