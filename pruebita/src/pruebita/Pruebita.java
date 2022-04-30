/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebita;

/**
 *
 * @author Franco
 */
public class Pruebita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int fila,col,num=4;
      for (fila = num; fila >= 1; fila--)
      {
          for (col = 1; col <= num; col++)
          {
              if (col>fila) 
              {
                  System.out.print("  ");
              }
              else {
                  System.out.print((fila-col+1) + "  ");

              }
          }
          System.out.println("");
      }
    }
    }
    
