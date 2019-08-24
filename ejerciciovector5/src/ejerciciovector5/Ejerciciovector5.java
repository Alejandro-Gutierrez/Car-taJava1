
package ejerciciovector5;

import java.util.Scanner;
public class Ejerciciovector5 {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int vect [][]= new int[6][8];
        
        for(int x=0;x<(vect.length);x++){
            for(int y=0; y<(vect.length+2);y++){
                System.out.println("");
                System.out.println("Ingrese un numero para la posicio: "+ x +" "+ y);
                vect[x][y]=leer.nextInt();
            }
        }
        
        for(int x=0;x<(vect.length);x++){
            for(int y=0; y<(vect.length+2);y++){
                if(vect[x][y]<0){
                    System.out.println("El numero se encuantra en la posicio "+ x +" - "+ y);
                }
            }
            System.out.println("");
        }
        
        for(int x=0;x<(vect.length);x++){
            for(int y=0; y<(vect.length+2);y++){
                System.out.print(vect[x][y]+" ");
            }
            System.out.println("");
        }
    }
    
}
