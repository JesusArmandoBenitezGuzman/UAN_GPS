package modelo;

public class EntidadCalificacion {
    String nocontrol;
    String clave;
    String calificacion;

    public EntidadCalificacion() {
    }

    public EntidadCalificacion(String nocontrol, String clave, String calificacion) {
        this.nocontrol = nocontrol;
        this.clave = clave;
        this.calificacion = calificacion;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
}
