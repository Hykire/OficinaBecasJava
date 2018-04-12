package Modelo;
import java.util.Date;

/**
 *
 * @author MMiltonCM
 */
public class Solicitud {
    private String id_solicitud;
    private Persona Postulante;
    private Date fecha_soli;
    private Beca beca;
    private String estado_becario;
    private String estado_progreso;
    
    public Solicitud() {
    }
    
    public String getIdPostulacion() {
        return id_solicitud;
    }

    public void setIdPostulacion(String id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Persona getPostulante() {
        return Postulante;
    }

    public void setPostulante(Persona Postulante) {
        this.Postulante = Postulante;
    }

    public Date getFechaRegistrada() {
        return fecha_soli;
    }

    public void setFechaRegistrada(Date fecha_soli) {
        this.fecha_soli = fecha_soli;
    }

    public Beca getBeca() {
        return beca;
    }

    public void setBeca(Beca beca) {
        this.beca = beca;
    }
    public String getEstado_becario() {
        return estado_becario;
    }

    public void setEstado_becario(String estado_becario) {
        this.estado_becario = estado_becario;
    }
    public String getEstado_progreso() {
        return estado_progreso;
    }

    public void setEstado_progreso(String estado_progreso) {
        this.estado_progreso = estado_progreso;
    }
}