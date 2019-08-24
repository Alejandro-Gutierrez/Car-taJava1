
package ejercicio25;

import java.util.Scanner;
public class Ejercicio25 {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int pedro=90,pablo=170;
        do{
            pedro=pedro+1;
            pablo=pablo-1;
            
        }while(pedro<pablo);
        System.out.println("Se encuentran en el punto "+pedro);
        

    }
    
}
