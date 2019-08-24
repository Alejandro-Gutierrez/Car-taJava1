
package ejercicio.pkg28;

import java.util.Scanner;
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int numero,total=0,valor,valor1,valor2,valor3,valor4,valor5;
        System.out.println("¿Cuantos billetes de 1000 hay?");
        valor=leer.nextInt();
        total=total+(valor*1000);
        System.out.println("¿Cuantos billetes de 2000 hay?");
        valor1=leer.nextInt();
        total=total+(valor1*2000);
        System.out.println("¿Cuantos billetes de 5000 hay?");
        valor2=leer.nextInt();
        total=total+(valor2*5000);
        System.out.println("¿Cuantos billetes de 10000 hay?");
        valor3=leer.nextInt();
        total=total+(valor3*10000);
        System.out.println("¿Cuantos billetes de 20000 hay?");
        valor4=leer.nextInt();
        total=total+(valor4*20000);
        System.out.println("¿Cuantos billetes de 50000 hay?");
        valor5=leer.nextInt();
        total=total+(valor5*50000);
        System.out.println("El total es "+total);
        
     
    }
    
}
