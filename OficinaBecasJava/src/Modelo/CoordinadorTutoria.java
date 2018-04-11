package Modelo;

import java.util.*;

public class CoordinadorTutoria extends Persona{
	private List<Tutor> tutores;
	
	public CoordinadorTutoria(){}
	
	public void setTutores(List<Tutor> tutores){
		this.tutores = tutores;
	}
	
	public List<Tutor> getTutores(){
		return tutores;
	}
	
	public void agregarTutor(Tutor tutor){
		tutores.add(tutor);
	}	
}