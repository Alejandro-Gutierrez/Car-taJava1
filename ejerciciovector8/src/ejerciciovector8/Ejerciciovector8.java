
package ejerciciovector8;

import java.util.Scanner;
public class Ejerciciovector8 {

    
    public static void main(String[] args) {
        int mult1, mult2, det=0;
        int matriz[][] = new int [3][3];
        Scanner leer = new Scanner(System.in);
        for(int x=0;x<(matriz.length);x++){
            for(int y=0; y<(matriz.length);y++){
                System.out.println("Ingrese un numero para la posicion "+ x +" - "+ y);
                matriz[x][y]=leer.nextInt();
                
             
            }
        }
        for(int x=0;x<(matriz.length);x++){
            for(int y=0; y<(matriz.length);y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
        
        for(int x=0;x<(matriz.length);x++){
            for(int y=0; y<(matriz.length);y++){
                
                
                mult1=((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[1][0]*matriz[2][1]*matriz[0][2]));
                
                mult2=((matriz[0][2]*matriz[1][1]*matriz[2][0])+
                       (matriz[0][1]*matriz[1][0]*matriz[2][2])+
                       (matriz[1][2]*matriz[2][1]*matriz[0][0]));
                
                det=mult1-mult2;
            }
        }
        System.out.println("");
        System.out.println("EL determinante es:");
        System.out.println(det);
       
    }
    
}
