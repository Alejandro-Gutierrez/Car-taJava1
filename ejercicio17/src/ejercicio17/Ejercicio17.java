
package ejercicio17;
import java.util.Scanner;
public class Ejercicio17 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personal, cont=1;
        double horas, valor, valorT=0;
        System.out.println("Ingrese la cantidad de trabajadores a la cual le desea pagar: ");
        personal=leer.nextInt();
        
        while(cont<=personal){
            System.out.println("");
            System.out.println("Ingrese las hora trabajadas en la semana: ");
            horas = leer.nextDouble();
            
            System.out.println("Ingrese el valor por hora trabajadas: ");
            valor=leer.nextDouble();
            
            System.out.println("");
            System.out.println("El sueldo del trabajador "+ cont +" es: "+ (valor*horas));
            
            valorT=(horas*valor)+valorT;
            
            
            
            
            
            cont++;
        }
        System.out.println("");
        System.out.println("EL valor a pagar a los "+ personal+" empleados es de: "+ valorT);
    }
    
}
