
package ejerciciovector2;

/**
 *
 * @author NIÑOS
 */
import java.util.Scanner;
public class Ejerciciovector2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, n;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
                
        n=leer.nextInt();
        
        int burbuja [] = new int[n];
        
        for(int x=0; x<burbuja.length;x++){
            System.out.println("Ingrese un numero: ");
            burbuja[x]=leer.nextInt();
        }
        System.out.println("Vector Desordenado:");
        System.out.println("");
        for(int x=0; x<burbuja.length;x++){
            System.out.print(burbuja[x]+" ");
            
        }
        
        
        
         for(int i = 2; i < burbuja.length; i++){
            for(int j = 0;j < burbuja.length-i;j++){
                if(burbuja[j] > burbuja[j+1]) {
                cont = burbuja[j];
                burbuja[j] = burbuja[j+1];
                burbuja[j+1] = cont;
              }
            }
         }
        
        System.out.println("");
        System.out.println("Vector Ordenado:");
        System.out.println("");
        for(int x=0; x<burbuja.length;x++){
            
                 
            System.out.print(burbuja[x]+" ");
            
        }
    }
    
}
