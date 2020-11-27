
import java.util.ArrayList;


public class RegistrarAlumno {
    
     public static ArrayList<Alumno> alumnos = new ArrayList();
    
    public void RegistroALumno()
    {
               
        alumnos.add(new Alumno("Trinidad", "Tessio", 41485601, "trinitessio@gmail.com", 15430142));
        alumnos.add(new Alumno("Ayelen", "Atencio", 41356452, "ayeAtencio@gmail.com", 15486321));
 
    }
    public void MostrarAlumnos() {

        System.out.println(" \t\tLista de Alumnos");
        int pos=1;
        for (Alumno alumno : alumnos) {
            System.out.println();
            System.out.println(alumno.nombre + " " + alumno.apellido + " " + alumno.dni + " " + alumno.mail + " " + alumno.telefono);
            pos++;
        }
        System.out.println("\n");
    }
    
}
