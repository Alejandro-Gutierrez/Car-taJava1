package manodeobra;
import java.util.Scanner;
public class Manodeobra {


    public static void main(String[] args) {
     
     Scanner leer = new Scanner(System.in);
     
     double costo_produccion, materia_prima, mano_obra, gasto_fabricacion, precio_venta;
     
     int clave;
     System.out.println("Ingrese el valor de la materia prima: ");
     materia_prima=leer.nextDouble();
     
     System.out.println("");
     
     System.out.println("Ingrese la clave del articulo: ");
     clave = leer.nextInt();
     
        switch (clave) {
            case 1:
                mano_obra=(materia_prima*0.80);
                gasto_fabricacion=(materia_prima*0.28);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            case 2:
                mano_obra=(materia_prima*0.85);
                gasto_fabricacion=+(materia_prima*0.30);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            case 3:
                mano_obra=(materia_prima*0.75);
                gasto_fabricacion=(materia_prima*0.35);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            case 4:
                mano_obra=(materia_prima*0.75);
                gasto_fabricacion=(materia_prima*0.28);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            case 5:
                mano_obra=(materia_prima*0.80);
                gasto_fabricacion=(materia_prima*0.30);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            case 6:
                mano_obra=(materia_prima*0.85);
                gasto_fabricacion=(materia_prima*0.35);
                costo_produccion = materia_prima + mano_obra + gasto_fabricacion;
                precio_venta= (costo_produccion) + (costo_produccion*0.45);
                System.out.println("El precion para la venta es de: "+ precio_venta);
                break;
            default:
                System.out.println("Esta opcion no es valido");
                break;
        }
    }
    
}
