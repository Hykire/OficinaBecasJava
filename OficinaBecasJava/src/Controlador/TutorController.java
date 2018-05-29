package Controlador;

import AccesoDatos.TutorDA;
import Modelo.Persona;
import Modelo.Tutor;
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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class TutorController extends AnchorPane implements Initializable {

    private TutorDA TutorDatos;
    private Tutor tutorSeleccionado;

    @FXML
    private ImageView imagen;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtapellidos;
    @FXML
    private TextField txtcelular;
    @FXML
    private TextField txtcodigo;
    @FXML
    private TextField txtcorreo;

    @FXML
    private void volverBecas(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Becas.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int idTutor = TutorDA.idSeleccionado;
        TutorDatos = new TutorDA();
        Persona tutor = TutorDatos.buscarTutor(idTutor);
        /*try {
            String urlImg = "Imagenes/tutor" + idTutor + ".jpg";
            Image foto = new Image(urlImg);
            imagen.setImage(foto);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en cargar imagen");
        }*/
        txtnombre.setText(" " + tutor.getNombre());
        txtapellidos.setText(" " + tutor.getApellidos());
        txtcelular.setText(" " + String.valueOf(tutor.getTelfMovil()));
        txtcodigo.setText(" " + String.valueOf(tutor.getCodigoPUCP()));
        txtcorreo.setText(" " + tutor.getCorreo());
    }

}
