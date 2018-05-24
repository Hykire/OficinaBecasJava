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
    public Persona buscarUsuario(String user, String pass){
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
            ResultSet rs = st.executeQuery("SELECT id_Persona,nombre,ape_pa,ape_ma,id_usuario "
                    + "FROM inf282g6.Persona P JOIN inf282g6.Usuario U ON idUsuario=id_usuario "
                    + "WHERE U.nombre_usuario='"+user+"' AND U.clave_usuario='"+pass+"';");
            while (rs.next()) {
                persona = new Persona();
                int id = rs.getInt("id_Persona");
                String nombre = rs.getString("nombre");
                String apepa = rs.getString("ape_pa");
                String apema = rs.getString("ape_ma");
                persona.setIdPersona(id);
                persona.setNombre(nombre);
                persona.setApellidos(apepa+" "+apema);
                Usuario u = new Usuario();
                u.setUsuario(user);
                u.setPasword(pass);
                persona.setUsuarioP(u);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persona;
    }
}
