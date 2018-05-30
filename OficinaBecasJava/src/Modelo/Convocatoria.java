package Modelo;

public class Convocatoria {
    private int id_Convocatoria;
    private String nombre_beca;
    private String financiador_beca;
    private String nombre;
    private String descripcion;
    private String FechaInicio;
    private String FechaFin;
    private String vacantes;
    private String ciclo;

    public int getId_Convocatoria() {
        return id_Convocatoria;
    }

    public void setId_Convocatoria(int id_Convocatoria) {
        this.id_Convocatoria = id_Convocatoria;
    }

    public String getNombre_beca() {
        return nombre_beca;
    }

    public void setNombre_beca(String nombre_beca) {
        this.nombre_beca = nombre_beca;
    }

    public String getFinanciador_beca() {
        return financiador_beca;
    }

    public void setFinanciador_beca(String financiador_beca) {
        this.financiador_beca = financiador_beca;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getVacantes() {
        return vacantes;
    }

    public void setVacantes(String vacantes) {
        this.vacantes = vacantes;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
