
package ejercicio.pkg26;
import java.util.Scanner;
public class Ejercicio26 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      int cantidad;
      int a;
      double precio,suma=0;
        System.out.println("Cuantas compañera son: ");
        cantidad=leer.nextInt();
        
        for(int x=1;x<=cantidad;x++){
            System.out.println("");
            System.out.println("Compañera "+x);
            System.out.println("");
            System.out.println("Ingrese la cantidad de dinero que tenga: ");
            precio=leer.nextInt();
            a = (int) (Math.random()*3);
   
            if (a==0){
                a=1;
            }
            switch(a){
                case 1:
                    System.out.println("La compañera "+x+" Debe de aportar un 10% del valor que tenga");
                    System.out.println("El valor de aporte es de: "+ precio*0.10);
                    System.out.println("");
                    suma=suma+(precio*0.10);
                    break;
                case 2:
                    System.out.println("La compañera "+x+" Debe de aportar un 7% del valor que tenga");
                    System.out.println("El valor de aporte es de: "+ precio*0.07);
                    System.out.println("");
                    suma=suma+(precio*0.07);
                    break;
                case 3:
                    System.out.println("La compañera "+x+" Debe de aportar un 5% del valor que tenga");
                    System.out.println("El valor de aporte es de: "+ precio*0.05);
                    System.out.println("");
                    suma=suma+(precio*0.05);
                    break;
            }
            
            
                   
            
            
        }
        System.out.println("El valor recaudado fue de: "+ suma);
    }
    
}
