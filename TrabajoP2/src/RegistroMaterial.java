
import java.util.ArrayList;


public class RegistroMaterial {
    
   public static ArrayList <Material> materiales = new ArrayList();
    
    public void registroMateriales()
    {
        materiales.add(new Material("Material 1",154));
    }
    
    public void mostrarMateriales(){
        System.out.println("\n\t\t\t  Lista de Materiales\n");
        for(Material material: materiales){
            System.out.println(material);
        }
    }
}
