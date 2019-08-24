
package ejercicio.pkg23;

import java.util.Scanner;


public class Ejercicio23 {


    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       double ahorro=2500,acum;
       for(int x=1;x<=58;x++){
           ahorro=ahorro+(ahorro*0.15);
           System.out.println(ahorro);
           
       }
    }
    
}
