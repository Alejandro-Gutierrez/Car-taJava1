package banco.pkg8;

import java.util.Scanner;

public class Banco8 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       double valor,aumento=0.3, total=0,suma;
       
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        valor=leer.nextDouble();
        suma=((valor)+(valor*aumento));
        for (int x=1; x<=2;x++){
            total=(total+suma)+((total+suma)*0.3);
        }
        
        
        System.out.println("El ahorro total para cuando mari pueda utilizar el dinero es: "+total);
        
       
    }
    
}
