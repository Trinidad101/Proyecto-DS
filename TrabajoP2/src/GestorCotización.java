import java.util.Scanner;

public class GestorCotización {
    public static Cotizacion cotizador;

    public static void main(String[] args) {
        RegistroCliente registroCliente1 = new RegistroCliente();
        RegistroMaterial registrarMaterial1 = new RegistroMaterial();
        RegistroEspesor registroEspesor1 = new RegistroEspesor();
        
        registroCliente1.registrarCliente();
        registroCliente1.mostrarCLiente();
        registroEspesor1.registrarEspesor();
        registrarMaterial1.registroMateriales();
        registrarMaterial1.mostrarMateriales();
        registroEspesor1.mostrarEspesor();
        
        SolicitudCotizacion();
    }

     public static double SolicitudCotizacion(){
        
        System.out.println();
        System.out.print("Seleccione un material: ");
        Scanner entrada = new Scanner ( System.in );
        String materialIngresado = entrada.nextLine();
        Integer posicion = Integer.parseInt(materialIngresado) - 1;
        Material material = RegistroMaterial.materiales.get(posicion);
        
        System.out.println();
        System.out.print("Seleccione un espesor: ");
        Scanner espesor = new Scanner (System.in);
        String espesorIngresado = espesor.nextLine();
        int posicionEspesor = Integer.parseInt(espesorIngresado)-1;
        Espesor item = RegistroEspesor.espesor.get(posicionEspesor);
        
        System.out.println();
        System.out.print( "Introduzca la cantidad de metros cuadrados que desea comprar: ");
        entrada = new Scanner ( System.in );
        String metrosIngresados = entrada.nextLine();
        Double metrosCuadrados = Double.parseDouble(metrosIngresados);
        
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setMaterial(material);
        cotizacion.setMetrosCuadrados(metrosCuadrados);
        System.out.println("La cotizacion es: " + cotizacion.ObtenerCotizacion());
        return(0);
    }
}
