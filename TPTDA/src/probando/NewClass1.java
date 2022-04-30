
package probando;
import java.util.Scanner;

public class NewClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este algoritmo intenta hacer un recorrido bidimensional en Caracol
        int n=5;
        String [][] matriz = new String[n][n];
        int inicio=0;
        int fin=n-1;
        int valor =1;
        int i,k,f;
        
        for(k=0; k<matriz.length; k++){
        
        //Llena la fila superior de izquierda a derecha →
        for(i=inicio; i<=fin; i++){
            matriz[inicio][i]= valor++ + " \t";
        }
        
         //Llena la columna del extremo derecho de arriba hacai abajo ↓
        for(i=inicio+1; i<=fin; i++){
            matriz[i][fin]= valor++ + " \t";
        }
        
         //Llena la fila Inferior de derecha a izquierda ←
        for(i=fin-1; i>=inicio; i--){
            matriz[fin][i]= valor++ + " \t";
        }
        
         //Llena la columna del extremo izquierdo de abajo hacia arriba↑
        for(i=fin-1; i>=inicio+1; i--){
            matriz[i][inicio]= valor++ + " \t";
        }
        
        inicio++; fin --;
      } // Fin del ciclo for mas externo(k)
        
      //Mostrar matriz 
      for (f=0; f<matriz.length; f++){
          for(i=0; i<matriz[0].length; i++){
              System.out.print(matriz[f][i]);  
          }
          System.out.println(" ");
      }
   }
}
