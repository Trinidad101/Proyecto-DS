
package tpractico2;

import java.util.ArrayList;


public class RegistrarMaterial {
       public static ArrayList <Material> materiales = new ArrayList();
    
    public void RegistrarMateriales (){
        
        materiales.add(new Material("Aislante nn 356",1233));
        materiales.add(new Material("Aislante nn 123",1244));
        materiales.add(new Material("Aislante nn 656",1255));
    } 
    
    public void MostrarMateriales()
    {
        System.out.println(" Lista de Materiales");
        int pos = 1;
        for(Material material: materiales){
            System.out.println();
            System.out.print(pos + "-" + material.getDescripcion() + "  $" + material.getPrecio());
        pos++;
        }
    }
}
