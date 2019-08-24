package paqueteria;

import java.util.Scanner;
public class Paqueteria {
    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     double peso, venezuela=12.00, ecuador=11.00;
     double brasil=13.00,argentina=27.00,chile=30.00;
     double total;
     int op;
        System.out.println("[1]Venezuela");
        System.out.println("[2]Ecuador");
        System.out.println("[3]Brasil");
        System.out.println("[4]Argentina");
        System.out.println("[5]Chile");
        System.out.println("");
        System.out.println("Seleccione una opcion");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese el peso(Kg) del envio: ");
                peso=leer.nextDouble();
                if (peso<=7){
                  total=(peso*1000*venezuela);  
                    System.out.println("El valor a pagar por "+(peso*1000)+" Es de: "+ total);
                }
                else{
                    System.out.println("Este envio no puede ser realizado por sobre peso");
                }
                break;
            case 2:
                System.out.println("Ingrese el peso(Kg) del envio: ");
                peso=leer.nextDouble();
                if (peso<=7){
                  total=(peso*1000*ecuador);  
                    System.out.println("El valor a pagar por "+(peso*1000)+" Es de: "+ total);
                }
                else{
                    System.out.println("Este envio no puede ser realizado por sobre peso");
                }
                break;
             case 3:
                System.out.println("Ingrese el peso(Kg) del envio: ");
                peso=leer.nextDouble();
                if (peso<=7){
                  total=(peso*1000*brasil);  
                    System.out.println("El valor a pagar por "+(peso*1000)+" Es de: "+ total);
                }
                else{
                    System.out.println("Este envio no puede ser realizado por sobre peso");
                }
                break; 
             case 4:
                System.out.println("Ingrese el peso(Kg) del envio: ");
                peso=leer.nextDouble();
                if (peso<=7){
                  total=(peso*1000*argentina);  
                    System.out.println("El valor a pagar por "+(peso*1000)+" Es de: "+ total);
                }
                else{
                    System.out.println("Este envio no puede ser realizado por sobre peso");
                }
                break;
             case 5:
                System.out.println("Ingrese el peso(Kg) del envio: ");
                peso=leer.nextDouble();
                if (peso<=7){
                  total=(peso*1000*chile);  
                    System.out.println("El valor a pagar por "+(peso*1000)+" Es de: "+ total);
                }
                else{
                    System.out.println("Este envio no puede ser realizado por sobre peso");
                }
                break;
        }     
    }
    
}
