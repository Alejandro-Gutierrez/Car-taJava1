/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovector6;

import java.util.Scanner;

/**
 *
 * @author NIÑOS
 */
public class Ejerciciovector6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pos=0, neg=0, neu=0;
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
                    
                    neg++;
                }
                if(vect[x][y]>0){
                    pos++;
                }
                if(vect[x][y]==0){
                    neu++;
                }
            }
            
        }
        System.out.println("Hay "+ neg +" negativo");
        System.out.println("Hay " + pos +" positivo");
        System.out.println("Hay "+ neu+ " neutro");
    }
    
}
