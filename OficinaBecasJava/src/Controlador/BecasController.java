package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.sql.*;
import java.io.*;

/**
 * FXML Controller class
 *
 * @author MMiltonCM
 */
public class BecasController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void volverHome(ActionEvent event) throws IOException {

        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Menu_Principal.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @FXML
    private void verTutor(ActionEvent event) throws IOException {
        cargarTutor();
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Tutor.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    @FXML
    private void mouseverTutorClicked(MouseEvent event) throws IOException {
        cargarTutor();
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Tutor.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    private void cargarTutor() {
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
            ResultSet rs = st.executeQuery("select data from Imagenes");
            int i = 0;
            while (rs.next()) {
                InputStream in = rs.getBinaryStream(1);
                OutputStream f = new FileOutputStream(new File("src/Imagenes/tutorE.jpg"));
                i++;
                int c = 0;
                while ((c = in.read()) > -1) {
                    f.write(c);
                }
                f.close();
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
