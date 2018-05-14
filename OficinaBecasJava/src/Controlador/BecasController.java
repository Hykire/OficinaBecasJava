package Controlador;

import AccesoDatos.TutorDA;
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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author MMiltonCM
 */
public class BecasController extends AnchorPane implements Initializable {

    private TutorDA tutorDatos;
    
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
        tutorDatos.cargarImagenTutor(1);
        TutorDA.idSeleccionado = 1;
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Tutor.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @FXML
    private void mouseverTutorClicked(MouseEvent event) throws IOException {
        tutorDatos.cargarImagenTutor(1);
        TutorDA.idSeleccionado = 1;
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Tutor.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tutorDatos = new TutorDA();
    }

}
