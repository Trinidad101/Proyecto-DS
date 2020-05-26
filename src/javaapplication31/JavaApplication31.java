package javaapplication31;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaApplication31 {

    public static ArrayList <Pago> formaPago = new ArrayList<Pago>();
    public static void main(String[] args) {
      
         Usuario usuario1 = new Usuario ("Ayelen","Caseros 1387","Ayelen@gmail.com",".");
        formaPago.add(new Pago("Contado"));
        formaPago.add(new Pago("Tarjeta de credito"));
        RegistroProductos registroProductos = new RegistroProductos();
        Carrito carrito = new Carrito();
        
        registroProductos.RegistrarProductos();
        registroProductos.mostrarLista();
        String producto1;
        int Cant;
      
      
        Scanner entrada = new Scanner ( System.in );  
        System.out.print("Ingrese el producto que desea agregar: ");
        producto1 = entrada.nextLine();
        System.out.print("Ingrese la cantidad del producto: ");
        Cant = entrada.nextInt();
        
        System.out.println();
        System.out.println( "USUARIO: " + usuario1);
        carrito.MostrarCarrito();
    }
    
}  
