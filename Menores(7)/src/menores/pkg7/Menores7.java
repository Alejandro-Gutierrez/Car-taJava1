package menores.pkg7;

import java.util.Scanner;
public class Menores7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont=1, num,cantidad;
        int My=0,Mn=0,Ig=0;
        System.out.println("Ingrese la cantidad de numeros: ");
        cantidad=leer.nextInt();
        while (cont<=cantidad){
            System.out.println("Ingrese un numero: ");
            num=leer.nextInt();
            if (num>0){
                My++;
            }
            if(num<0){
                Mn++;
            }
            if(num==0){
                Ig++;
            }
            cont++;
        }
        System.out.println("Numeros mayores que cero: "+ My);
        System.out.println("Numeros menores que cero: "+ Mn);
        System.out.println("Numeros Iguales que cero: "+ Ig);
        
        
        
    }
    
}
