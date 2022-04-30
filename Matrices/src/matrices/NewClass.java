package matrices;

import java.util.Scanner;

public class NewClass {

    public static char convertir(int num){
        char res =' ';
        switch(num){
            case 1: res='A';break;
            case 2:res='B';break;
            case 3:res='C';break;
            case 4:res='D';break;
            case 5:res='E';break;
        }
        
        return res;
    }
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      int fila,col,num=4;
      for(fila=1;fila<=num;fila++){
          for(col=1;col<=(num-fila+1);col++){
           if(col%2==0){
              System.out.print(col+" ");
          }
           else{
                 System.out.print(convertir(col)+" ");
           }
          }


          System.out.println(" ");
      }
     }
}
