
package javaapplication31;

import java.util.ArrayList;

public class RegistroProductos {
    public static ArrayList<Producto> productos = new ArrayList();
    
    public void RegistrarProductos() {
    
      productos.add(new Producto("Televisor",250142));
      productos.add(new Producto("Computadora",35000));
      productos.add(new Producto("Celular",15000));
      productos.add(new Producto("Campera",3155));

    }
    
    public static void mostrarLista ()
    {
        System.out.println(" Lista de Productos");
        for(Producto producto: productos){
            System.out.println();
            System.out.print(producto.nombre + "$" + producto.precio);
        }
        System.out.println("\n");
    }
}
