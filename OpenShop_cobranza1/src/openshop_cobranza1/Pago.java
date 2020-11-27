
package openshop_cobranza1;

import java.util.ArrayList;


public class Pago {
    
    private int idCompra;
    private FormaPago formaPago;
    private double monto;
    private boolean confirmacionPago = false; 
            
    public Pago(int idCompra, FormaPago formaPago , double monto, boolean confirmacionPago) {
        this.idCompra = idCompra;
        this.formaPago = formaPago;
        this.monto = monto;
        this.confirmacionPago = confirmacionPago;
        
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isConfirmacionPago() {
        return confirmacionPago;
    }

    public void setConfirmacionPago(boolean confirmacionPago) {
        this.confirmacionPago = confirmacionPago;
    }
    

    public String toString() {
        return "\nID COMPRA= " + idCompra + "\nFORMA DE PAGO= " + formaPago + "\nMONTO= " + monto + "\nCONFIRMACION DE PAGO= " + confirmacionPago;
    }
    
    }
