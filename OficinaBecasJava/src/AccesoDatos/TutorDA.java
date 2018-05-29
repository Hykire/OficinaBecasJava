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
    
    public Persona buscarTutor(int id){
        String driverName = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/";
        String dbName = "inf282g6";
        String userName = "inf282g6";
        String password = "Nk2ewy";
        Connection con = null;
        Persona tutor = new Persona();
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(urlDB + dbName, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT P.* FROM inf282g6.PERSONA P, inf282g6.TUTOR T "+
                    "WHERE P.ID_PERSONA=T.ID_PERSONA AND T.ID_TUTOR=" + id + ";");
            while (rs.next()) {
                tutor.setNombre(rs.getString("NOMBRES"));
                tutor.setApellidos(rs.getString("APELLIDOS"));
                tutor.setCorreo(rs.getString("CORREO_PUCP"));
                tutor.setCodigoPUCP(rs.getInt("CODIGO_PUCP"));
                tutor.setTelfMovil(rs.getString("TELF_MOVIL"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tutor;
    }
}
