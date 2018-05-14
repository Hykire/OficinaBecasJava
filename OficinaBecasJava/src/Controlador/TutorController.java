/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.TutorDA;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author alulab14
 */
public class TutorController extends AnchorPane implements Initializable {

    private TutorDA TutorDatos;
    private Tutor tutorSeleccionado;

    @FXML
    private ImageView imagen;
    @FXML
    private Label txtnombre;
    @FXML
    private Label txtapellidos;
    @FXML
    private Label txtprofesion;
    @FXML
    private Label txtcelular;
    @FXML
    private Label txtespecialidad;
    @FXML
    private Label txtcorreo;

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
        try {
            String urlImg = "Imagenes/tutor" + idTutor + ".jpg";
            Image foto = new Image(urlImg);
            imagen.setImage(foto);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en cargar imagen");
        }
        tutorSeleccionado = TutorDatos.buscarTutor(idTutor);
        txtnombre.setText(" " + tutorSeleccionado.getNombre());
        txtapellidos.setText(" " + tutorSeleccionado.getApellidos());
        txtprofesion.setText(" " + tutorSeleccionado.getProfesion());
        txtcelular.setText(" " + String.valueOf(tutorSeleccionado.getTelfMovil()));
        txtespecialidad.setText(" " + tutorSeleccionado.getEspecialidad());
        txtcorreo.setText(" " + tutorSeleccionado.getCorreo());
    }

}
