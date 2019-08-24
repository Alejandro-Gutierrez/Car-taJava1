
package herencia1;

public class Vehiculos {
    private String Numero_Placa;
    private String color;
    private String Marca;
    private String Modelo;
    private int Capacidad_Max;

    public Vehiculos(String Numero_Placa, String color, String Marca, String Modelo, int Capacidad_Max) {
        this.Numero_Placa = Numero_Placa;
        this.color = color;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Capacidad_Max = Capacidad_Max;
        
    
        
        
        
    }
    public void setPlaca(String Placa){   
        
        this.Numero_Placa=Placa;
        
        
    }
    
    public void MostrarDatos(){
        String datos=" ";
        datos="Numero de placa: "+Numero_Placa+" \n "+"Color: "+color+" \n "+"Marca: "+ Marca+" \n "+"Modelo: "+Modelo+" \n "+"Capacidad Maxima: "+ Integer.toString(Capacidad_Max);
        System.out.println(datos);
    }
    
    
    
}
