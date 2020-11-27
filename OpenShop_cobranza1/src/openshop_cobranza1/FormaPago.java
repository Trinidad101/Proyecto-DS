
package openshop_cobranza1;



public class FormaPago {
    
//    private OrdenCompra ordenCompra;
    private Efectivo efectivo;
    private TarjetaCredito tarjetaCredito;
    private TarjetaDebito tarjetaDebito;
     
        
    public Efectivo getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Efectivo efectivo) {
        this.efectivo = efectivo;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public TarjetaDebito getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

   
    public String toString() {
        return "FormaPago{" + "efectivo=" + efectivo + ", tarjetaCredito=" + tarjetaCredito + ", tarjetaDebito=" + tarjetaDebito + '}';
    }
}
