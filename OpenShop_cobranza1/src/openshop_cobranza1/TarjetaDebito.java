
package openshop_cobranza1;

import java.util.Scanner;

public class TarjetaDebito {
    
     private long numeroDeTarjeta;
    private String nombreTitular;
    private int codigoDeSeguridad;
    private String entidadEmisora;
    private String fechaInicio;
    private String fechaVencimiento;

//    public TarjetaDebito(long numeroDeTarjeta, String nombreTitular, int codigoDeSeguridad, String entidadEmisora, String fechaInicio, String fechaVencimiento) {
//        this.numeroDeTarjeta = numeroDeTarjeta;
//        this.nombreTitular = nombreTitular;
//        this.codigoDeSeguridad = codigoDeSeguridad;
//        this.entidadEmisora = entidadEmisora;
//        this.fechaInicio = fechaInicio;
//        this.fechaVencimiento = fechaVencimiento;
//    }

    
    public long getNumeroDeTarjeta() {
        return numeroDeTarjeta;
    }

    public void setNumeroDeTarjeta(long numeroDeTarjeta) {
        this.numeroDeTarjeta = numeroDeTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getCodigoDeSeguridad() {
        return codigoDeSeguridad;
    }

    public void setCodigoDeSeguridad(int codigoDeSeguridad) {
        this.codigoDeSeguridad = codigoDeSeguridad;
    }

    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    public void setEntidadEmisora(String entidadEmisora) {
        this.entidadEmisora = entidadEmisora;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
     public void registrarNuevaTarjetaDebito (){
       
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("\nNUMERO DE TARJETA: ");
       numeroDeTarjeta = entrada.nextInt();
       entrada.nextLine();
       System.out.print("\nNOMBRE DEL TITULAR: ");
       nombreTitular = entrada.nextLine();
       System.out.print("\nCODIGO DE SEGURIDAD: ");
       codigoDeSeguridad = entrada.nextInt();
       entrada.nextLine();
       System.out.print("\nENTIDAD EMISORA: ");
       entidadEmisora = entrada.nextLine();
       System.out.print("\nFECHA DE INICIO: ");
       fechaInicio = entrada.nextLine();
       System.out.print("\nFECHA DE VENCIMIENTO: ");
       fechaVencimiento = entrada.nextLine();
   }

    public String toString() {
        return "INFORMACION TARJETA DEBITO{" + "\nNUMERO DE TARJETA= " + numeroDeTarjeta + "\nNOMBRE DEL TITULAR= " + nombreTitular + "\nCODIGO DE SEGURIDAD= " + codigoDeSeguridad + "\nENTIDAD EMISORA= " + entidadEmisora + "\nFECHA DE INICIO= " + fechaInicio + "\nFECHA DE VENCIMIENTO= " + fechaVencimiento + '}';
    }
     
     
}
