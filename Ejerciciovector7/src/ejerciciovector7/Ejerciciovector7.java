
package ejerciciovector7;

import java.util.Scanner;


public class Ejerciciovector7 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double salario[] = new double[4];
        double precio []= new double[4];
        double horas[]= new double [4];
        
        String nombre[]= new String [4];
        String dia[]= new String [7];
        
        int dia1[]=new int[6];
        
        double lunes[]=new double [4];
        double suma=0, total=0, a=0;
        
        int c=0;
        
        dia[0]="Lunes";
        dia[1]="Martes";
        dia[2]="Miercoles";
        dia[3]="Jueves";
        dia[4]="Viernes";
        dia[5]="Sabado";
        
        for (int x=0; x<salario.length; x++){
            System.out.println("Ingrese le nombre del trabajador: ");
            nombre[x]=leer.next();
            System.out.println("");
            for(int y=1; y<=6;y++){
                dia1[y]=y;
                System.out.println("Ingrese las horas trabajadas el dia "+ dia[y]);
                
                horas[y]=leer.nextDouble();
                if (dia1[y]== 0){
                    lunes[y]=horas[y];
                }
                
                System.out.println("");
                suma=suma+horas[y];
                horas[x]=suma;
                
            }
                
            
            
            System.out.println("Ingrese el valor por hora trabajada");
            precio[x]=leer.nextDouble();
            System.out.println("");
            
            salario[x]=(horas[x]*precio[x]);
            total=total+salario[x];
            
        }
        
        for(int x=0 ; x<lunes.length;x++){
            if(lunes[x]>a){
                a=lunes[x];
                c=x;
            }
        }
        
        for(int x=0; x<nombre.length;x++){
            System.out.println("El trabajador "+nombre[x]+ " ha trabajado en la semana "+ horas[x]);
            
        }
        
    }
    
}
