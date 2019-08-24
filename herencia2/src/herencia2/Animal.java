package herencia2;

public class Animal {
    
    
    
    private String Clase, color,segun_alimentacion;
    public Animal(String Clase, String color,String segun_alimentacion){
        this.Clase=Clase;
        this.color=color;    
        this.segun_alimentacion=segun_alimentacion;
    }
    
    
    public void mostrarDatos(){
        String datos=" ";
        datos="Especie: "+Clase+" \n "+"Color: "+color+" \n "+"Tipo de alimentacio: "+segun_alimentacion;
        System.out.println(datos);
                
    }
    
    
    
    
    
    
    
}
