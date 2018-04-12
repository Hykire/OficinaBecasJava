package Modelo;

/**
 *
 * @author MMiltonCM
 */
public class Financiador {
    private int id_financiador;
    private String nombre;
    private String razonSocial;
    private long RUC;
    private String tipo_institucion;
    private String pag_web ;
    private String email;
    private int telefono;
    
    public Financiador() {
    }
    
    public int getIdFinanciador() {
        return id_financiador;
    }

    public void setIdFinanciador(int idFinanciador) {
        this.id_financiador = idFinanciador;
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

    public long getRUC() {
        return RUC;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }
    
    public void setTipo_institucion(String tipo_institucion){
        this.tipo_institucion=tipo_institucion;
    }
    public String getTipo_institucion(){
        return this.tipo_institucion;
    }
    
    public void setPag_web(String pag_web){
        this.pag_web=pag_web;
    }
    public String getPag_web(){
        return this.pag_web;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}
