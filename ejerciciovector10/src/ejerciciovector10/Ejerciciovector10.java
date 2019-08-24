
package ejerciciovector10;

import java.util.Scanner;

/**
 *
 * @author NIÑOS
 */
public class Ejerciciovector10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maz [][]= new int [3][3];
        int maz2 [][]= new int [3][3];
        int res [][]= new int [3][3];
        int m=0,n=0,n2=0;
        Scanner leer = new Scanner(System.in);
        for (int x=0; x<maz.length;x++){
            for (int y=0; y<maz.length;y++){
                System.out.println("Ingrese un numero para la posicion " + x +" - "+y);
                        
                maz[x][y]=leer.nextInt();
            }
        }
         for (int x=0; x<maz.length;x++){
            for (int y=0; y<maz.length;y++){
                System.out.println("Ingrese un numero para la posicion " + x +" - "+y);
                        
                maz2[x][y]=leer.nextInt();
            }
        }
         
        for (int x=0; x < res.length; x++) {
  for (int y=0; y < res[x].length; y++) {
    for (int z=0; z<m; z++) {
      
    }
  }
}
         
        
        
        
    }
    
}
