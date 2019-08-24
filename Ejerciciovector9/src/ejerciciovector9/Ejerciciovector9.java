package ejerciciovector9;

import java.util.Scanner;
public class Ejerciciovector9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese le tamaño de los vectores");
        int n;
        n=leer.nextInt();
        int b[]= new int[n];
        int a[]= new int[n];
        int c[]= new int[n];
        
        for(int x=0; x<b.length; x++){
            System.out.println("Ingrese un numero para el vector 1");
            a[x]=leer.nextInt();
            System.out.println("");
            System.out.println("Ingrese un numero para el vector 2");
            b[x]=leer.nextInt();
            
            c[x]=(a[x]+b[x]);
        }
         for(int x=0; x<b.length; x++){
            System.out.print("Los resultados de las sumas es: "+c[x]+" ");
            
            
            
        }
        
    }
    
}
