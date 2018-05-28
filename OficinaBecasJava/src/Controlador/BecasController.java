package Controlador;

import AccesoDatos.TutorDA;
import AccesoDatos.BecaDA;
import Modelo.BecaRequest;
import Vista.LoginBecario;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author MMiltonCM
 */
public class BecasController extends AnchorPane implements Initializable {

    @FXML
    TableView<BecaRequest> dgv;
    @FXML
    TableColumn<BecaRequest, String> columnaCiclo;
    @FXML
    TableColumn<BecaRequest, String> columnaBeca;
    @FXML
    TableColumn<BecaRequest, String> columnaEntidad;
    @FXML
    TableColumn<BecaRequest, String> columnaTutor;
    @FXML
    TextField txtnombre;
    @FXML
    TextArea txtdescripcion;
    @FXML
    TextField txtentidad;

    private TutorDA tutorDatos;
    private BecaDA becaDatos;

    @FXML
    private void mouseClicked(MouseEvent event) throws IOException {
        int indice = dgv.getSelectionModel().getSelectedIndex();
        BecaRequest br = dgv.getSelectionModel().getSelectedItem();
        if (indice != -1) {
            txtnombre.setText(br.getBecaN());
            txtdescripcion.setText(br.getDescripcion());
            txtentidad.setText(br.getEntidad());
        }
    }

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
        tutorDatos.cargarImagenTutor(2);
        TutorDA.idSeleccionado = 2;
        Parent loader = FXMLLoader.load(getClass().getClassLoader().getResource("Vista/Tutor.fxml"));
        Scene Menu_scene = new Scene(loader);
        Stage Menu_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Menu_stage.setScene(Menu_scene);
        Menu_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tutorDatos = new TutorDA();
        becaDatos = new BecaDA();
        ObservableList<BecaRequest> listaBecas = becaDatos.listarBecas(LoginBecario.Becado.getId_persona());
        columnaCiclo.setCellValueFactory(new PropertyValueFactory<>("Ciclo"));
        columnaBeca.setCellValueFactory(new PropertyValueFactory<>("BecaN"));
        columnaEntidad.setCellValueFactory(new PropertyValueFactory<>("Entidad"));
        columnaTutor.setCellValueFactory(new PropertyValueFactory<>("Tutor"));
        dgv.setItems(listaBecas);
    }

}
