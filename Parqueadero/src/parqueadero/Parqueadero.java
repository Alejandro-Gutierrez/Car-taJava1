package parqueadero;
import java.util.Scanner;
public class Parqueadero {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double total,hora;
        System.out.println("Ingrese las horas que estuvo en el parqueadero");
        hora=leer.nextDouble();
        
        if (hora>1 && hora<=2){
            total=hora*5.00;
            System.out.println("El valor a pagar por "+ hora+" horas es de: "+total);
        }
        if (hora>2 && hora<=5){
            total=hora*4.00;
            System.out.println("El valor a pagar por "+ hora+" horas es de: "+total);
        }
       if (hora>5 && hora<=10){
            total=hora*3.00;
            System.out.println("El valor a pagar por "+ hora+" horas es de: "+total);
        }
       if (hora>10){
            total=hora*2.50;
            System.out.println("El valor a pagar por "+ hora+" horas es de: "+total);
                 
        }
    }
    
}
