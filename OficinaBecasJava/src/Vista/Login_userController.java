/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
public class Login_userController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private AnchorPane rootpane;

    //Aqui se llama a otra ventana
    @FXML private void loginButtonAction(ActionEvent event) throws IOException{
        
        Parent Menu_Parent = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene Menu_scene = new Scene (Menu_Parent);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
    }    
    
}
