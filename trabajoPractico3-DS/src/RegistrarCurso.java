
import java.util.ArrayList;


public class RegistrarCurso {
    public static ArrayList<Curso> cursos = new ArrayList();
   

    public void RegistroCursos() {
        
        cursos.add(new Curso("Excel", "para empresas"));
        cursos.add(new Curso("Lenguajes de programacion", "para alumnos de ingenieria en Sistemas"));
    }
    
    public void MostrarCursos() {

        System.out.println(" \t\tLista de Cursos");
        for (Curso curso : cursos) {
            System.out.println();
            System.out.println(curso.nombre + " " + curso.descripcion);
        }
        System.out.println("\n");
    }
    
}
