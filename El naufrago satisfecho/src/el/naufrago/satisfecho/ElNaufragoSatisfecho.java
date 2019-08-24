package el.naufrago.satisfecho;
import java.util.Scanner;
public class ElNaufragoSatisfecho {


    public static void main(String[] args) {
        double sencilla=20.00, doble=25.00,triple=28.00,cargo=0.05, total;
        int op;
        System.out.println("Menu");
        System.out.println("[1] Hamburguesa sencilla");
        System.out.println("[2] Hamburguesa doble");
        System.out.println("[3] Hamburguesa triple");
        System.out.println();
        System.out.println("Escoga una opcion: ");
        Scanner leer = new Scanner(System.in);
        op=leer.nextInt();
        switch(op){
            case 1:
                int cantidad;
                System.out.println("Cantidad de hamburguesa");
                cantidad=leer.nextInt();
                total=(sencilla*cantidad)+(sencilla*cantidad*cargo);
                System.out.println("El valor a pagar por "+ cantidad+" Hamburguesa sencilla es: "+ total);
             
                break;
            case 2:
                
                int cantidad2;
                System.out.println("Cantidad de hamburguesa");
                cantidad2=leer.nextInt();
                 System.out.println("Cantidad de hamburguesa");
                 
                cantidad2=leer.nextInt();
                total=(doble*cantidad2)+(doble*cantidad2*cargo);
                System.out.println("El valor a pagar por "+ cantidad2+" Hamburguesa doble es: "+ total);
              
                break;
            case 3:
                int  cantidad3;
                System.out.println("Cantidad de hamburguesa");
                cantidad3=leer.nextInt();
                System.out.println("Cantidad de hamburguesa");
                cantidad3=leer.nextInt();
                
                total=(triple*cantidad3)+(triple*cantidad3*cargo);
                System.out.println("El valor a pagar por "+ cantidad3+" Hamburguesa sencilla es: "+ total);
              
                break;
        }
    }  
}
