/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Andre_Pando
 */
public class Tutor extends Persona {

    private ArrayList<Becado> lstBecados;
    private int idTutor;
    private ArrayList<Cita> lstCitas;
    public Tutor(){
        lstCitas = new ArrayList<Cita>();
        lstBecados = new ArrayList<Becado>();
    }
    
    public void añadirBecado(Becado b){
        lstBecados.add(b);
    }
    public void añadirCita(Cita c){
        lstCitas.add(c);
    }

    public Becado buscarBecado(int codBecado){
        Becado becado1;
        becado1 = new Becado();
        //codigo
        
        return becado1;
    }
    /**
     * @param idTutor the idTutor to set
     */
    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }
    /**
     * @return the idTutor
     */
    public int getIdTutor() {
        return idTutor;
    }
    
    /**
     * @return the lstBecados
     */
    public ArrayList<Becado> getLstBecados() {
        return lstBecados;
    }

    /**
     * @param lstBecados the lstBecados to set
     */
    public void setLstBecados(ArrayList<Becado> lstBecados) {
        this.lstBecados = lstBecados;
    }
    
    

    /**
     * @return the lstCitas
     */
    public ArrayList<Cita> getLstCitas() {
        return lstCitas;
    }

    /**
     * @param lstCitas the lstCitas to set
     */
    public void setLstCitas(ArrayList<Cita> lstCitas) {
        this.lstCitas = lstCitas;
    }
}
