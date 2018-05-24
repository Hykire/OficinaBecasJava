package Modelo;

/**
 *
 * @author MMiltonCM
 */
public class BecaRequest {
    private String Ciclo;
    private int idBeca;
    private String BecaN;
    private String Entidad;
    private String Observaciones;
    private String Tutor;

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    public int getIdBeca() {
        return idBeca;
    }

    public void setIdBeca(int idBeca) {
        this.idBeca = idBeca;
    }

    public String getBecaN() {
        return BecaN;
    }

    public void setBecaN(String BecaN) {
        this.BecaN = BecaN;
    }

    public String getEntidad() {
        return Entidad;
    }

    public void setEntidad(String Entidad) {
        this.Entidad = Entidad;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getTutor() {
        return Tutor;
    }

    public void setTutor(String Tutor) {
        this.Tutor = Tutor;
    }
    
    
}
