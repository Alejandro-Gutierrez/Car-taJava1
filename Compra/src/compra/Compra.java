package compra;
import java.util.Scanner;
public class Compra {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double pagodiciembre;
       System.out.println("Ingrese valor de pago");
          
      pagodiciembre=leer.nextDouble();
      if (pagodiciembre>=500000){
          System.out.println("Puede comprar el paqute A");
          System.out.println("");
          System.out.println("El paqueta inculuye:");
          System.out.println("[x] Televisón");
          System.out.println("[x] Consola de video juego");
          System.out.println("[x] Tres pares de zapatos");
          System.out.println("[x] Cinco camisas");
          System.out.println("[x] Cinco pantalones");
          
      }
      if (pagodiciembre<500000 && pagodiciembre>=200000){
          System.out.println("Puede comprar el paqute B");
          System.out.println("");
          System.out.println("El paqueta inculuye:");
          System.out.println("[x] Una grabadora");
          System.out.println("[x] Tres pares de zapatos");
          System.out.println("[x] Cinco camisas");
          System.out.println("[x] Cinco pantalones");
      }
      if(pagodiciembre<200000 && pagodiciembre>=100000){
          System.out.println("Puede comprar el paqute C");
          System.out.println("");
          System.out.println("El paqueta inculuye:");
          System.out.println("[x] Dos pares de zapatos");
          System.out.println("[x] Tres camisas");
          System.out.println("[x] Tres pantalones");
      }
      if (pagodiciembre<100000 && pagodiciembre>0){
           System.out.println("Puede comprar el paqute D");
          System.out.println("");
          System.out.println("El paqueta inculuye:");
          System.out.println("[x] Un pares de zapatos");
          System.out.println("[x] Dos camisas");
          System.out.println("[x] Dos pantalones");
      }
      
    }
    
}
