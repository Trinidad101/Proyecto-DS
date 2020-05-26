
package javaapplication31;

import java.util.ArrayList;

public class Carrito {
     public static ArrayList <CarritoProd> productos = new ArrayList <CarritoProd>();
    
    
    public void Agregar(Producto producto, int cantidad){
        CarritoProd carritoProd = new CarritoProd();
        carritoProd.Producto = producto;
        carritoProd.Cantidad = cantidad;
        productos.add(carritoProd);
    }
    
    public void MostrarCarrito()
    {
        double total=0;
        System.out.println("\nTienes en tu carrito");
        
        for (CarritoProd carritoProd: productos) {
           double precio = carritoProd.Producto.precio;
           int cantidad = carritoProd.Cantidad;
           total= precio*cantidad;
           System.out.print(carritoProd.Producto.nombre + cantidad + "$" + total);
           
        }
    }
}
