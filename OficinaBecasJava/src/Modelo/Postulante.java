public class Postulante extends persona{
	
	private float promedio;
	private float craest;
	private int ciclo;
	private float porcentajeMerito;
	private int escala;
	
	public Postulante(){}
	
	public void setPromedio(float promedio){
		this.promedio = promedio;
	}
	
	public float getPromedio(){
		return promedio;
	}
	
	public void setCraest(float craest){
		this.craest = craest;
	}
	
	public float getCraest(){
		return craest;
	}
	
	public void setCiclo(int ciclo){
		this.ciclo = ciclo;
	}
	
	public int getCiclo(){
		return ciclo;
	}
	
	public void setPorcentajeMerito(float porcentajeMerito){
		this.porcentajeMerito = porcentajeMerito;
	}
	
	public float getPorcentajeMerito(){
		return porcentajeMerito;
	}
	
	public void setEscala(int escala){
		this.escala = escala;
	}
	
	public int getEscala(){
		return escala;
	}
	
}