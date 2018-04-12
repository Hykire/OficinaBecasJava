package Modelo;

/**
 *
 * @author MMiltonCM
 */
public class Becado {

    private int id_becado;
    private String nombreApoderado;
    private String dirPadre;
    private String telefPadre;
    private String correoPadre;
    private String expediente;
    private String estadoDebe;

    public Becado() {
    }
    
    public int getId_becado(){
        return id_becado;
    }
    
    
    public void setId_becado(int id_becado){
        this.id_becado = id_becado;
    }
    
    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public String getDirPadre() {
        return dirPadre;
    }

    public void setDirPadre(String dirPadre) {
        this.dirPadre = dirPadre;
    }

    public String getTelefPadre() {
        return telefPadre;
    }

    public void setTelefPadre(String telefPadre) {
        this.telefPadre = telefPadre;
    }

    public String getCorreoPadre() {
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        this.correoPadre = correoPadre;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getEstadoDebe() {
        return estadoDebe;
    }

    public void setEstadoDebe(String estadoDebe) {
        this.estadoDebe = estadoDebe;
    }
    
    
}
