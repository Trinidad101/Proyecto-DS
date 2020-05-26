package javaapplication31;

public class Pago {
    private String modoPago;
   

    public Pago(String modoPago) {
        this.modoPago = modoPago;
    }

    public String getModoPago() {
        return modoPago;
    }

    public void setModoPago(String modoPago) {
        this.modoPago = modoPago;
    }

    public String toString() {
        return (modoPago);
    }
}
