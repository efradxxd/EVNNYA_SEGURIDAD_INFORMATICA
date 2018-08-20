/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evnnya_psic;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lucia
 */
public class FXMLDatosPsicController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    JFXButton btnComenzarEvaluacion;
    
    @FXML
    void formatoTerapia(ActionEvent event) {
        try{
            FXMLLoader nuevaVentana= new FXMLLoader(getClass().getResource("FXMLFormatoPsic.fxml"));
            Parent padre= (Parent)nuevaVentana.load();
            Stage escenario= new Stage();
            escenario.setScene(new Scene(padre));
            escenario.setResizable(false);
            escenario.sizeToScene();
            escenario.show();
        }catch(Exception e){
        
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
