
package javaapplication31;

public class Usuario {
    
    private String nombre;
    private String direccion;
    private String email;
    private String contraseña;

    public Usuario(String nombre, String direccion, String email, String contraseña) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String toString() {
        return (nombre);
    }
}
