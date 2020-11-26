
public class Cotizacion {
    
    private Material material;
    private double metrosCuadrados;

   
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    
    public Double ObtenerCotizacion(){
        Double precioCotizacion = 0.0;
        Double cantidadBolsas = this.metrosCuadrados / 4.5;
        
        precioCotizacion= this.material.getPrecio()*cantidadBolsas;
        return precioCotizacion;
    }
}
