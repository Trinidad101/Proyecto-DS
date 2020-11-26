
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String empresa;
    private String domicilioObra;
    private String email;
    private int telefono;

    public Cliente(String nombre, String apellido, String empresa, String domicilioObra, String email, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.domicilioObra = domicilioObra;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDomicilioObra() {
        return domicilioObra;
    }

    public void setDomicilioObra(String domicilioObra) {
        this.domicilioObra = domicilioObra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String toString (){
        return "Nombre: " + nombre + "\tApellido: " + apellido + " \tEmpresa: " + empresa + " \tDomicilio: " + domicilioObra + " \tEmail: " + email + "  \tTelefono: " + telefono;
     }
}
