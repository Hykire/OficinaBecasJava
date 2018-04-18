package Modelo;

/**
 *
 * @author hedu09
 */
import java.util.*;

public class Beca{
	private int id_beca;
	private String nombre_beca;
	private String descrip_beca;
	private Date fecha_creacion;
	private Date fecha_modificacion;

	private String tipo_beca; //postulantes, estudiantes
	private String fecha_convocatoria; //abierta, sin convocatoria, todo el años
	private String estado_beca; //bloqueada, en espera...
	
	private Date fecha_inicio;
	private Date fecha_cierre;
	
	private List<Especialidad> lts_espc; 
	private Financiador finan;
	private List<Documento> lst_doc;

	public Beca(){
		lts_espc =new ArrayList<Especialidad>();
		lst_doc =new ArrayList<Documento>();
                finan = new Financiador();
	}
	//SET'S
	public void setid_beca(int id_beca){
		this.id_beca=id_beca;
	}
	public void setnombre_beca(String nombre_beca){
		this.nombre_beca=nombre_beca;
	}
	public void setdescrip_beca(String descrip_beca){
		this.descrip_beca=descrip_beca;
	}
	public void settipo_beca(String tipo_beca){
		this.tipo_beca=tipo_beca;
	}
	public void setfecha_convocatoria(String fecha_convocatoria){
		this.fecha_convocatoria=fecha_convocatoria;
	}
	public void setestado_beca(String estado_beca){
		this.estado_beca=estado_beca;
	}
	public void setfinanciador(Financiador finan){
		this.finan=finan;
	}
	//GET'S
	public int getid_beca(){
		return id_beca;
	}
	public String getnombre_beca(){
		return nombre_beca;
	}
	public String getdescrip_beca(){
		return descrip_beca;
	}
	public String gettipo_beca(){
		return tipo_beca;
	}
	public String getfecha_convocatoria(){
		return fecha_convocatoria;
	}
	public String getestado_beca(){
		return estado_beca;
	}
	public Financiador getfinanciador(){
		return finan;
	}
	//
	public void agregarDoc(Documento D){
		this.lst_doc.add(D);
	}
	public void agregarEsp(Especialidad E){
		this.lts_espc.add(E);
	}
}
