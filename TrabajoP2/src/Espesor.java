
public class Espesor {
    private double rendimientoBolsa;
    private double precio;
    private String descripcion;

    public Espesor(String descripcion, double rendimientoBolsa, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.rendimientoBolsa = rendimientoBolsa;
    }

    public double getRendimientoBolsa() {
        return rendimientoBolsa;
    }

    public void setRendimientoBolsa(double rendimientoBolsa) {
        this.rendimientoBolsa = rendimientoBolsa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString ()
    {
        return  descripcion + "\tRendimiento bolsa: " + rendimientoBolsa + " \tprecio: " + precio;
    }
}
