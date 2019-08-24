
package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double precio1=95.00,precio2=85.00, precio3=75.00, total;
       int cantidad;
       System.out.println("Ingrese la cantidad de persona que van a comer: ");
       cantidad=leer.nextInt();
       if (cantidad>200 && cantidad<=300){
           total=cantidad*precio2;
           System.out.println("El valor a pagar por "+cantidad + " persona es de: "+ total+" pesos");
       }
       else if(cantidad>300){
           total=cantidad*precio3;
           System.out.println("El valor a pagar por "+cantidad + " persona es de: "+ total+" pesos");
       }
       else{
           total=cantidad*precio1;
           System.out.println("El valor a pagar por "+cantidad + " persona es de: "+ total+" pesos");
       }
    }
    
}
