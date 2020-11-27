
import java.util.ArrayList;


public class Curso {
    
    public String nombre;
    public String descripcion;
    private String horario;
    private String fechaInicio;
    private String fechaFin;
    public static ArrayList<Docente> docentes = new ArrayList();
    public static ArrayList<Alumno> alumnos = new ArrayList();
    public static ArrayList<Inscripcion> inscripciones = new ArrayList();
    private String fechaLimiteInscripcion;
    private int aula;
    private int cupoMinimo;
    private int cupoMaximo;

    public Curso(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaLimiteInscripcion() {
        return fechaLimiteInscripcion;
    }

    public void setFechaLimiteInscripcion(String fechaLimiteInscripcion) {
        this.fechaLimiteInscripcion = fechaLimiteInscripcion;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public void ingresarDocente(Docente docente) {
        docentes.add(docente);
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

    public void ingresarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void MostrarAlumnos() {

        System.out.println(" \t\tLista de Alumnos");
        int pos = 1;
        for (Alumno alumno : alumnos) {
            System.out.println();
            System.out.println(alumno.nombre + " " + alumno.apellido + " " + alumno.dni + " " + alumno.mail + " " + alumno.telefono);
            pos++;
        }
        System.out.println("\n");
    }
    
    public void ingresarInscripcion(Inscripcion inscripcion){
        inscripciones.add(inscripcion);
    }

     public void MostrarInscripciones() {

        System.out.println(" \t\tLista de Inscrpciones");
        for (Inscripcion inscripcion: inscripciones) {
            System.out.println();
            System.out.println(inscripcion.getAlumno() + " " + inscripcion.getCurso());
        }
        System.out.println("\n");
    }
     
    public void setCupoMinimo(int cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

}
