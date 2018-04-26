/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/*
 *
 * @author JUNNIOR
 */
public class MenuController implements Initializable {
   
    /**
     * Initializes the controller class.
     */
    public ImageView homeView,closeView;
    //@FXML private void 
   @FXML private void mouseDetalleBecaClicked(MouseEvent event) throws IOException {
              
        Parent loader = FXMLLoader.load(getClass().getResource("Login_user.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
     
   }
   
   @FXML private void mouseMibecaClicked(MouseEvent event) throws IOException {
              
        Parent loader = FXMLLoader.load(getClass().getResource("Login_user.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
     
   }
   @FXML private void mouseTutorClicked(MouseEvent event) throws IOException {
              
        Parent loader = FXMLLoader.load(getClass().getResource("Login_user.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
     
   }

   @FXML private void mouseRecomendacionClicked(MouseEvent event) throws IOException {
              
        Parent loader = FXMLLoader.load(getClass().getResource("Login_user.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
     
   }
   @FXML private void mouseHome(MouseEvent event) throws IOException {
              
        Parent loader = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
     
   }
   
   @FXML private void mouseClose(MouseEvent event) throws IOException {
        
   }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

           
    
}
