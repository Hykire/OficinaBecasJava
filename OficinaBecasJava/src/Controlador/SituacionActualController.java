/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.SituacionDA;
import Modelo.SituacionRequest;
import Vista.LoginBecario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class SituacionActualController extends AnchorPane implements Initializable {

    private SituacionDA situacionDatos;
    
    @FXML private Label txtproblemas;
    @FXML private TableView<SituacionRequest> tablasituacion;
    @FXML private TableColumn<SituacionRequest,String> colsansion;
    @FXML private TableColumn<SituacionRequest,String> coldescripcion;
    @FXML private TableColumn<SituacionRequest,String> coltutor;
    
    @FXML private void volverHome(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Menu_Principal.fxml"));
        Scene Menu_scene = new Scene (loader);
        Stage Menu_stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        situacionDatos = new SituacionDA();
        ObservableList<SituacionRequest> listaSituaciones = situacionDatos.listarSituaciones(LoginBecario.Becado.getId_persona());
        colsansion.setCellValueFactory(new PropertyValueFactory<>("Sansion"));
        coldescripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
        coltutor.setCellValueFactory(new PropertyValueFactory<>("Tutor"));
        tablasituacion.setItems(listaSituaciones);
        if(listaSituaciones.size()>0){
            txtproblemas.setText("De Presentarse algun problema acercarse a su Facultad para resolverlo");
        }
    }    
    
}
