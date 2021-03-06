/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.LoginBecario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUNNIOR
 */
public class Menu_PrincipalController extends AnchorPane implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    Label txtsaludo;

    @FXML
    private void mouseSesionCerrar(MouseEvent event) throws IOException {
        LoginBecario.Becado = null;
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Login_usuario.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @FXML
    private void mouseDetalleBecaClicked(MouseEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Becas.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    @FXML
    private void mouseMibecaClicked(MouseEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/SituacionActual.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    @FXML
    private void mouseRecomendacionClicked(MouseEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Recomendaciones.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtsaludo.setText("Bienvenido " + LoginBecario.Becado.getNombre()
                + " " + LoginBecario.Becado.getApellidos());
    }

}
