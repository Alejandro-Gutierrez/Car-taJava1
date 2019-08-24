
package ejercicio22;
import java.util.Scanner;
public class Ejercicio22 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cantidad,cantidad1;
        double nota,suma=0;
        
        System.out.println("Ingrese la cantidad de alumnos");
        cantidad=leer.nextInt();
        
        for(int x=1;x<=cantidad;x++){
            System.out.println("");
            System.out.println("Ingrese la alumno "+ x);
            System.out.println("");
            
            System.out.println("Ingrese la cantidad de notas: ");
            cantidad1=leer.nextInt();
            System.out.println("");
            for(int y=1;y<=cantidad1;y++){
                
                System.out.println("Ingrese la Nota "+y);
                
                nota=leer.nextDouble();
                suma=suma+nota;
                
               
            }
            if ((suma/cantidad1)>=3){
                System.out.println("El alumno "+x +" Aprobo con una nota de: "+ (suma/cantidad1));
                    
            } 
            else{
                System.out.println("El alumno "+x +" Desaprobo con una nota de: "+ (suma/cantidad1));
            }
        }
    }
    
}
