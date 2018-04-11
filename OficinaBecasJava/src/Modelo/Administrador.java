package Modelo;

import java.util.*;
public class Administrador extends Persona{
	private Date fechaContrato;
	private List<Solicitud> solicitudesAprobadas;
	private List<Solicitud> solicitudesRechazadas;
	
	public Administrador(){
		solicitudesAprobadas = new ArrayList<Solicitud>();
		solicitudesRechazadas = new ArrayList<Solicitud>();
	}
	
	public void setFechaContrato(Date fechaContrato){
		this.fechaContrato = fechaContrato;
	}
	
	public Date getFechaContrato(){
		return fechaContrato;
	}
	
	public void setSolicitudesAprobadas(List<Solicitud> solicitudesAprobadas){
		this.solicitudesAprobadas = solicitudesAprobadas;
	}
	
	public List<Solicitud> getSolicitudesAprobadas(){
		return solicitudesAprobadas;
	}
	
	public void setSolicitudesRechazadas(List<Solicitud> solicitudesRechazadas){
		this.solicitudesRechazadas = solicitudesRechazadas;
	}
	
	public List<Solicitud> getSolicitudesRechazadas(){
		return solicitudesRechazadas;
	}
	
	public void aprobarSolicitud(Solicitud solicitud){};
	
	public void rechazarSolicitud(Solicitud solicitud){};
	
	public void RegistrarBecario(){};
        
        public void AsignarPerfil(){
            
        }
}