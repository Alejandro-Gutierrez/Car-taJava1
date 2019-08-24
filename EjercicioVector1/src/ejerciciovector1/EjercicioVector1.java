
package ejerciciovector1;
import java.util.*;
/**
 *
 * @author NIÑOS
 */
public class EjercicioVector1 {

    /**
     * Luis alejandro gutierrez pimienta
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int edad[]= new int [3];
        String nombre[]= new String[3];
        int a=0,c=0;
        
        
        for (int x=0; x<(nombre.length);x++){
            System.out.println("");
            System.out.println("Ingrese el nombre "+ x);
            nombre[x]=leer.next();
            System.out.println("");
            System.out.println("Ingrese la edad "+ x);
            edad[x]=leer.nextInt();
            
        }
        for(int y=0; y<(edad.length);y++){
            if(edad[y]>a){
                a=edad[y];
                c=y;
            }
        }
        System.out.println("La edad mayor es: "+nombre[c]+" Con "+edad[c]+" años");
    }
    
}
