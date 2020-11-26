
import java.util.ArrayList;


public class RegistroCliente {
    
    public static ArrayList <Cliente> clientes = new ArrayList();
    
    public void registrarCliente(){
        clientes.add(new Cliente("trinidad", "Tessio","SA","Caseros 1387","trinitessio@gmail.com",15487632));
        }
    
    public void mostrarCLiente(){
        System.out.println("\n\t\t\t  Lista de Clientes\n");
        for(Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
}
