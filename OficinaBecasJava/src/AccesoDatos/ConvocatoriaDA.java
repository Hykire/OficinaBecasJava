package AccesoDatos;

import Modelo.Beca;
import Modelo.BecaRequest;
import Modelo.Convocatoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ConvocatoriaDA {
    public ObservableList<Convocatoria> listarConvocatorias(){
        ObservableList<Convocatoria> convocatorias = FXCollections.observableArrayList();
        String driverName = "com.mysql.jdbc.Driver";
        String urlDB = "jdbc:mysql://quilla.lab.inf.pucp.edu.pe/";
        String dbName = "inf282g6";
        String userName = "inf282g6";
        String password = "Nk2ewy";
        Connection con = null;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         try {
            Class.forName(driverName);
            con = DriverManager.getConnection(urlDB + dbName, userName, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT B.NOMBRE_BECA, B.FINANCIADOR, C.NOMBRE_CONVOCATORIA,"
                    + "C.CICLO_CONVOCATORIA, C.CANTIDAD_CANDIDATOSPREVISTOS ,C.FECHA_INICIO, C.FECHA_FIN, "
                    + "C.DESCRIPCION_CONVOCATORIA, C.CANTIDAD_SELECCIONADOS FROM inf282g6.CONVOCATORIA C,"
                    + " inf282g6.BECA B WHERE B.ID_BECA=C.ID_BECA;");
            while (rs.next()) {
                Convocatoria cv = new Convocatoria();
                cv.setNombre_beca(rs.getString("NOMBRE_BECA"));
                cv.setFinanciador_beca(rs.getString("FINANCIADOR"));
                cv.setNombre(rs.getString("NOMBRE_CONVOCATORIA"));
                cv.setCiclo(rs.getString("CICLO_CONVOCATORIA"));
                cv.setDescripcion(rs.getString("DESCRIPCION_CONVOCATORIA"));           
                cv.setFechaInicio(df.format(rs.getDate("FECHA_INICIO")));
                cv.setFechaFin(df.format(rs.getDate("FECHA_FIN")));
                cv.setVacantes(String.valueOf(rs.getInt("CANTIDAD_CANDIDATOSPREVISTOS")-rs.getInt("CANTIDAD_SELECCIONADOS")));
                convocatorias.add(cv);
            }
            con.close();
         }catch(Exception e){
             e.printStackTrace();
         }
        return convocatorias;
    }
}
