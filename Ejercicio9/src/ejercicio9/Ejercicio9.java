
package ejercicio9;
import java.util.Scanner;

public class Ejercicio9 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double valor, suma=0;
       int cantidad;
        System.out.println("Ingrese el valor anual");
        valor=leer.nextDouble();
        System.out.println("Ingrese la cantidad de años");
        cantidad=leer.nextInt();
        
        for(int x=1;x<=cantidad;x++){
            suma=suma+(valor+(valor*0.15));
            System.out.println("En el año "+x+ " recibio "+ suma);
            System.out.println("");
        }
        System.out.println("El total por "+cantidad+ " es de:" +suma);
    }
    
}
