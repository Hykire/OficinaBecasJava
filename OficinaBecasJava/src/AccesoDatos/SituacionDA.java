package AccesoDatos;

import Modelo.SituacionRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SituacionDA {
    public ObservableList<SituacionRequest> listarSituaciones(int persona){
        ObservableList<SituacionRequest> listasituaciones = FXCollections.observableArrayList();
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
            ResultSet rs = st.executeQuery("SELECT BXB.SANSION_TIPO, TXB.OBSERVACION, P.NOMBRES, P.APELLIDOS " +
           "FROM inf282g6.BECADO_X_BECA BXB, inf282g6.TUTOR_X_BECADO TXB, inf282g6.TUTOR T, inf282g6.PERSONA P," +
           " inf282g6.BECADO BC WHERE TXB.ID_BECADO=BXB.ID_BECADO AND TXB.CICLO=BXB.CICLO AND TXB.ID_TUTOR=T.ID_TUTOR " +
           "AND T.ID_PERSONA=P.ID_PERSONA AND BXB.ID_BECADO=BC.ID_BECADO AND BC.ID_PERSONA="+persona+
           " AND BXB.SANSION_TIPO IS NOT NULL;");
            while (rs.next()) {
                SituacionRequest sr = new SituacionRequest();
                sr.setSansion(rs.getString("SANSION_TIPO"));
                sr.setDescripcion(rs.getString("OBSERVACION"));
                sr.setTutor(rs.getString("NOMBRES")+" "+rs.getString("APELLIDOS"));
                listasituaciones.add(sr);
            }
            con.close();
         }catch(Exception e){
             e.printStackTrace();
         }
        return listasituaciones;
    }
}
