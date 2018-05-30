/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import AccesoDatos.ConvocatoriaDA;
import Modelo.Convocatoria;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RecomendacionesController extends AnchorPane implements Initializable {

    private ConvocatoriaDA convocatoriaDatos;

    @FXML
    private TableView<Convocatoria> tablaconvocatoria;
    @FXML
    private TextArea txtdescripcion;
    @FXML
    private TableColumn<Convocatoria, String> colbeca;
    @FXML
    private TableColumn<Convocatoria, String> colciclo;
    @FXML
    private TableColumn<Convocatoria, String> colfinan;
    @FXML
    private TableColumn<Convocatoria, String> colconvoc;
    @FXML
    private TableColumn<Convocatoria, String> colvacan;
    @FXML
    private TableColumn<Convocatoria, String> colfini;
    @FXML
    private TableColumn<Convocatoria, String> colffin;

    @FXML
    private void moverDescripcion(MouseEvent event) throws IOException {
        int indice = tablaconvocatoria.getSelectionModel().getSelectedIndex();
        Convocatoria cv = tablaconvocatoria.getSelectionModel().getSelectedItem();
        if (indice != -1) {
            txtdescripcion.setText(cv.getDescripcion());
        }
    }
    
    @FXML
    private void volverHome(javafx.event.ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Menu_Principal.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        convocatoriaDatos = new ConvocatoriaDA();
        txtdescripcion.editableProperty().set(false);
        ObservableList<Convocatoria> listaConvocatorias = convocatoriaDatos.listarConvocatorias();
        colbeca.setCellValueFactory(new PropertyValueFactory<>("nombre_beca"));
        colciclo.setCellValueFactory(new PropertyValueFactory<>("ciclo"));
        colfinan.setCellValueFactory(new PropertyValueFactory<>("financiador_beca"));
        colconvoc.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colvacan.setCellValueFactory(new PropertyValueFactory<>("vacantes"));
        colfini.setCellValueFactory(new PropertyValueFactory<>("FechaInicio"));
        colffin.setCellValueFactory(new PropertyValueFactory<>("FechaFin"));
        tablaconvocatoria.setItems(listaConvocatorias);
    }

}
