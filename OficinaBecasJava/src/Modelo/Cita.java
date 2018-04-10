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

    private int idCita;
    private Date cita;
    private String descripción;
    private String Lugar;
    
    public Cita(){
        
    }
    
    /**
     * @return the idCita
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * @param idCita the idCita to set
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     * @return the cita
     */
    public Date getCita() {
        return cita;
    }

    /**
     * @param cita the cita to set
     */
    public void setCita(Date cita) {
        this.cita = cita;
    }

    /**
     * @return the descripción
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * @param descripción the descripción to set
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    /**
     * @return the Lugar
     */
    public String getLugar() {
        return Lugar;
    }

    /**
     * @param Lugar the Lugar to set
     */
    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    
    
    
}
