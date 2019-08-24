
package ejercicio.pkg30;

import java.util.Scanner;


public class Ejercicio30 {


    public static void main(String[] args) {
   Scanner leer= new Scanner(System.in);
   int numero;
   numero=leer.nextInt();
   
   for (int x=0;x<numero;x++){
       for (int y=1;y<=numero;y++){
           System.out.println(x+y);
       }
   }
  
    }
    
}
