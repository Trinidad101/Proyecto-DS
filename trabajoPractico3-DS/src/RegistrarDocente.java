
import java.util.ArrayList;


public class RegistrarDocente {
    
    public static ArrayList<Docente> docentes = new ArrayList();

    public void RegistroDocentes(){
        docentes.add(new Docente("Claudio", "Atencio", 26565063, "claudio@gmail.com", 15445263));
        docentes.add(new Docente("Pablo", "Ortiz", 26457312, "DavidOrtiz@gmail.com", 15254681));
    }
    
    
    public void MostrarDocentes() {

        System.out.println(" \t\tLista de Docentes");
        int pos = 1;
        for (Docente docente : docentes) {
            System.out.println();
            System.out.println(docente.nombre + " " + docente.apellido + " " + docente.dni + " " + docente.mail + " " + docente.telefono);
            pos++;
        }
        System.out.println("\n");
    }
    
}
