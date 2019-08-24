
package ejerciciovector4;

import java.util.*;

public class Ejerciciovector4 {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int n, cont=0;
       double m, suma=0, promedio=0;
        System.out.println("Ingrese la cantidad de alumnos");
       n=leer.nextInt();
       double notas []=new double[n];
       
       for (int x=0; x<(notas.length);x++){
           System.out.println("Ingrese la nota del alumno"+ (x+1));
           notas[x]=leer.nextDouble();
           
       }
       for (int x=0; x<(notas.length);x++){
           suma=suma+notas[x];
           
       }
       promedio=suma/n;
       
       for(int x=0; x<(notas.length);x++){
           if (notas[x]>promedio){
               cont++;
           }
       }
       
        System.out.println("El promedio de las notas es: "+ (promedio));
        System.out.println("");
        System.out.println("La cantidad de alumnos que pasaron es: "+ cont);
    }
    
}
