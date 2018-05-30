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
    private int idTutor;
    private String Tutor;
    private String Descripcion;

    public String getCiclo() {
        return Ciclo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getTutor() {
        return Tutor;
    }

    public void setTutor(String Tutor) {
        this.Tutor = Tutor;
    }
    
    
}
