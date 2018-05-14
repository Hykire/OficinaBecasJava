package AccesoDatos;

import Modelo.Persona;
import Modelo.Tutor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MMiltonCM
 */
public class TutorDA {

    public static int idSeleccionado = 0;

    public void cargarImagenTutor(int id) {
        String driverName = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/";
        String dbName = "inf282g6";
        String userName = "inf282g6";
        String password = "Nk2ewy";
        Connection con = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(urlDB + dbName, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select data from Imagenes where idImagenes = " + id + ";");
            while (rs.next()) {
                InputStream in = rs.getBinaryStream(1);
                OutputStream f = new FileOutputStream(new File("src/Imagenes/tutor" + id + ".jpg"));
                int c = 0;
                while ((c = in.read()) > -1) {
                    f.write(c);
                }
                f.close();
                in.close();
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Tutor buscarTutor(int id){
        String driverName = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/";
        String dbName = "inf282g6";
        String userName = "inf282g6";
        String password = "Nk2ewy";
        Connection con = null;
        Tutor tutor = new Tutor();
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(urlDB + dbName, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM inf282g6.Tutor JOIN inf282g6.Persona ON "+
                    "Tutor.persona=Persona.id_Persona WHERE Tutor.persona=" + id + ";");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("ape_pa");
                String apellidoM = rs.getString("ape_ma");
                String correo = rs.getString("correo");
                String profesion = rs.getString("profesion");
                String especialidad = rs.getString("especialidad");
                int telf = rs.getInt("telefono");
                tutor.setNombre(nombre);
                tutor.setApellidos(apellidoP+" "+apellidoM);
                tutor.setCorreo(correo);
                tutor.setEspecialidad(especialidad);
                tutor.setProfesion(profesion);
                tutor.setTelfMovil(telf);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tutor;
    }
}
