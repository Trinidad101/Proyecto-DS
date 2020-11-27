
package openshop_cobranza1;

public class Efectivo {
    
    private String nombreDeCliente;
    private long numeroDePago;
    private String fechaDePago;

  
    public String getNombreDeCliente() {
        return nombreDeCliente;
    }

    public void setNombreDeCliente(String value) {
        this.nombreDeCliente = value;
    }

    public long getNumeroDePago() {
        return numeroDePago;
    }

    public void setNumeroDePago(long value) {
        this.numeroDePago = value;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(String value) {
        this.fechaDePago = value;
    }

  
    public String toString() {
        return "Efectivo{" + "\n\tNOMBRE DE CLIENTE= " + nombreDeCliente + "\n\tNUMERO DE PAGO= " + numeroDePago + "\n\tFECHA DE PAGO = " + fechaDePago + '}';
    }
    
    
}
