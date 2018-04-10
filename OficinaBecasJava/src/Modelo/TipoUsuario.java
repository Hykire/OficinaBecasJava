/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Yoluana
 */
public class TipoUsuario {
    private int idUsuario;
    private String descripUsuario;
    private String nombreTipoUs;

    public TipoUsuario(){
        
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDescripUsuario() {
        return descripUsuario;
    }

    public void setDescripUsuario(String descripUsuario) {
        this.descripUsuario = descripUsuario;
    }

    public String getNombreTipoUs() {
        return nombreTipoUs;
    }

    public void setNombreTipoUs(String nombreTipoUs) {
        this.nombreTipoUs = nombreTipoUs;
    }
    
    
    
}
