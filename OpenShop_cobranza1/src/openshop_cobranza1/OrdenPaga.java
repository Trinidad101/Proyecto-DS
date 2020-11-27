
package openshop_cobranza1;

public class OrdenPaga {
    
    private Pago pago;
//    private OrdenCompra ordenCompra;
    private String idVenta;

    public String toString() {
        return "OrdenPaga{" + "\npago= " + pago + "\n idVenta=" + idVenta + '}';
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String value) {
        this.idVenta = value;
    }
    
    
    
    
    
}
