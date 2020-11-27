
package openshop_cobranza1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import static openshop_cobranza1.Json.JSON_MAPPER;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class OpenShop_cobranza1 {

   
    public static void main(String[] args) throws IOException {
        
        TarjetaCredito tarjetaCredito = new  TarjetaCredito();
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        Efectivo efectivo = new Efectivo();
                                          
    
        int opc;
        do {
            System.out.print("\nELIJA LA OPCION DE PAGO");
            System.out.print("\n1:EFECTIVO  2:TARJETA DE CREDITO 3:TARJETA DE DEBITO  4:SALIR\n");
            System.out.print("\nOPCION: ");
            Scanner entrada = new Scanner (System.in);
            opc = entrada.nextInt();
            
            switch (opc) {

                case 1:
                    PagoEnEfectivo(efectivo);
                    break;

                case 2:
                    registrarTarjetaCredito(tarjetaCredito);
                    break;

                case 3:
                    registrarTarjetaDebito(tarjetaDebito);
                    break;

                default:
                    break;
            }

        } while (opc != 4);
        
//        leerOrdenCompra();
          OrdenPaga ordenPaga = new OrdenPaga();
//        ordenPaga.setIdVenta("21247");
//        ordenPaga.getPago();
//        System.out.println(ordenPaga);
//        JSON_MAPPER.writeValue(new File("C:/Users/Usuario/Documents/NetBeansProjects/OpenShop_cobranza1/FormaDePago.json"), ordenPaga);
        
               
    }
    
    public static void PagoEnEfectivo(Efectivo efectivo) throws IOException {
        Scanner entrada = new Scanner(System.in);
        boolean confirmacion;
        String opcion;
        
        System.out.print("\nNOMBRE CLIENTE: ");
        String nombreCliente = entrada.nextLine();
        efectivo.setNombreDeCliente(nombreCliente);
        System.out.print("\nNUMERO DE PAGO: ");
        long numeroPago = entrada.nextInt();
        efectivo.setNumeroDePago(numeroPago);
        entrada.nextLine();
        System.out.print("\nFECHA DE PAGO: ");
        String fechaPago = entrada.nextLine();
        efectivo.setFechaDePago(fechaPago);
        System.out.print("\n¿ESTA SEGURO DE REALIZAR LA COMPRA? SI - NO");
        System.out.print("\nCONFIRMACION DE PAGO = ");
        opcion = entrada.nextLine();
        confirmacion = ConfirmacionDePago(opcion);
        FormaPago formaPago = new FormaPago();
        formaPago.setEfectivo(efectivo);
        Pago pago = new Pago(0, formaPago, 56234,confirmacion);
        OrdenPaga ordenPaga = new OrdenPaga();
        ordenPaga.setPago(pago);
        if (confirmacion) {
            System.out.println(ordenPaga);

            JSON_MAPPER.writeValue(new File("C:/Users/Usuario/Documents/NetBeansProjects/OpenShop_cobranza1/FormaDePago.json"), pago);
        }
    }

    public static void registrarTarjetaCredito(TarjetaCredito tarjetaCredito) throws IOException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nNUMERO DE TARJETA: ");
        long numeroTarjeta = entrada.nextLong();
        tarjetaCredito.setNumeroDeTarjeta(numeroTarjeta);
        entrada.nextLine();
        System.out.print("\nNOMBRE DEL TITULAR: ");
        String nombreTitular = entrada.nextLine();
        tarjetaCredito.setNombreTitular(nombreTitular);
        System.out.print("\nCODIGO DE SEGURIDAD: ");
        int codigoSeguridad = entrada.nextInt();
        tarjetaCredito.setCodigoDeSeguridad(codigoSeguridad);
        entrada.nextLine();
        System.out.print("\nENTIDAD EMISORA: ");
        String entidadEmisora = entrada.nextLine();
        tarjetaCredito.setEntidadEmisora(entidadEmisora);
        System.out.print("\nFECHA DE INICIO: ");
        String fechaInicio = entrada.nextLine();
        tarjetaCredito.setFechaInicio(fechaInicio);
        System.out.print("\nFECHA DE VENCIMIENTO: ");
        String fechaVencimiento = entrada.nextLine();
        tarjetaCredito.setFechaVencimiento(fechaVencimiento);
        System.out.print("\n¿ESTA SEGURO DE REALIZAR LA COMPRA? SI - NO");
        System.out.print("\n\nCONFIRMACION DE PAGO = ");
        String opcion = entrada.nextLine();
        boolean confirmacion = ConfirmacionDePago(opcion);
        FormaPago formaPago = new FormaPago();
        formaPago.setTarjetaCredito(tarjetaCredito);
        Pago pago = new Pago(1, formaPago, 56234,confirmacion);
        OrdenPaga ordenPaga = new OrdenPaga();
        ordenPaga.setPago(pago);
        if(confirmacion){
        System.out.println(pago);

        JSON_MAPPER.writeValue(new File("C:/Users/Usuario/Documents/NetBeansProjects/OpenShop_cobranza1/FormaDePago.json"), pago);
}
    }

    public static void registrarTarjetaDebito(TarjetaDebito tarjetaDebito) throws IOException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nNUMERO DE TARJETA: ");
        long numeroTarjeta = entrada.nextInt();
        tarjetaDebito.setNumeroDeTarjeta(numeroTarjeta);
        entrada.nextLine();
        System.out.print("\nNOMBRE DEL TITULAR: ");
        String nombreTitular = entrada.nextLine();
        tarjetaDebito.setNombreTitular(nombreTitular);
        System.out.print("\nCODIGO DE SEGURIDAD: ");
        int codigoSeguridad = entrada.nextInt();
        tarjetaDebito.setCodigoDeSeguridad(codigoSeguridad);
        entrada.nextLine();
        System.out.print("\nENTIDAD EMISORA: ");
        String entidadEmisora = entrada.nextLine();
        tarjetaDebito.setEntidadEmisora(entidadEmisora);
        System.out.print("\nFECHA DE INICIO: ");
        String fechaInicio = entrada.nextLine();
        tarjetaDebito.setFechaInicio(fechaInicio);
        System.out.print("\nFECHA DE VENCIMIENTO: ");
        String fechaVencimiento = entrada.nextLine();
        tarjetaDebito.setFechaVencimiento(fechaVencimiento);
          System.out.print("\n¿ESTA SEGURO DE REALIZAR LA COMPRA? SI - NO");
        System.out.print("\n\nCONFIRMACION DE PAGO = ");
        String opcion = entrada.nextLine();
        boolean confirmacion = ConfirmacionDePago(opcion);
        FormaPago formaPago = new FormaPago();
        formaPago.setTarjetaDebito(tarjetaDebito);
        Pago pago = new Pago(1, formaPago, 56234,confirmacion);
        OrdenPaga ordenPaga = new OrdenPaga();
        ordenPaga.setPago(pago);
        if (confirmacion) {
        System.out.println(pago);

        JSON_MAPPER.writeValue(new File("C:/Users/Usuario/Documents/NetBeansProjects/OpenShop_cobranza1/FormaDePago.json"), pago);
        }

    }

    public static boolean ConfirmacionDePago (String opcion){
        boolean Resultado = false;
        
        if("si".equals(opcion)){
            Resultado = true;
        }
        return Resultado;
    }
   
    public static void leerOrdenCompra() {

        try {

            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:/Users/Usuario/Documents/NetBeansProjects/OpenShop_cobranza1/FormaDePago.json"));

            for (Object object : jsonArray) {
                JSONObject config = (JSONObject) object;
                
                System.out.println("\nCLIENTE\n");
                String nombre = (String) config.get("Nombre");
                System.out.println("NOMBRE: " + nombre);
                String apellido = (String) config.get("Apellido");
                System.out.println("APELLIDO: " + apellido);
                String email = (String) config.get("email");
                System.out.println("EMAIL: " + email);
                String dni = (String) config.get("DNI");
                System.out.println("DNI: " + dni);
                String domicilio = (String) config.get("Domicilio");
                System.out.println("DOMICILIO: " + domicilio);
                String provincia = (String) config.get("Provincia");
                System.out.println("NOMBRE: " + provincia);
                
                String fechaVenta = (String) config.get("FechaVenta");
                System.out.println("\nFECHA VENTA: " + fechaVenta);
                String monto = (String) config.get("Monto");
                System.out.println("MONTO: " + monto);
                               
                System.out.println("\nPRODUCTO\n");
                String idProducto = (String) config.get("idProducto");
                System.out.println("IdPRODUCTO: " + idProducto);
                String Nombre = (String) config.get("nombre");
                System.out.println("NOMBRE: " + Nombre);
                String descripcion = (String) config.get("Descripcion");
                System.out.println("DESCRIPCION: " + descripcion);
                String marca = (String) config.get("Marca");
                System.out.println("MARCA: " + marca);
                String Precio = (String) config.get("Precio");
                System.out.println("PRECIO: " + Precio);
                String cantidad = (String) config.get("Cantidad");
                System.out.println("CANTIDAD: " + cantidad);  
            }

        } catch (Exception e) {
            System.out.println("Excepcion leyendo fichero de configuracion " + e);
        }
    }
}
