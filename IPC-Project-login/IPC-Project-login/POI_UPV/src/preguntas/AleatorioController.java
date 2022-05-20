/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preguntas;

import DBAccess.NavegacionDAOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.Answer;
import model.Navegacion;
import model.Problem;

/**
 * FXML Controller class
 *
 * @author AOLIPER
 */
public class AleatorioController implements Initializable {

    @FXML
    private Text enunciado;
    private int cont=0;
    @FXML
    private Button solA;
    @FXML
    private Button solB;
    @FXML
    private Button solC;
    @FXML
    private Button solD;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<Problem> p = Navegacion.getSingletonNavegacion().getProblems();
            Object[] s = p.toArray();
            for(int i = 0;i<=s.length-1;i++){
                cont++;
            }
            double g = Math.random() * cont;
            g = (int) g;
            Problem h = p.get((int) g);
            enunciado.setText(h.toString());
            List<Answer> i = Navegacion.getSingletonNavegacion().getProblems().get(0).getAnswers();
            Object[] q = i.toArray();
            int l = (int)Math.random();
            int j = l*4;
            q[0] = q[j];
            solA.setText(((Answer)q[0]).getText());
            solB.setText(((Answer)q[1]).getText());
            solC.setText(((Answer)q[2]).getText());
            solD.setText(((Answer)q[3]).getText());
        } catch (NavegacionDAOException ex) {
            Logger.getLogger(AleatorioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void botA(MouseEvent event) {
    }

    @FXML
    private void botB(MouseEvent event) {
    }

    @FXML
    private void botC(MouseEvent event) {
    }

    @FXML
    private void botD(MouseEvent event) {
    }
    
}
