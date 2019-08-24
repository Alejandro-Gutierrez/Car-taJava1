package ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cantidad, op,op1;
        int PrecioS=16000, PrecioD=25000, PrecioT=28000;
        double aumento=0.05, total;
        
        System.out.println("Menu");
        System.out.println("[1] Hamburguesa sencillas");
        System.out.println("[2] Hamburguesa doble");
        System.out.println("[3] Hamburguesa triple");
        System.out.println("[4] Hamburguesa Variadas");
        System.out.println("");
        System.out.println("Eliga una opcion:");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese la cantidad de Hamburguesa");
                cantidad=leer.nextInt();
                
                
                System.out.println("Metodo de pago");
                System.out.println("[1] Tarjeta");
                System.out.println("[2] Efectivo");
                System.out.println("");
                System.out.println("Eliga una opcion:");
                op1=leer.nextInt();
                switch(op1){
                    case 1:
                        
                        total=(PrecioS*cantidad)+(PrecioS*cantidad*0.05);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        
                        break;
                    case 2:
                        total=(PrecioS*cantidad)+(PrecioS*cantidad);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        break;
                }
                break;
            case 2:
                System.out.println("Ingrese la cantidad de Hamburguesa");
                cantidad=leer.nextInt();
                
                
                System.out.println("Metodo de pago");
                System.out.println("[1] Tarjeta");
                System.out.println("[2] Efectivo");
                System.out.println("");
                System.out.println("Eliga una opcion:");
                op1=leer.nextInt();
                switch(op1){
                    case 1:
                        
                        total=(PrecioD*cantidad)+(PrecioD*cantidad*0.05);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        
                        break;
                    case 2:
                        total=(PrecioD*cantidad)+(PrecioD*cantidad);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        break;
                }
                break;
            
            case 3:
                System.out.println("Ingrese la cantidad de Hamburguesa");
                cantidad=leer.nextInt();
                
                
                System.out.println("Metodo de pago");
                System.out.println("[1] Tarjeta");
                System.out.println("[2] Efectivo");
                System.out.println("");
                System.out.println("Eliga una opcion:");
                op1=leer.nextInt();
                switch(op1){
                    case 1:
                        
                        total=(PrecioT*cantidad)+(PrecioT*cantidad*0.05);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        
                        break;
                    case 2:
                        total=(PrecioT*cantidad)+(PrecioT*cantidad);
                        System.out.println("El valor a pagar por "+ cantidad+ " Hamburguesa es de: "+total);
                        break;
                }
                break;
                
               
            
            case 4:
                double total1;
                int cant1,cant2,cant3;
                System.out.println("Ingrese la cantidad de Hamburguesa Sencilla");
                cant1=leer.nextInt();
                
                System.out.println("Ingrese la cantidad de Hamburguesa Doble");
                cant2=leer.nextInt();
                
                System.out.println("Ingrese la cantidad de Hamburguesa Triple");
                cant3=leer.nextInt();
                
                
                
                
                System.out.println("Metodo de pago");
                System.out.println("[1] Tarjeta");
                System.out.println("[2] Efectivo");
                System.out.println("");
                System.out.println("Eliga una opcion:");
                op1=leer.nextInt();
                switch(op1){
                    case 1:
                        
                        total1=((cant1*PrecioS)+(cant2*PrecioD)+(cant3*PrecioT))+(((cant1*PrecioS)+(cant2*PrecioD)+(cant3*PrecioT))*0.05);
                        System.out.println("El valor a pagar por "+ cant1+ " Hamburguesa Sencilla");
                        System.out.println("El valor a pagar por "+ cant2+ " Hamburguesa Doble");
                        System.out.println("El valor a pagar por "+ cant3+ " Hamburguesa Triple");
                        System.out.println("");
                        System.out.println("EL valor total a pgar es de: "+ total1);
                        
                        break;
                    case 2:
                        total1=((cant1*PrecioS)+(cant2*PrecioD)+(cant3*PrecioT));
                        System.out.println("El valor a pagar por "+ cant1+ " Hamburguesa Sencilla");
                        System.out.println("El valor a pagar por "+ cant2+ " Hamburguesa Doble");
                        System.out.println("El valor a pagar por "+ cant3+ " Hamburguesa Triple");
                        System.out.println("");
                        System.out.println("EL valor total a pgar es de: "+ total1);
                        
                        break;
                }
                
                break;
            
            
            
        }
        
        
        
       
        
    }
    
}
