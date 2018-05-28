/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Andre_Pando
 */
public class Cita {

    

    private int id_Cita;
    private int id_Tutor;
    private int id_Becado;
     
    private Date fecha;
    private String observacion;
    private String Lugar;

    public int getId_Cita() {
        return id_Cita;
    }

    public void setId_Cita(int id_Cita) {
        this.id_Cita = id_Cita;
    }

    public int getId_Tutor() {
        return id_Tutor;
    }

    public void setId_Tutor(int id_Tutor) {
        this.id_Tutor = id_Tutor;
    }

    public int getId_Becado() {
        return id_Becado;
    }

    public void setId_Becado(int id_Becado) {
        this.id_Becado = id_Becado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    
    
}
