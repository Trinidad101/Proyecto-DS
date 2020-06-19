
package tpractico2;

public class Espesor {
       private double RendimientoBolsa;
    private double precio;
    private String descripcion;

    public Espesor(String descripcion, double precio, double RendimientoBolsa) {
        this.RendimientoBolsa = RendimientoBolsa;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getRendimientoBolsa() {
        return RendimientoBolsa;
    }

    public void setRendimientoBolsa(double RendimientoBolsa) {
        this.RendimientoBolsa = RendimientoBolsa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
