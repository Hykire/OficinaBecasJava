package Modelo;

/**
 *
 * @author MMiltonCM
 */
public class Financiador {
    private String idFinanciador;
    private String nombre;
    private String razonSocial;
    private String RUC;

    public Financiador() {
    }
    
    public String getIdFinanciador() {
        return idFinanciador;
    }

    public void setIdFinanciador(String idFinanciador) {
        this.idFinanciador = idFinanciador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
    
}
