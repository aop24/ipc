/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AOLIPER
 */
public class SelecmodoController implements Initializable {

    @FXML
    private Button aleatorio;
    @FXML
    private Button selec;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pulsadoIniciar(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/preguntas/aleatorio.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("PÁGINA INICIAL");
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void pregnorm(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/preguntas/norm.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("PÁGINA INICIAL");
        stage.setScene(scene);
        stage.show();
    }
    
}
