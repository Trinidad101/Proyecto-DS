
package tpractico2;

import java.util.ArrayList;

public class RegistrarCliente {
       private static ArrayList <Cliente> clientes = new ArrayList();

   public void registrarCliente(){
       clientes.add(new Cliente("Trinidad", "Tessio","Empresa","Domicilio1","trinitessio101@gmail.com",15698754));
    }
   
   public static void mostrarClientes()
   {
       System.out.println(" Lista de Clientes");
       for(Cliente cliente: clientes){
           System.out.println();
           System.out.print(cliente);
       }
       System.out.println("\n");
   }
}
