
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        RegistrarAlumno registrarAlumno = new RegistrarAlumno();
        RegistrarDocente registrarDocente = new RegistrarDocente();
        RegistrarCurso registrarCurso = new RegistrarCurso();
        RegistrarInscripcion registrarInscripcion = new RegistrarInscripcion();

        registrarAlumno.RegistroALumno();
        registrarDocente.RegistroDocentes();
        registrarCurso.RegistroCursos();

        int opc;
        do {
            System.out.print("\n¿Que desea realizar?");
            System.out.print("\n1:Agregar curso  2:Planificacion 3:Asignar Docente  4:RegistrarInscripcion  5:Salir\n");
            System.out.print("\nOpcion: ");
            opc = entrada.nextInt();
            switch (opc) {

                case 1:
                    agregarCurso(registrarDocente, registrarCurso);
                    break;

                case 2:
                    planificacion(registrarCurso, registrarDocente);
                    break;

                case 3:
                    AsignarDocente(registrarCurso, registrarDocente);
                    break;

                case 4:
                    RegistrarInscripcion(registrarCurso, registrarAlumno, registrarInscripcion);
                    break;

                default:
                    break;
            }

        } while (opc != 5);
    }

    public static void agregarCurso(RegistrarDocente registrarDocente, RegistrarCurso registrarCurso) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del curso: ");
        String nombre = entrada.nextLine();
        System.out.print("DescripciÃ³n: ");
        String descripcion = entrada.nextLine();
        System.out.print("Seleccione docente\n\n");
        registrarDocente.MostrarDocentes();
        System.out.print("docente: ");
        int opc = entrada.nextInt();
        int pos = opc - 1;
        Docente docente = registrarDocente.docentes.get(pos);
        Curso curso = new Curso(nombre, descripcion);
        curso.ingresarDocente(docente);
        registrarCurso.cursos.add(curso);

        registrarCurso.MostrarCursos();
    }

    public static void planificacion(RegistrarCurso registrarCurso, RegistrarDocente registrarDocente) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nSeleccione un curso\n\n");

        registrarCurso.MostrarCursos();
        System.out.print("curso: ");
        int opc1 = entrada.nextInt();
        int pos1 = opc1 - 1;
        Curso curso = registrarCurso.cursos.get(pos1);

        System.out.print("Horario: ");
        entrada.nextLine();
        String horario = entrada.nextLine();
        curso.setHorario(horario);
        System.out.print("Fecha Inicio: ");
        String fechaInicio = entrada.nextLine();
        curso.setFechaInicio(fechaInicio);
        System.out.print("Fecha Fin: ");
        String fechaFin = entrada.nextLine();
        curso.setFechaFin(fechaFin);
        System.out.print("Seleccione un docente\n\n");
        registrarDocente.MostrarDocentes();
        System.out.print("docente: ");
        int opc2 = entrada.nextInt();
        int pos2 = opc2 - 1;
        Docente docente = registrarDocente.docentes.get(pos2);
        curso.ingresarDocente(docente);
        System.out.print("Aula: ");
        int aula = entrada.nextInt();
        curso.setAula(aula);
        System.out.print("Cupo minimo: ");
        int cupoMinimo = entrada.nextInt();
        curso.setCupoMinimo(cupoMinimo);
        System.out.print("Cupo maximo: ");
        int cupoMaximo = entrada.nextInt();
        curso.setCupoMaximo(cupoMaximo);
        System.out.print("Fecha Limite para inscripcion: ");
        entrada.nextLine();
        String fechaLimite = entrada.nextLine();
        curso.setFechaLimiteInscripcion(fechaLimite);
    }

    public static void AsignarDocente(RegistrarCurso registrarCurso, RegistrarDocente registrarDocente) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nSeleccione un curso\n\n");

        registrarCurso.MostrarCursos();
        System.out.print("curso: ");
        int opc3 = entrada.nextInt();
        int pos3 = opc3 - 1;
        Curso curso = registrarCurso.cursos.get(pos3);

        System.out.print("\n\nSeleccione un docente\n\n");

        registrarDocente.MostrarDocentes();
        System.out.print("docente: ");
        int opc4 = entrada.nextInt();
        int pos4 = opc4 - 1;
        Docente docente = registrarDocente.docentes.get(pos4);
        curso.ingresarDocente(docente);

    }

    public static void RegistrarInscripcion(RegistrarCurso registrarCurso, RegistrarAlumno registrarAlumno, RegistrarInscripcion registrarInscripcion) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nSeleccione un curso\n\n");

        registrarCurso.MostrarCursos();
        System.out.print("curso: ");
        int opc5 = entrada.nextInt();
        int pos5 = opc5 - 1;

        Curso curso = registrarCurso.cursos.get(pos5);
        entrada.nextLine();
        System.out.print("\nDatos del Alumno\n");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("DNI: ");
        int dni = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Mail: ");
        String mail = entrada.nextLine();
        System.out.print("Telefono: ");
        int telefono = entrada.nextInt();
        Alumno alumno = new Alumno(nombre, apellido, dni, mail, telefono);
        curso.ingresarAlumno(alumno);
        Inscripcion inscripcion = new Inscripcion(alumno, curso);
        curso.ingresarInscripcion(inscripcion);
        registrarInscripcion.inscripciones.add(inscripcion);
        curso.ingresarInscripcion(inscripcion);
    }
}
