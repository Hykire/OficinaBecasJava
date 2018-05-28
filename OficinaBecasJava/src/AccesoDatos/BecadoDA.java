package AccesoDatos;

import Modelo.Persona;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MMiltonCM
 */
public class BecadoDA {

    public Persona buscarUsuario(String user, String pass) {
        String driverName = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/";
        String dbName = "inf282g6";
        String userName = "inf282g6";
        String password = "Nk2ewy";
        Connection con = null;
        Persona persona = null;
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(urlDB + dbName, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT ID_USUARIO,ID_TIPOUSUARIO "
                    + "FROM inf282g6.USUARIO "
                    + "WHERE NOMBRE_USUARIO='" + user + "' AND CONTRASENIA='" + pass + "';");
            if (rs.first()) {
                if ((rs.getInt("ID_TIPOUSUARIO")) == 1) {
                    int id = rs.getInt("ID_USUARIO");
                    Statement st2 = con.createStatement();
                    ResultSet rs2 = st2.executeQuery("SELECT * FROM inf282g6.PERSONA "
                            + "WHERE ID_USUARIO=" + id + ";");
                    persona = new Persona();
                    if (rs2.next()) {
                        persona.setId_persona(rs2.getInt(1));
                        persona.setId_usuario(rs2.getInt(2));
                        persona.setNombre(rs2.getString(4));
                        persona.setApellidos(rs2.getString(5));
                        persona.setCodigoPUCP(rs2.getInt(3));
                        persona.setDni(rs2.getInt(7));
                        persona.setCorreo(rs2.getString(10));
                        persona.setTelfMovil(rs2.getString(12));
                    }
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persona;
    }
}
