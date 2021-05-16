/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nesrine
 */
public class InAgriController implements Initializable {

    @FXML
    private FontAwesomeIconView Minimize;
    @FXML
    private FontAwesomeIconView Close;
    @FXML
    private FontAwesomeIconView Restore;
    @FXML
    private Button btnAccueil;
    @FXML
    private Button btnVache;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnDosMed;
    @FXML
    private Button btnStat;
    @FXML
    private Button btnNotif;
    @FXML
    private Button btnSettings;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Minimize(MouseEvent event) {
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.setIconified(true);
    }

    @FXML
    private void Restore(MouseEvent event) {
        
        
    }
    
    @FXML
    private void Close(MouseEvent event) {
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.close();
    }

    
    
}
