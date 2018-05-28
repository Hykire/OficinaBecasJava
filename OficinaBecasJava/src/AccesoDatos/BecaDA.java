package AccesoDatos;

import Modelo.Beca;
import Modelo.BecaRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author MMiltonCM
 */
public class BecaDA {
    public ObservableList<BecaRequest> listarBecas(int persona){
        ObservableList<BecaRequest> becas = FXCollections.observableArrayList();
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
            ResultSet rs = st.executeQuery("SELECT BC.NOMBRE_BECA, BC.FINANCIADOR, P.NOMBRES, "
                    + "P.APELLIDOS, T.ID_TUTOR, BC.ID_BECA, BXB.CICLO, BC.DESCRIPCION FROM inf282g6.BECADO BD, "
                    + "inf282g6.BECA BC, inf282g6.TUTOR T, inf282g6.BECADO_X_BECA BXB, "
                    + "inf282g6.PERSONA P WHERE BXB.ID_BECADO=BD.ID_BECADO AND BXB.ID_TUTOR=T.ID_TUTOR AND"
                    + " T.ID_PERSONA=P.ID_PERSONA AND BXB.ID_BECA=BC.ID_BECA AND BD.ID_PERSONA="+persona+";");
            while (rs.next()) {
                BecaRequest br = new BecaRequest();
                String nombre = rs.getString("NOMBRES");
                String apellido = rs.getString("APELLIDOS");
                br.setCiclo(rs.getString("CICLO"));
                br.setIdBeca(rs.getInt("ID_BECA"));
                br.setBecaN(rs.getString("NOMBRE_BECA"));
                br.setEntidad(rs.getString("FINANCIADOR"));
                br.setTutor(rs.getString("ID_TUTOR"));
                br.setDescripcion(rs.getString("DESCRIPCION"));
                br.setTutor(nombre+" "+apellido);
                becas.add(br);
            }
            con.close();
         }catch(Exception e){
             e.printStackTrace();
         }
        return becas;
    }
    
}
