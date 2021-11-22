package modelo;

public class EntidadCarrera {
    String idcarrera;
    String nombre;

    public EntidadCarrera() {
    }

    public EntidadCarrera(String idcarrera, String nombre) {
        this.idcarrera = idcarrera;
        this.nombre = nombre;
    }

    public String getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(String idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
