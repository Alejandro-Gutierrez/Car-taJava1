package ejercicio15;
import java.util.Scanner;

public class Ejercicio15 {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String nombre;
        double valor, valt1=0, valt2=0, valt3=0, valt4=0, valt5=0;
        int ventas, cont=1,op;
        int can1=0, can12=0, can13=0;
        
        
        System.out.println("Ingrese cantidad de venta por dia: ");
        ventas=leer.nextInt();
        
        while(cont<=ventas){
           System.out.println("Tienda de Zaptos");
           System.out.println("[1] Zapatos para niños");
           System.out.println("[2] Zapatos para niñas");
           System.out.println("[3] Zapatos para jovenes");
           System.out.println("[4] Zapatos para Hombres");
           System.out.println("[5] Zapatos para Mujeres");
           System.out.println("");
           System.out.println("Eliga una opcion: ");
           op=leer.nextInt();
           switch(op){
               case 1:
                   System.out.println("Ingrese el valor de la compra: ");
                   valor=leer.nextDouble();
                   valt1=valt1+valor;
                   
                   if (valor>1000){
                       can1++;    
                   }
                   if(valor>500 && valor<=1000){
                       can12++;
                   }
                   if (valor<=500){
                       can13++;
                   }
                                  
                   break;
                   
               case 2:
                   System.out.println("Ingrese el valor de la compra: ");
                   valor=leer.nextDouble();
                   valt2=valt2+valor;
                   
                   if (valor>1000){
                       can1++;    
                   }
                   if(valor>500 && valor<=1000){
                       can12++;
                   }
                   if (valor<=500){
                       can13++;
                   }
                                  
                   break;
                   
               case 3:
                   System.out.println("Ingrese el valor de la compra: ");
                   valor=leer.nextDouble();
                   valt3=valt3+valor;
                   
                   if (valor>1000){
                       can1++;    
                   }
                   if(valor>500 && valor<=1000){
                       can12++;
                   }
                   if (valor<=500){
                       can13++;
                   }
                                  
                   break;
               case 4:
                   System.out.println("Ingrese el valor de la compra: ");
                   valor=leer.nextDouble();
                   valt4=valt4+valor;
                   
                   if (valor>1000){
                       can1++;    
                   }
                   if(valor>500 && valor<=1000){
                       can12++;
                   }
                   if (valor<=500){
                       can13++;
                   }
                   
                   
                   break;
               case 5:
                   System.out.println("Ingrese el valor de la compra: ");
                   valor=leer.nextDouble();
                   valt5=valt5+valor;
                   
                   if (valor>1000){
                       can1++;    
                   }
                   if(valor>500 && valor<=1000){
                       can12++;
                   }
                   if (valor<=500){
                       can13++;
                   }
                   
                   
                   break;
                   
           }
            
            
            
            
            
            cont++;
        }
        System.out.println("La cantidades de venta mayores a 1000 fue de: "+can1);
        System.out.println("La cantidades de venta mayores a 500 pero menores a 1000 fue de: "+can12);
        System.out.println("La cantidades de venta menore o igual a 500 fue de: "+can13);
        System.out.println("");
        
        System.out.println("El valor total de la categoria niños fue de: " + valt1);
        System.out.println("El valor total de la categoria niñas fue de: " + valt2);
        System.out.println("El valor total de la categoria jovenes fue de: " + valt3);
        System.out.println("El valor total de la categoria hombres fue de: " + valt4);
        System.out.println("El valor total de la categoria mujeres fue de: " + valt5);
        
        System.out.println("");
        System.out.println("El valor total de las compras fue de: "+( valt1 + valt2 + valt3 + valt4 + valt5 ));
        
        
        
        
    }
    
}
