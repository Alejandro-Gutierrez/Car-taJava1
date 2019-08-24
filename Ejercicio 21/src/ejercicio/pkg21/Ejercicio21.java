
package ejercicio.pkg21;
import java.util.Scanner;
public class Ejercicio21 {


    public static void main(String[] args) {
 Scanner leer= new Scanner(System.in);
        int acum=0,valor,cantidad;
        double descuento,total,total1,total2,suma=0;
        System.out.println("¿Cuantos productos desea comprar?");
        cantidad=leer.nextInt();
        for(int x=1;x<=cantidad;x++){
            System.out.println("Ingrese el valor del producto");
            valor=leer.nextInt();
            if(valor>=200){
              descuento=valor*0.15;
              total=valor-descuento;
              suma=suma+total;
                System.out.println(total);               
            }
            if(valor>=100 && valor<200){
              descuento=valor*0.12;
              total1=valor-descuento;
              suma=suma+total1;
              System.out.println(total1);   
                
            }
            if(valor<100){
              descuento=valor*0.10;
              total2=valor-descuento;
              suma=suma+total2;
              System.out.println(total2);   
            }
            System.out.println(suma);
        }
        
    }
    
}
