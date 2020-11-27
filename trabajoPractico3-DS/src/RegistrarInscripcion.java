
import java.util.ArrayList;


public class RegistrarInscripcion {
    
    
    public static ArrayList<Inscripcion> inscripciones = new ArrayList();

    public void MostrarInscripciones() {

        System.out.println(" \t\tLista de Inscrpciones");
        for (Inscripcion inscripcion : inscripciones) {
            System.out.println();
            System.out.println(inscripcion.getAlumno() + " " + inscripcion.getCurso());
        }
        System.out.println("\n");
    }

}
