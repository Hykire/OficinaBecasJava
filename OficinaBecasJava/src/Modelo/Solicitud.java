package Modelo;
import java.util.Date;

/**
 *
 * @author MMiltonCM
 */
public class Solicitud {
    private String idPostulacion;
    private Persona Postulante;
    private Date fechaRegistrada;
    private Beca Beca;

    public Solicitud() {
    }
    
    public String getIdPostulacion() {
        return idPostulacion;
    }

    public void setIdPostulacion(String idPostulacion) {
        this.idPostulacion = idPostulacion;
    }

    public Persona getPostulante() {
        return Postulante;
    }

    public void setPostulante(Persona Postulante) {
        this.Postulante = Postulante;
    }

    public Date getFechaRegistrada() {
        return fechaRegistrada;
    }

    public void setFechaRegistrada(Date fechaRegistrada) {
        this.fechaRegistrada = fechaRegistrada;
    }

    public Beca getBeca() {
        return Beca;
    }

    public void setBeca(Beca Beca) {
        this.Beca = Beca;
    }
}