package AccesoDatos;

import Modelo.BecaRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MMiltonCM
 */
public class BecaDA {
    public ArrayList<BecaRequest> listarBecas(int persona){
        ArrayList<BecaRequest> becas = new ArrayList<BecaRequest>();    
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
            ResultSet rs = st.executeQuery("select S.ciclo_solicitud, B.id_beca, B.nombre_beca, P.nombre, P.ape_pa, B.Financiador " +
                                            "from inf282g6.Beca B, inf282g6.SolicitudBeca S, inf282g6.Becado_x_Tutor BT,"
                                            + " inf282g6.Becado C, inf282g6.Tutor T, inf282g6.Persona P " +
                                              "where BT.idBecado=C.id_Becado AND "
                                            + "BT.idTutor = T.id_tutor AND P.id_Persona=T.persona"
                                            + " AND P.id_Persona="+persona+" ;");
            while (rs.next()) {
                BecaRequest br = new BecaRequest();
                String ciclo = rs.getString("ciclo_solicitud");
                int id = rs.getInt("id_beca");
                String beca = rs.getString("nombre_beca");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("ape_pa");
                String financiador = rs.getString("Financiador");
                br.setCiclo(ciclo);
                br.setIdBeca(id);
                br.setBecaN(beca);
                br.setEntidad(financiador);
                br.setObservaciones("");
                br.setTutor(nombre+apellido);
                becas.add(br);
            }
            con.close();
         }catch(Exception e){
             e.printStackTrace();
         }
        return becas;
    }
}
