package Modelo;

/**
 *
 * @author MMiltonCM
 */
public class Becado {

    private int id_becado;
    private int id_persona;
    private int id_especialidad_ingreso;
    private String ciclo_ingreso;
    private String tipo_grupo;

    public int getId_becado() {
        return id_becado;
    }

    public void setId_becado(int id_becado) {
        this.id_becado = id_becado;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_especialidad_ingreso() {
        return id_especialidad_ingreso;
    }

    public void setId_especialidad_ingreso(int id_especialidad_ingreso) {
        this.id_especialidad_ingreso = id_especialidad_ingreso;
    }

    public String getCiclo_ingreso() {
        return ciclo_ingreso;
    }

    public void setCiclo_ingreso(String ciclo_ingreso) {
        this.ciclo_ingreso = ciclo_ingreso;
    }

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }

    
    
}
