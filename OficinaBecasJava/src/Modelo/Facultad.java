package Modelo;

public class Facultad {
    private int idFacultad; //Puede ser string
    private String nombre;
    private String pabellon;
    
    public int getIdFacultad() {
        return idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setIdFacultad(int idFacultad) {
        this.idFacultad = idFacultad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }
}
