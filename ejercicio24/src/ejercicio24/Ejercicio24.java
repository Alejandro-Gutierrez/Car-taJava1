package ejercicio24;
import java.util.Scanner;
public class Ejercicio24 {

   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int op, valor_Youtube=15, visitas;
        double valor;
        
        System.out.println("Informacion sobre los videos");
        System.out.println("");
        System.out.println("Video de Top 7 son de tipo 1");
        System.out.println("Dross cuente 3 historia de terror son de tipo 2");
        System.out.println("Dross contesta preguntas estupidas son de tipo 3");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese el tipo video:");
        op=leer.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Cuantas visitas obtuvo el video: ");
                visitas=leer.nextInt();
                valor=(visitas*valor_Youtube)+(visitas*valor_Youtube*0.10);
                System.out.println("");
                System.out.println("El valor a pagar por el video es de: "+ valor);
                break;
                
            case 2:
                System.out.println("Cuantas visitas obtuvo el video: ");
                visitas=leer.nextInt();
                valor=(visitas*valor_Youtube)+(visitas*valor_Youtube*0.07);
                System.out.println("");
                System.out.println("El valor a pagar por el video es de: "+ valor);

                break;
                
            case 3:
                System.out.println("Cuantas visitas obtuvo el video: ");
                visitas=leer.nextInt();
                valor=(visitas*valor_Youtube)+(visitas*valor_Youtube*0.05);
                System.out.println("");
                System.out.println("El valor a pagar por el video es de: "+ valor);
                
                break;
        }
        
    }
    
}
