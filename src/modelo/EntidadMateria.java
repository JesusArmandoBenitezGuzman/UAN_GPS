package modelo;

public class EntidadMateria {
    String clave;
    String materia;
    String idmaestro;

    public EntidadMateria() {
    }

    public EntidadMateria(String clave, String nombre, String idmaestro) {
        this.clave = clave;
        this.materia = nombre;
        this.idmaestro = idmaestro;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return materia;
    }

    public void setNombre(String nombre) {
        this.materia = nombre;
    }

    public String getIdmaestro() {
        return idmaestro;
    }

    public void setIdmaestro(String idmaestro) {
        this.idmaestro = idmaestro;
    }
    
    
    
}