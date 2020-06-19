
package tpractico2;

import java.util.Scanner;

public class Tpractico2 {

      
    public static Cotizacion cotizador;
    public static void main(String[] args) {
          
      RegistrarCliente registrarCliente1 = new RegistrarCliente();
      registrarCliente1.registrarCliente();
      registrarCliente1.mostrarClientes();
      RegistrarMaterial registrarMaterial = new RegistrarMaterial();
      registrarMaterial.RegistrarMateriales();
      registrarMaterial.MostrarMateriales();
      
      SolicitudCotizacion();
     
    }
    
    public static double SolicitudCotizacion(){
        
        System.out.println();
        System.out.println("Seleccione un material: ");
        Scanner entrada = new Scanner ( System.in );
        String materialIngresado = entrada.nextLine();
        Integer posicion = Integer.parseInt(materialIngresado) - 1;
        Material material = RegistrarMaterial.materiales.get(posicion);
        
        System.out.println();
        System.out.print("Seleccione un espesor: ");
        Scanner espesor = new Scanner (System.in);
        String espesorIngresado = espesor.nextLine();
        int posicionEspesor = Integer.parseInt(espesorIngresado);
        
        System.out.println();
        System.out.print( "Introduzca la cantidad que desea comprar: ");
        entrada = new Scanner ( System.in );
        String metrosIngresados = entrada.nextLine();
        Double metrosCuadrados = Double.parseDouble(metrosIngresados);
        
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setMaterial(material);
        cotizacion.setMetrosCuadrados(metrosCuadrados);
        cotizacion.ObtenerCotizacion();
        return (0);
       
    }
    
    }
    
