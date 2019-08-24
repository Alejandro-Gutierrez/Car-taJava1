
package herencia2;

import java.util.Scanner;
public class Herencia2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Especie, color, segun_alimentacion;
        
        
        
        System.out.println("Ingrese la Clase de perro: ");
        Especie=leer.next();
        System.out.println("");
        
        System.out.println("Ingrese el color del animal: ");
        color=leer.next();
        System.out.println("");
        
      
        System.out.println("Ingrese el Tipo de alimentacion del animal: ");
        segun_alimentacion=leer.next();
        System.out.println("");
        
        perro animal= new perro(Especie, color, segun_alimentacion);
        animal.mostrarDatos();
        
        System.out.println("");
        animal.setEspecie("leon");//Puede modificar la especie
        
        
    }
    
}
