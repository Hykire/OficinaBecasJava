package Modelo;

public class Especialidad {
    private int id_espec;
    private String nomb_espec;
    private int id_facultad;

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public void setId_espec(int id_espec){
        this.id_espec=id_espec;
    }
    public void setNomb_espec(String nomb_espec){
        this.nomb_espec=nomb_espec;
    }
    
    public int getId_espec(){
        return this.id_espec;
    }
    public String getNomb_espec(){
        return this.nomb_espec;
    }
}
