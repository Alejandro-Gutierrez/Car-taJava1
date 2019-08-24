package herencia1;

public class Avion  extends Vehiculos{
    
    private String aeroline;
    public Avion(String Numero_Placa, String color, String Marca,String Modelo,int Capacidad_Max){
        super(Numero_Placa, color,  Marca,  Modelo,  Capacidad_Max);
        
        
    }
    
    
    public void Aerolinea(String linea){
        this.aeroline=linea;
        
    }
}
