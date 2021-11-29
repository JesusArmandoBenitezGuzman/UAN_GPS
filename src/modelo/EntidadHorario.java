package modelo;

public class EntidadHorario {
    String nocontrol;
    String semestre;
    String clave;

    public EntidadHorario() {
    }

    public EntidadHorario(String nocontrol, String semestre, String clave) {
        this.nocontrol = nocontrol;
        this.semestre = semestre;
        this.clave = clave;
    }

    public String getNocontrol() {
        return nocontrol;
    }

    public void setNocontrol(String nocontrol) {
        this.nocontrol = nocontrol;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
