/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;


public class perro extends Animal{

    private String Clase1;
    public perro(String Clase, String color, String segun_alimentacion) {
        super(Clase, color, segun_alimentacion);
    }
    
    public void setEspecie(String especie){
        this.Clase1=especie;
        System.out.println(Clase1);
    }
    
}
