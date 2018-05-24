/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.BecadoDA;
import Modelo.Persona;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JUNNIOR
 */
public class Login_usuarioController extends AnchorPane implements Initializable {

    @FXML
    Label prueba;
    @FXML
    JFXTextField txtusuario;
    @FXML
    JFXTextField txtpass;

    private BecadoDA becadoData;
    public static int IDselec = 0;

    @FXML
    private void loginMenu(ActionEvent event) throws IOException {
        /*becadoData = new BecadoDA();
        String usuario = txtusuario.getText();
        String pass = txtpass.getText();
        Persona P = becadoData.buscarUsuario(usuario, pass);
        if (P != null) {
            IDselec = P.getIdPersona();*/
            Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Menu_Principal.fxml"));
            Scene Menu_scene = new Scene(loader);
            Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Menu_stage.setScene(Menu_scene);
            Menu_stage.show();
        //}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        becadoData = new BecadoDA();
    }

}
