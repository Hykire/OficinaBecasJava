package Modelo;

/**
 *
 * @author hedu09
 */
public class Especialidad {
    private int id_espec;
    private String nomb_espec;
    
    //set
    public void setId_espec(int id_espec){
        this.id_espec=id_espec;
    }
    public void setNomb_espec(String nomb_espec){
        this.nomb_espec=nomb_espec;
    }
    //get
    public int getId_espec(){
        return this.id_espec;
    }
    public String getNomb_espec(){
        return this.nomb_espec;
    }
}
