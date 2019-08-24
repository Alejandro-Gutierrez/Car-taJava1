
package ejercicio.pkg12;

import java.util.Scanner;
public class Ejercicio12 {


    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    for(int x=1;x<=100;x++){
        if(x%3==0 && x%5==0){
            System.out.println(x+" FIZZ BUZZ");
        }else{
            if(x%3==0 ){
            System.out.println(x+" FIZZ");
        }
        if(x%5==0){
            System.out.println(x+" BUZZ");
        }
        }
        
    }
    }
    
}
