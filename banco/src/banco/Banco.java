package banco;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op;
        System.out.println("Tipos de tarjetas");
        System.out.println("[1] Tipo 1");
        System.out.println("[2] Tipo 2");
        System.out.println("[3] Tipo 3");
        System.out.println("[4] Otro tipo");
        System.out.println("[5] Mas de dos tarjetas");
        op=leer.nextInt();
        switch(op){
            case 1:
                System.out.println("El aumento de su credito aumento en 25%");
                break;
            case 2:
                System.out.println("El aumento de su credito aumento en 35%");
                break;
            case 3:
                System.out.println("El aumento de su credito aumento en 40%");
                break;
            case 4:
                System.out.println("El aumento de su credito aumento en 50%");
                break;
                
            case 5:
                int op2;
                System.out.println("Seleccione un tipo de tarjeta");
                System.out.println("Tipos de tarjetas");
                System.out.println("[1] Tipo 1");
                System.out.println("[2] Tipo 2");
                System.out.println("[3] Tipo 3");
                System.out.println("[4] Otro tipo");
                op2=leer.nextInt();
                switch(op2){
                   case 1:
                        System.out.println("El aumento de su credito aumento en 25%");
                        break;
                    case 2:
                        System.out.println("El aumento de su credito aumento en 35%");
                        break;
                    case 3:
                        System.out.println("El aumento de su credito aumento en 40%");
                        break;
                    case 4:
                        System.out.println("El aumento de su credito aumento en 50%");
                        break; 

                }
                break;
        }
    }
}
