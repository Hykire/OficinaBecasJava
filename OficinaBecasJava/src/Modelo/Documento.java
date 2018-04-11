package Modelo;

/**
 *
 * @author hedu09
 */
import java.util.*;

public class Documento{

    
	private int id_doc;
	private String nombre_doc;
	private String descripcion_doc;
	private Date fecha_doc;
	private String estado_doc;

	//SET
	public void setid_doc(int id_doc){
		this.id_doc=id_doc;
	}
	public void setnombre_doc(String nombre_doc){
		this.nombre_doc=nombre_doc;
	}
	public void setdescripcion_doc(String descripcion_doc){
		this.descripcion_doc=descripcion_doc;
	}
	public void setestado_doc(String estado_doc){
		this.estado_doc=estado_doc;
	}

	//GET
	public int getid_doc(){
		return id_doc;
	}
	public String getnombre_doc(){
		return nombre_doc;
	}
	public String getdescripcion_doc(){
		return descripcion_doc;
	}
	public String getestado_doc(){
		return estado_doc;
	}
        /**
        * @return the fecha_doc
        */
        public Date getFecha_doc() {
            return fecha_doc;
         }

         /**
        * @param fecha_doc the fecha_doc to set
        */
        public void setFecha_doc(Date fecha_doc) {
            this.fecha_doc = fecha_doc;
        }
}