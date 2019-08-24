
package ejercicio.pkg8;

import java.util.Scanner;

public class Ejercicio8 {

 
    public static void main(String[] args) {
           Scanner leer= new Scanner(System.in);
           double ahorro;
           System.out.println("¿Cuanto es el ahorro inicial?");
           ahorro=leer.nextDouble();
           for(int x=1;x<=18;x++){
               ahorro=ahorro+(ahorro*0.30);
           }
           System.out.println("El ahorro total fue de "+ahorro);

    }
    
}
