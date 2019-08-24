/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import java.util.Scanner;
public class Herencia1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        String Numero_Placa;
        String color;
        String Marca;
        String Modelo;
        String aerolinea;
        int Capacidad_Max, op=0;
        
        System.out.println("[1]Bus");
        System.out.println("[2]Avion");
        System.out.println("");
        
        System.out.println("Selecione una de las opciones: ");
        
        switch(op){
            case 1:
                System.out.println("");
                System.out.println("Ingrese el numero de placa: ");
                Numero_Placa=leer.next();
                System.out.println("");
                System.out.println("Ingrese un color: ");
                color= leer.next();
                System.out.println("");
                System.out.println("Ingrese la marca: ");
                Marca=leer.next();
                System.out.println("");
                System.out.println("Ingrese el modelo: ");
                Modelo=leer.next();
                System.out.println("");
                System.out.println("Ingrese cantidad maxima de pasajeros: ");
                Capacidad_Max=leer.nextInt();

                Bus Buses = new Bus(Numero_Placa, color, Marca, Modelo, Capacidad_Max);
                System.out.println("Datos actuales");
                Buses.MostrarDatos();


                System.out.println("");
                System.out.println("Modificacion de la Placa");


                Buses.setPlaca("22s2ad54ad3a");
                Buses.MostrarDatos();
                
                break;
            
            case 2:
                
                System.out.println("Ingrese el numero de placa: ");
                Numero_Placa=leer.next();
                System.out.println("");
                System.out.println("Ingrese un color: ");
                color= leer.next();
                System.out.println("");
                System.out.println("Ingrese la marca: ");
                Marca=leer.next();
                System.out.println("");
                System.out.println("Ingrese el modelo: ");
                Modelo=leer.next();
                System.out.println("");
                System.out.println("Ingrese cantidad maxima de pasajeros: ");
                System.out.println("");
                System.out.println("Ingrese una aerolinea: ");
                aerolinea=leer.next();
                Capacidad_Max=leer.nextInt();

                Avion aviones = new Avion(Numero_Placa, color, Marca, Modelo, Capacidad_Max);
                System.out.println("");
                System.out.println("Datos actuales");
                aviones.MostrarDatos();


                System.out.println("");
                System.out.println("Modificacion de la Placa");


                aviones.Aerolinea(aerolinea);
                aviones.MostrarDatos();
                
                break;
        }
        
        
        
        
        
       
                
        
                
                
                
                
    }
    
}
